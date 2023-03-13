package MapaLibros;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookStore {
    public static void main(String[] args) {
        Map<Integer, Book> mapBooks = new LinkedHashMap<Integer, Book>();

        Book book1 = new Book(2, 1955, "Pedro Páramo", "Juan Rulfo", "Fondo de Cultura Económica");
        Book book2 = new Book(14, 1943, "El Principito", "Antoine de Saint-Exupéry", "Reynal & Hitchcock");
        Book book3 = new Book(6, 1945, "Rebelión en la Granja", "George Orwell", "Editorial Porrúa");

        mapBooks.put(1, book1);
        mapBooks.put(2, book2);
        mapBooks.put(3, book3);

        //Se mantiene Orden de Inserción
        Iterator it = mapBooks.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Llave: " + key + ", valor: " + mapBooks.get(key));
            System.out.println();
        }

        // for (Map.Entry<Integer, Book> m : mapBooks.entrySet()) {
        //     System.out.println(m.getKey() + " " + m.getValue());
        // }
    }
}
