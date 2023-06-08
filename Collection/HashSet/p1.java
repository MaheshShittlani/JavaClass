//HashSet demo
import java.util.*;
class HashSetDemo1{
	public static void main(String args[]){
		HashSet<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("A");
		System.out.println(hs);
	}
}