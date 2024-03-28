package Java.singleton;

//懒汉式单例
public class LazyMan {

    /**
     * 懒汉使用的时候创建对象，有线程不安全问题
     * */
    private volatile static LazyMan lazyMan;

    private LazyMan() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }



    //双重检测锁模式的懒汉式单例 DCL懒汉式
    public static LazyMan getInstance(){
        if (lazyMan == null){
            synchronized (lazyMan){
                if (lazyMan == null){
                    lazyMan = new LazyMan();
                }

            }

        }
        return lazyMan;
    }

    /**
     * 1、分配内存空间
     * 2、执行构造方法，初始化对象
     * 3、把这个对象指向这个空间
     *
     * 123
     * 132 A线程没有完成构造，B线程就拿到了一个没有构造完成的对象，所以必须给LazyMan加volatile保证禁止指令重排，使其具有有序性
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazyMan.getInstance();
            }).start();
        }
    }
}
