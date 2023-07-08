//Wrong implementation of Producer-Consumer
class Q{
	int n;
	synchronized int get(){
		System.out.println("Got: "+n);
		return n;
	}
	synchronized void put(int n){
		this.n=n;
		System.out.println("Put: "+n);
	}
}
class Producer implements Runnable{
	Q q;
	public Producer(Q q){
		this.q=q;
		new Thread(this).start();
	}
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
		}
	}
}
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q){
		this.q=q;
		new Thread(this).start();
	}
	public void run(){
		while(true){
			q.get();
		}
	}
}
class PCTest{
	public static void main(String args[]){
		Q q1=new Q();
		Producer p=new Producer(q1);
		Consumer c=new Consumer(q1);
	}
}