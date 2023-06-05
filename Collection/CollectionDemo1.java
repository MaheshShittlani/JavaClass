import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();

        System.out.println("Collection isEmpty? "+c1.isEmpty());
        c1.add("Berlin");
        c1.add("London");
        c1.add("France");
        System.out.println("C1: "+c1);
        System.out.println("Size : "+c1.size());

        Collection<String> c2 = new ArrayList<>();
        c2.add("Mosko");
        c2.add("Tokyo");

        System.out.println("C2: "+c2);
        c1.addAll(c2);
        System.out.println("C1: "+c1);

        System.out.println("C1 is the subset of c2? "+c1.containsAll(c2));
        // c1.retainAll(c2);
        // System.out.println("C1: "+c1);


        c1.removeAll(c2);
        System.out.println("C1: "+c1);



        String[] arr = new String[4];
        c1.toArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}