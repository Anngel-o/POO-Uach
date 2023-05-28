public class Main {
    public static void main(String[] args) {
        // //main: se creara una instancia de GenericLinkedList con el tipo que se
        // desee, se añadirán 3 elementos a la lista y se mostraran los elementos con el
        // método showGenericList.

        try {
            GenericLinkedList<String> genericLinkedList = new GenericLinkedList<String>();
            genericLinkedList.stack("Charizard");
            // genericLinkedList.stack(1);
            // genericLinkedList.stack(1.5);
            genericLinkedList.showGenericList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
