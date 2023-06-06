//vector class
import java.util.*;
class VectorDemo1{
	public static void main(String args[]){
		Vector<Integer> v=new Vector<Integer>(3,2);
		System.out.println("Initial size: "+v.size());
		System.out.println("Initial Capacity: "+v.capacity());
		
		v.addElement(3);
		v.addElement(1);
		v.addElement(4);
		v.addElement(6);
		v.addElement(9);
		v.addElement(5);
		System.out.println("Capacity after adding 6 elements: "+v.capacity());
		
		System.out.println(v.contains(4)?"4 exists":"4 not exists");
		
		Enumeration e=v.elements();
		System.out.println("\nAccessing vector elements using enumeration...");
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("\nAccessing vector elements using iterator...");
		Iterator itr=v.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nAccessing vectro elements using foreach loop...");
		for(int i:v){
			System.out.print(i+" ");
		}
	}
}