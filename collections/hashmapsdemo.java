import java.util.*;

/**
 * HashMaps
 */
public class hashmapsdemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // @SuppressWarnings("rawtypes")
        // Map hm = new HashMap<>(); 

        // hm.put("Name", "abc");
        // hm.put("Rank", 1);
        // hm.put("Mark", 96.56);
        // hm.put("Name1", "abc");
        // hm.put(null, 1);
        // hm.put(5, null);

        // @SuppressWarnings("rawtypes")
        // Set st = hm.keySet();

        // @SuppressWarnings("rawtypes")
        // Iterator ite = st.iterator();

        // while (ite.hasNext()) {
        //     Object key = ite.next();
        //     Object value = hm.get(key);
        //     System.out.println(key+":"+value);
        // }
        @SuppressWarnings("rawtypes")
        Map hm1 = new HashMap<>();

        String[] st1 = {"Roll No","Name","Email-ID","sub1","sub2","sub3","Rank"};
        String[] st2 = {"st-1","abc","abc@gmail.com","98.00","97.00","96.00","A"};
        String[] st3 = {"st-2","def","def@gmail.com","95.67","94.50","94.60","B"};

        hm1.put(1, st1);
        hm1.put(2, st2);
        hm1.put(3, st3);

        @SuppressWarnings("rawtypes")
        Set st_stu = hm1.keySet();

        @SuppressWarnings("rawtypes")
        Iterator st_ite = st_stu.iterator();

        while (st_ite.hasNext()) {
            Object key = st_ite.next();

            String[] value = (String[]) hm1.get(key);

            for (String string : value) {
                System.out.print(string+"\t");
            }
            System.out.println("\n**************************************************************");
        }
     
    }
}