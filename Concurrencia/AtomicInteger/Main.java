package Concurrencia.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        AtomicInteger counter = new AtomicInteger(0);
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Incrementor(counter));
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].interrupt();
        }

        System.out.println("Counter value: " + counter.get());
        System.out.println("Ejecución finalizada");
    }
}
