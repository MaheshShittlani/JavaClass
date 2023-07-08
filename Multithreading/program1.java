class MyThread1 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++) {
			System.out.println("I am a thread");
		}
	}
}
class TestMyThread{
	public static void main(String args[]){
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		for(int i=1;i<=100;i++) {
			System.out.println("I am in Main Thread");
		}
	}
}