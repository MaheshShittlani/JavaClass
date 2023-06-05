import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

public class AccessCollection {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();

        c1.add("Jaipur");
        c1.add("Udaipur");
        c1.add("Jodhpur");

        System.out.println(c1);

        System.out.println("Access using for-in loop");
        // Access using for-in Loop
        for(String item: c1) {
            System.out.println(item);
        }

        System.out.println("Access using iterator");
        // Access using iterator
        Iterator<String> itr = c1.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // using forEach
        c1.forEach(e -> System.out.println(e));
    }
}
