class MainThreadTest{
	public static void main(String args[]){
		Thread t=Thread.currentThread();
		System.out.println("Main Thread: "+t);
		
		System.out.println("Min prority: "+Thread.MIN_PRIORITY);
		System.out.println("Norm prority: "+Thread.NORM_PRIORITY);
		System.out.println("Max prority: "+Thread.MAX_PRIORITY);
		
		t.setPriority(7);
		t.setName("Main Thread");
		
		Thread.State ts=t.getState();
		System.out.println("Thread State: "+ts);
		System.out.println("After Changes Main Thread: "+t);
	}
}