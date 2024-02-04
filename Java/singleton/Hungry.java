package Java.singleton;

// 饿汉式单例
public class Hungry {

    private byte[]data1 = new byte[1024*1024];
    private byte[]data2 = new byte[1024*1024];
    private byte[]data3 = new byte[1024*1024];

    private Hungry(){}

    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
