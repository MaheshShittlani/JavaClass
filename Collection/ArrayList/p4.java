//use of generic and auto boxing features
import java.util.*;
class ArrayListDemo4{
	public static void main(String args[]){
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(4);
		a1.add(2);
		a1.add(6);
		//a1.add("abc");
		for(int item:a1){
			System.out.print(item+" ");
		}
	}
}