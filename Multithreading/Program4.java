class First implements Runnable{
	private String name;
	private Thread t;
	public First(String name){
		this.name=name;
		t=new Thread(this,name);
		t.start();
	}
	public Thread getThread(){
		return t;
	}
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(name+" runs for "+i+" time");
		}
	}
}
class TestOrder{
	public static void main(String args[]){
		First obj1=new First("One");
		First obj2=new First("Two");
		
	
		try
		{
			// Thread.sleep(100);
			obj1.getThread().join();
			obj2.getThread().join();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Main ends");
	}
}