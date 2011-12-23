package examples.thread;

public class AccountSynced implements Runnable{

	private Account account = new Account();

	private synchronized void makeWithdrawnal(int amount){
		if(account.getBalance() >= amount){
			print(curThread().getName()+" is going to withdrawn");
			
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
			
			account.withdrawn(amount);
			
			print(curThread().getName() + " completed the withdrawnal");
		}else{
			print("No funds! bal:"+account.getBalance());
		}
	}
	
	public void run(){
	
		for(int x = 0; x < 5; x++){
			makeWithdrawnal(10);
			if(account.getBalance() < 0){
				print("account overdrawn!");
			}
		}
		
	}	
	
	public static void main(String[] args){		
		print("Starting...");
		
		AccountSynced accSynced = new AccountSynced();
		
		Thread one = new Thread(accSynced);
		Thread two = new Thread(accSynced);
		
		one.setName("Fred");
		two.setName("Lucy");
		
		one.start();
		two.start();
		
		//one.start();
		
		try{
			one.join();
			two.join();
		}catch(InterruptedException e){}
		
		print("DONE");
	}
	
	static Thread curThread(){
		return Thread.currentThread();
	}
	
	static void print(String out){
		System.out.println(out);
	}
}