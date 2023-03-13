package MapaLibros;

public class Book implements Comparable<Book>{
    public Book(int id, int year, String name, String author, String publisher) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    int id, year;
    String name, author, publisher;

    public int compareTo(Book book) {
        if (id > book.id) { 
            return 1;
        }
        else if (id < book.id) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public String toString() {
        return "Book [id=" + id + ", year=" + year + ", name=" + name + ", author=" + author + ", publisher="
                + publisher + "]";
    }
}
