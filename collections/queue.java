import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;




public class queue {
public static void main(String[] args) {
    List<Integer> lst = new ArrayList<>();

    lst.add(1);
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(4);
    lst.add(4);
    lst.add(5);

    @SuppressWarnings("rawtypes")
    Set st = new HashSet<>(lst);
    
    
    // for (Integer num : lst) {
    //     if (!lst2.contains(num)) {
    //         lst2.add(num);
    //     }
    // }

    @SuppressWarnings("unchecked")
    List<Integer> lst2 = new ArrayList<>(st);

    @SuppressWarnings("rawtypes")
    Iterator ite = lst2.iterator();

    while (ite.hasNext()) {
        System.out.println(ite.next());
    }

 }   
}
