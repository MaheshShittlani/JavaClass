import java.util.*;
class PropertiesDemo{
	public static void main(String args[]){
		Properties capitals=new Properties();
		capitals.put("Rajasthan","Jaipur");
		capitals.put("Maharashtra","Mumbai");
		capitals.put("TamilNadu","Chennai");
		capitals.put("Uttar Pradesh","Lukhnow");
		capitals.put("Punjab","Chandigarh");
		
		Enumeration states=capitals.propertyNames();
		String state;
		while(states.hasMoreElements()){
			state=(String)states.nextElement();
			System.out.println("The capital of "+state+" is "+capitals.getProperty(state)+" .");
		}
		System.out.println();
		//Look for the state that is not found
		String st=capitals.getProperty("West Bangal","Not Found");
		System.out.println("The capital of west Bangal is "+st);
	}
}