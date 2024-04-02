package Java.thread;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadCreate extends Thread{
    static AtomicInteger num = new AtomicInteger(0);
    @Override
    public void run() {
        num.getAndAdd(1);
    }

    public static void main(String[] args) {
        ThreadCreate threadCreate = new ThreadCreate();
        threadCreate.add();
        System.out.println(num.get());
    }

    public void add() {
        for (int i = 0; i < 100; i++) {
            new ThreadCreate().start();
        }

        for (int i = 0; i < 100; i++) {
            new ThreadCreate().start();

        }
    }
}
