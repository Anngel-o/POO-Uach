package GameOfThrones;
import java.util.Comparator;

public class NameComparator implements Comparator<Character>{
    public int compare(Character c1, Character c2) {
        return c1.name.compareTo(c2.name);
    }
}
