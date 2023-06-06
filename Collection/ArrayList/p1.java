import java.util.*;
class ArrayListDemo1{
	public static void main(String []args){
		ArrayList a1=new ArrayList();
		System.out.println("Initial Size: "+a1.size());
		a1.add("C");
		a1.add("A");
		a1.add("K");
		a1.add("G");
		a1.add("T");
		a1.add("H");
		a1.add(1,"A2");
		a1.add(new Integer(22));
		System.out.println("Size after addition: "+a1.size());
		System.out.println("Contents: "+a1);
		a1.remove("K");
		a1.remove(3);
		System.out.println("Size of a1 after deletion: "+a1.size());
		System.out.println("Contents after Deleteion: "+a1);
	}
}