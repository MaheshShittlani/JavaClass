class MyThread2 implements Runnable{
	public void run(){
		while(true) {
			System.out.println("I am in thread");
		}
	}
}
class TestMyThread2{
	public static void main(String args[]){
		Thread t1 = new Thread(new MyThread2());
		t1.start();
		
		while(true) {
			System.out.println("I m in main thread");
		}
	}
}