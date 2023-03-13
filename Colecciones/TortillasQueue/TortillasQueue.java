package TortillasQueue;

import java.util.LinkedList;
import java.util.Queue;

// "Primero en entrar, primero en salir", donde el primer elemento se empuja a la cola o "En cola" y el mismo elemento cuando tiene que ser eliminado de la cola es "Dequeued".
public class TortillasQueue {
    public TortillasQueue() {
        
    }

    Queue<String> queue = new LinkedList<String>();
    
    public void offer(String string) {
        //Insertar un elemento a la cola
        queue.add(string);
    }

    public void peek() {
        //Obtener el primer elemento (de la parte superior) sin eliminarlo
        System.out.println("El primero en la cola es " + queue.peek());
    }

    public void poll() {
        //Obtener el primer elemento (de la parte superior) y lo remueve de la cola
        System.out.println(queue.poll() + " paga y se retira de la cola");
    }

    public int sizeQueue() {
        return queue.size();
    }

    public void travelQueue() {
        while (!queue.isEmpty()) {
            peek();
            poll();
        }
    }
}
