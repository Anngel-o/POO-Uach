package Concurrencia.ConcurrentLinkedQueue;

public class Productor extends Thread{
    private Buffer buffer;
    private final String letters = "abcdefghijklmnopqrstuvwxyz";
    
    public Productor(Buffer buffer){
        super();
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                char c = letters.charAt((int) (Math.random() * letters.length()));
                String s = charToString(c);
                buffer.produce(s);
                System.out.println("Elemento: " + s);

                sleep((int) (Math.random() * 100));
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }

    private String charToString(char c) {
        return String.valueOf(c);
    }
}
