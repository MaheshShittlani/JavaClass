//Use of iterator and toString()
import java.util.*;
class ArrayListDemo3{
	public static void main(String args[]){
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("C");
		a1.add("K");
		a1.add("A");
		a1.add("G");
		System.out.println("Contents after addition: "+a1);
		System.out.println("Contets of arraylist using iterator...");
		Iterator itr=a1.iterator();
		int i=1;
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
			if(i==3){
				itr.remove();
			//	itr.remove();fail fast behaivor
			}
			i++;
		}
		System.out.println("\nContents using foreach loop....");
		for(String item:a1){
			System.out.print(item+" ");
		}
	}
}