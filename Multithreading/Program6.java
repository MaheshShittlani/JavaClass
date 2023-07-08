class Account{
	private int balance;
	private int acc_no;
	public Account(int acc_no,int balance){
		this.acc_no=acc_no;
		this.balance=balance;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int getBalance(){
		return balance;
	}
	public void withdraw(int bal){
		int b=getBalance();
		if(b<bal)
		{
			System.out.println("Not a sufficient balance.");
			return;
		}
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		this.setBalance(b-bal);
	}
}
class WithdrawTraller extends Thread{
	Account acc;
	int bal;
	public WithdrawTraller(Account acc,int bal){
		this.acc=acc;
		this.bal=bal;
	}
	public void run(){
		acc.withdraw(bal);
	}
}
class TestWithdraw{
	public static void main(String args[]){
		Account a1=new Account(1001,10000);
		Account a2=new Account(1002,20000);
		Account a3=new Account(1003,20000);
		
		WithdrawTraller t1=new WithdrawTraller(a1,1000);
		WithdrawTraller t2=new WithdrawTraller(a2,2000);
		WithdrawTraller t3=new WithdrawTraller(a3,5000);
		WithdrawTraller t4=new WithdrawTraller(a1,5000);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try
		{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("First account Balance: "+a1.getBalance());
		System.out.println("Second account Balance: "+a2.getBalance());
		System.out.println("Third account Balance: "+a3.getBalance());
	}
}