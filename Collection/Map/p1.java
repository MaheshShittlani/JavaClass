//HashMap
import java.util.*;
class HashMapDemo1{
	public static void main(String args[]){
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Ram",20000);
		hm.put("Shyam",10000);
		hm.put("kk",12000);
		hm.put("Tim",12300);
		
		//Get the set of entries
		Set<Map.Entry<String,Integer>> set=hm.entrySet();
		//Display the set
		Iterator<Map.Entry<String,Integer>> itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry<String,Integer> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		//Deposit 1000 in kk account
		int bal = hm.get("kk");
		hm.put("kk",bal+1000);
		System.out.println("After deposit 1000 into kk account balance: "+hm.get("kk"));
	}
}