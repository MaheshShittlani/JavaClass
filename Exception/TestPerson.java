import java.io.IOException;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        try {
            p1.setName("Alex");
            p1.setAge(-25);
            p1.display();
        } catch(AgeException e) {
            // System.out.println(e);
            // System.out.println("Root cause: "+e.getCause());
            e.printStackTrace();
        }

        try {
            p2.setName("Clark");
            p2.setAge(32);
            p2.display();

        } catch(AgeException e) {
            // System.out.println(e);
            // System.out.println("Root cause: "+e.getCause());
            e.printStackTrace();
        }
    }
}
