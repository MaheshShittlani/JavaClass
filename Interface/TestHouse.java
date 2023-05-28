import java.util.Date;

public class TestHouse {
    public static void main(String[] args) throws CloneNotSupportedException {
        House h1 = new House(101, 2000);
        House h2 = h1; // Shallow Copy

        House h3 = new House(101, 2000);

        System.out.println(h1 == h2); // true

        System.out.println(h1 == h3); // false

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));

        House h4 = (House)h1.clone();
        
        System.out.println(h1 == h4);
        System.out.println(h1.getCreatedDate() == h4.getCreatedDate());
    }
}
