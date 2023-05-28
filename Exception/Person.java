import java.io.IOException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    
    }

    public void setAge(int age) throws AgeException{
        if(age < 0) {
            // throw new AgeException("Invalid Age", new IOException("Invalid Input/output"));
            AgeException e = new AgeException("Invalid Age");
            e.initCause(new IOException("Invalid Input/Output"));
            throw e;
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(this.name+"  is "+ this.age +" years old");
    }
}
