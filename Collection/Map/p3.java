//TreeMap
import java.util.*;
class TreeMapDemo1{
	public static void main(String args[]){
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("C",60);
		tm.put("C++",45);
		tm.put("DSA",60);
		tm.put("Java",60);
		tm.put("Adobe Dreamweaver",5);
		tm.put("J2EE",60);
		tm.put("php++",60);
		tm.put("Adobe PhotoShop",30);
		
		System.out.println("Access treemap using entry...");
		Set<String> set=tm.keySet();
		for(String key:set){
			System.out.println(key+"=>"+tm.get(key));
		}
	}
}