package MapaLibros;

import java.util.Comparator;

public class IdComparator implements Comparator<Book>{

    public int compare(Book book1, Book book2) {
        if (book1.id > book2.id) {
            return 1;
        } else if (book1.id < book2.id) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
