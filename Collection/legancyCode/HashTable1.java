import java.util.*;
class HashTableDemo1{
	public static void main(String args[]){
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		ht.put("C",60);
		ht.put("Adobe Dreamweaver",10);
		ht.put("C++",45);
		ht.put("Java",60);
		ht.put("Php",60);
		
		Enumeration<String> names=ht.keys();
		String name;
		while(names.hasMoreElements()){
			name=names.nextElement();
			System.out.println(name+"=>"+ht.get(name));
		}
		
		System.out.println();
		int duration=ht.get("C++");
		ht.put("C++",duration+15);
		System.out.println("After change C++ duration: "+ht.get("C++"));
	}
}