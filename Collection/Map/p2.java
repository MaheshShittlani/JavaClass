//HashMap
import java.util.*;
class LinkedHashMapDemo1{
	public static void main(String args[]){
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
		hm.put("Ram",20000);
		hm.put("Shyam",10000);
		hm.put("kk",12000);
		hm.put("Tim",12300);
		
		//Get the set of entries
		Set<Map.Entry<String,Integer>> set = hm.entrySet();
		System.out.println(set);
		//Display the set
		Iterator<Map.Entry<String,Integer>> itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry<String,Integer> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		//Deposit 1000 in kk account
		int bal=(Integer)hm.get("kk");
		hm.put("kk",bal+1000);
		System.out.println("After deposit 1000 into kk account balance: "+hm.get("kk"));


		LinkedHashMap<String,Integer> hm2 = new LinkedHashMap<>(16,0.75f,true);
		hm2.putAll(hm);

		hm2.put("Tim", 30000);

		System.out.println(hm2);

	}
}