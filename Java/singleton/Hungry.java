package Java.singleton;

// 饿汉式单例
public class Hungry {

    /**
     * 不存在线程安全的问题，因为只有在类加载的时候创建一次对象，
     * 没有其他地方创建
     * */

    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }

}
