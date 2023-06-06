//ArrayList using generics
import java.util.*;
class ArrayListDemo2{
	public static void main(String args[]){
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("Initial Size: "+a1.size());
		a1.add("C");
		a1.add("A");
		a1.add("J");
		a1.add("F");
		a1.add(2,"A2");
		//a1.add(new Integer(22)); //error
		System.out.println("Size after addition: "+a1.size());
		System.out.println("Contets: "+a1);
		a1.remove("J");
		a1.remove(3);
		System.out.println("Size after deletion: "+a1.size());
		System.out.println("Contents after deleteion: "+a1);
	}
}