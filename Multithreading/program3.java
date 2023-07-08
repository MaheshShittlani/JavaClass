class MyThread3 implements Runnable{
	public void run() {
		while(true){
			System.out.println("I m "+Thread.currentThread().getName()+" thread");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
 		}
	}
}
class TestMyThread3{
	public static void main(String args[]){
		MyThread3 th1 = new MyThread3();
		MyThread3 th2 = new MyThread3();
		MyThread3 th3 = new MyThread3();
		
		Thread t1 = new Thread(th1,"First");
		Thread t2 = new Thread(th2,"Second");
		Thread t3 = new Thread(th3,"Third");
		
		t1.start();
		t2.start();
		t3.start();
	}
}