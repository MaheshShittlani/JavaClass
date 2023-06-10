import java.util.HashSet;

import java.util.Comparator;
class Student implements Comparable<Student>{
	private int roll;
	private String name;

	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student o) {
		return this.roll - o.roll;
	}

	@Override
	public String toString() {
		return roll + " - " + name;
	}

    @Override
    public int hashCode() {
        return roll;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student s = (Student)obj;
            return this.hashCode() == s.hashCode();
        }
        return false;
    }
}


class ReverseSortByRoll implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o2.getRoll() - o1.getRoll();
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
public class p6 {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(10);
        intSet.add(11);
        intSet.add(101);
        intSet.add(1);
        System.out.println(intSet);


        String s1 = new String("Tiger");
        String s2 = s1;
        String s3 = "Tiger";
        HashSet<String> strSet = new HashSet<>();
        strSet.add("alex");
        strSet.add("clark");
        strSet.add("elise");
        strSet.add("tony");
        strSet.add("alex");
        strSet.add(s1);
        strSet.add(s2);
        strSet.add(s3);
        System.out.println(strSet);

        HashSet<Student> hs = new HashSet<>();
        
        hs.add(new Student(101, "Alex"));
        hs.add(new Student(102, "Clark"));
        hs.add(new Student(103, "Tony"));
        hs.add(new Student(101, "Alex"));


        System.out.println(hs);
    }
}
