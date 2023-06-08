//Use of Comparator for TreeSet or TreeMap, This is total order comparasion
import java.util.*;
class Student implements Comparable<Student>{
	private int roll;
	private String name;

	public Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public int getRoll(){
		return roll;
	}
	public int compareTo(Student s){
		return name.compareTo(s.getName());//String class implements the Comparable,so objects can be compare
	}
	//Try without overriding toString(), to understand the importance of toString()
	public String toString(){
		return roll+" "+name;
	}
}
class ReverseSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s2.getName().compareTo(s1.getName());
	}
}
class SortRollWise implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return (s1.getRoll()-s2.getRoll());
	}
}
class TreeSetDemo3{
	public static void main(String args[]){
		TreeSet<Student> ts=new TreeSet<Student>();
		ts.add(new Student(109,"Clark"));
		ts.add(new Student(110,"Alex"));
		ts.add(new Student(101,"Joe"));
		ts.add(new Student(117,"Kim"));
		System.out.println(ts);
		
		TreeSet<Student> ts1=new TreeSet<Student>(new ReverseSort());
		ts1.add(new Student(109,"Clark"));
		ts1.add(new Student(110,"Alex"));
		ts1.add(new Student(101,"Joe"));
		ts1.add(new Student(117,"Kim"));
		System.out.println(ts1);
 		
		TreeSet<Student> ts2=new TreeSet<Student>(new SortRollWise());
		ts2.add(new Student(109,"Clark"));
		ts2.add(new Student(110,"Alex"));
		ts2.add(new Student(101,"Joe"));
		ts2.add(new Student(117,"Kim"));
		System.out.println(ts2);		
		
	}
}
