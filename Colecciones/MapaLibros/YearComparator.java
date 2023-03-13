package MapaLibros;

import java.util.Comparator;

public class YearComparator implements Comparator<Book>{

    public int compare(Book book1, Book book2) {
        if (book1.year > book2.year) {
            return 1;
        } else if (book1.year < book2.year) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
