package Java;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioSelectorServer {
    public static void main(String[] args) throws IOException, InterruptedException{
        //创建NIO ServerSocketChannel，与BIO的ServerSocket相似
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(9000));
        //设置ServerSocketChannel为非阻塞
        serverSocketChannel.configureBlocking(false);//为true则退化为BIO
        //打开selector处理channel，即创建epoll
        Selector selector = Selector.open();
        //把ServerSocketChannel注册到selector上，并且selector对客户端accept连接操作感兴趣
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务启动成功");


        //监听客户端
        while(true) {
            //阻塞等待需要处理的事件发生
            selector.select();

            //获取selector中注册的全部事件的SelectionKey实例
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();

            //遍历SelectionKey对事件进行处理
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                //如果是OP_ACCEPT事件，则进行连接获取和事件注册
                if (selectionKey.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel socketChannel = server.accept();
                    socketChannel.configureBlocking(false);
                    //这里只注册了读事件，如果需要给客户端发送数据可以注册写事件
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    System.out.println("客户端连接成功");
                } else if (selectionKey.isReadable()) {//如果是OP_READ事件，则进行读取和打印
                    //通过SelectionKey获取到注册的channel来读取数据
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(6);
                    int len = socketChannel.read(byteBuffer);
                    if (len > 0) {
                        System.out.println("客户端发送的数据是：" + new String(byteBuffer.array()));
                    } else if (len == -1) {
                        System.out.println("客户端断开连接");
                        socketChannel.close();
                    }
                }
                //从事件集合中删除本次处理的key，防止下次select重复处理
                iterator.remove();
            }
        }
    }
}
