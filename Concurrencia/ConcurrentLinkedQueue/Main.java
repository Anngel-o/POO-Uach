package Concurrencia.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Buffer t = new Buffer();
        Productor p = new Productor(t);
        Consumidor c = new Consumidor(t);

        p.start();
        c.start();
    }
}
