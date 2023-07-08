class MyThread3_1 implements Runnable{
	Thread t;	
	String name;
	public MyThread3_1(String name) {
		this.name = name;
		t = new Thread(this,name);
		t.start();
	}
	public void run() {
		while(true){
			System.out.println("I m "+t.getName()+" thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
 		}
	}
}
class TestMyThread3_1{
	public static void main(String args[]){
		MyThread3_1 th1 = new MyThread3_1("First");
		MyThread3_1 th2 = new MyThread3_1("Second");
		MyThread3_1 th3 = new MyThread3_1("Third");
	}
}