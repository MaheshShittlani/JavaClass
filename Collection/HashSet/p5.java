import java.util.Comparator;
import java.util.TreeSet;
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

class ReverseSortByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o2.getName().compareTo(o1.getName());
	}
}
class TestStudent {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();

		ts.add(new Student(105, "Elise"));
		ts.add(new Student(103, "Mac"));
		ts.add(new Student(101, "Alia"));
		ts.add(new Student(109, "Tony"));

		System.out.println(ts);

		TreeSet<Student> ts1 = new TreeSet<>(new ReverseSortByRoll());
		ts1.addAll(ts);
		System.out.println(ts1);

		TreeSet<Student> ts2 = new TreeSet<>(new SortByName());
		ts2.addAll(ts1);
		System.out.println(ts2);

		TreeSet<Student> ts3 = new TreeSet<>(new ReverseSortByName());
		ts3.addAll(ts1);
		System.out.println(ts3);
	}
}