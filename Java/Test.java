package Java;

public class Test {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            System.out.println(number+"Thread:");
        });
        thread.start();
        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                try {
                    while (number <= 10) {
                        if (number % 3 == 1) {
                            System.out.println("ThreadA: " + number);
                            number++;
                            lock.notifyAll();
                        } else {
                            lock.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                try {
                    while (number <= 10) {
                        if (number % 3 == 2) {
                            System.out.println("ThreadB: " + number);
                            number++;
                            lock.notifyAll();
                        } else {
                            lock.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadC = new Thread(() -> {
            synchronized (lock) {
                try {
                    while (number <= 10) {
                        if (number % 3 == 0) {
                            System.out.println("ThreadC: " + number);
                            number++;
                            lock.notifyAll();
                        } else {
                            lock.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }

}

