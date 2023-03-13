package MapaLibros;

import java.util.Comparator;

public class NameComparator implements Comparator<Book>{
    public int compare(Book book1, Book book2) {
        return book1.name.compareTo(book2.name);
    } 
}
