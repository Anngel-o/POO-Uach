package Concurrencia.DeadLock;

public class Example {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1){
                System.out.println("Thread 1: locked lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }

                synchronized (lock2) {
                    System.out.println("Thread 1: locked lock2");
                }   
            }
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 2: locked lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }

                synchronized (lock2) {
                    System.out.println("Thread 2: locked lock1");
                }
            }
        }
    }
}
