package Concurrencia.ConcurrentLinkedQueue;

public class Consumidor extends Thread{
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        super();
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                String c = buffer.getS();
                buffer.collect();
                System.out.println("Consumidor eliminó: " + c);

                sleep((int) (Math.random() * 2000));
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
