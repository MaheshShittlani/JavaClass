//Stack class
import java.util.*;
class StackDemo1{
	public static void main(String args[]){
		Stack<Integer> st=new Stack<Integer>();
		System.out.println(st);
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		System.out.println("Top element: "+st.peek());
		System.out.println("Now stack: "+st);
		System.out.println("Removing top element: "+st.pop());
		System.out.println("After removing top element: "+st);
	}
}