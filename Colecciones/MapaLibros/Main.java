package MapaLibros;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    //Set es un conjunto //treeset // hashset //linkedhasset
    //Map es un elemento con llave y valor //treemap //hashmap // linkedhasmap

    //Tree es un árbol (se ordena naturalmente)
    //Comparator y comparable son para los tree (árboles)
    //hash no mantiene un órden lógico
    //linkedhash mantiene un órden de inserción
    public static void main(String[] args) {
        //Set<Book> set = new TreeSet<Book>(new IdComparator());
        Set<Book> set = new TreeSet<Book>(new AuthorComparator()); 

        Book book1 = new Book(2, 1955, "Pedro Páramo", "Juan Rulfo", "Fondo de Cultura Económica");
        Book book2 = new Book(14, 1943, "El Principito", "Antoine de Saint-Exupéry", "Reynal & Hitchcock");
        Book book3 = new Book(6, 1945, "Rebelión en la Granja", "George Orwell", "Editorial Porrúa");
        Book book4 = new Book(8, 1965, "Rojo Sangre", "Bernardo Juárez", "Editorial Estrella");

        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);

        //Se ordena por autor
        for (Book book : set) {
            System.out.println(book.toString());
        }
    }
}
