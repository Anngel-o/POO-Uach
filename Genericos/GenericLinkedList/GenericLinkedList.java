import java.util.*;

public class GenericLinkedList<T> {
    public GenericLinkedList() {
        this.genericList = Collections.synchronizedList(new LinkedList<T>());
    }

    public void stack(T value) {
        this.genericList.add(value);
    }

    public void showGenericList() {
        for (T value : genericList) {
            System.out.println(value);
        }
    }

    private List<T> genericList;
}
