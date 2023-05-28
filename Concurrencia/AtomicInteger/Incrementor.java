package Concurrencia.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Incrementor implements Runnable{
    private AtomicInteger counter = new AtomicInteger(0);

    public Incrementor(AtomicInteger counter) {
       this.counter = counter;
    }

    @Override
    public void run() {
        try {
            synchronized (Main.class) {
                for (int i = 0; i < 1000; i++) {
                    counter.incrementAndGet();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
