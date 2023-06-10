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

class TestStudent {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();

		ts.add(new Student(105, "Elise"));
		ts.add(new Student(103, "Mac"));
		ts.add(new Student(101, "Alia"));
		ts.add(new Student(109, "Tony"));

		System.out.println(ts);

		TreeSet<Student> ts1 = new TreeSet<>(ts);
		System.out.println(ts1);
	}
}