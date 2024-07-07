import java.util.ArrayList;
import java.util.List;

/**
 * anntotation_sample
 */
public class anntotation_sample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List lst = new ArrayList<>();
        lst.add(3);
    }
}

@FunctionalInterface
/**
 * Inneranntotation_sample
 */
interface Inneranntotation_sample {
    void show();
    // void dis();
    
}