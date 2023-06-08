//LinkeHashSet
import java.util.*;
class LinkedHashSetDemo1{
	public static void main(String args[]){
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("K");
		hs.add("G");
		hs.add("G");
		System.out.println(hs);
	}
}