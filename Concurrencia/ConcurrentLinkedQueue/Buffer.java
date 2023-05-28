package Concurrencia.ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Buffer { //Buffer o Monitor es intermediario de consumidor-productor.
    private static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    private int numElement = 0;
    //Flags
    private boolean isFull = false;
    private boolean isEmpty = true;
    private String s;

    public Buffer() {
        this.numElement = 0;
        this.isFull = false;
        this.isEmpty = true;
    }

    public String getS() {
        return s;
    }
    public void setS(String s){
        this.s = s;
    }

    public synchronized void produce(String s) {
        System.out.print(numElement + " --- ");
        while (this.isFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        numElement++;
        this.isEmpty = false;
        if (numElement == queue.size()) {
            this.isFull = true;
        }
        queue.offer(s);
        notifyAll();
    }

    public synchronized void collect() {
        while (this.isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        numElement--;
        this.isFull = false;
        if (numElement == 0) {
            this.isEmpty = true;
        }
        isEmpty = false;
        String ss = queue.poll();
        setS(ss);
        notifyAll();
    }
}
