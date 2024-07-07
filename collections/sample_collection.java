import java.util.Iterator;

/**
 * sample_collection
 */
public class sample_collection {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        java.util.List lst = new java.util.ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        

        @SuppressWarnings("rawtypes")
        Iterator ite = lst.iterator();

        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}