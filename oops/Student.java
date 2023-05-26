import java.util.Date;

public class Student {
    private int roll;
    private String name;
    private Date dateCreated;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        dateCreated = new Date(); // Current date
    }

    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
}

class TestStudent {
    public static void main(String args[]) {
        Student s1 = new Student(1101, "Alex");
    }
}


