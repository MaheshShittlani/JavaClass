class SortThread implements Runnable{
	private String name;
	private Thread t;
	private int arr[];
	public SortThread(String name,int arr[]){
		this.name=name;
		this.arr=arr;
		t=new Thread(this,name);
		t.start();
	}
	public Thread getThread(){
		return t;
	}
	public void run(){
		int t;
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
class MergeTowArray{
	public static void main(String args[]){
		int a[]= new int[10];
		int b[]= new int[10];
		int c[]=new int[a.length+b.length];
		
		//Generate array elements
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100);
			b[i] = (int)(Math.random() * 100);
		}


		SortThread obj1=new SortThread("First",a);
		SortThread obj2=new SortThread("Second",b);
		try{
			obj1.getThread().join();
			obj2.getThread().join();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		
		System.out.println("After sorting first array...");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
		System.out.println("After sorting second array...");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]+" ");
		}
		/*merging*/
		int i,j,k;
		for(i=0,j=0,k=0;i<a.length && j<b.length;k++){
			if(a[i]<b[j])
				c[k]=a[i++];
			else
				c[k]=b[j++];
		}
		
		/*Remaining of array-1*/
		while(i<a.length){
			c[k++]=a[i++];
		}
		/*Remaining of array-2*/
		while(j<b.length){
			c[k++]=b[j++];
		}
		
		/*output*/
		System.out.println("After merging array...\n");
		for(i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
}