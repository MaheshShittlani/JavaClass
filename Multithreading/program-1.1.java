class MyThread2 extends Thread{
	public void run(){
		for(int i=1;i<=10;i++) {
			System.out.println("I m in thread-1 running "+i+" times");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
class TestMyThread2{
	public static void main(String args[]){
		System.out.println("Main Thread Starts");
		Thread th=new MyThread2();
		th.start();
		for(int i=1;i<=10;i++){
			System.out.println("I m in main Thread running "+i+" times");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("Main Thread Ends");
	}
}