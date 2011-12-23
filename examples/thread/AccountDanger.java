package examples.thread;

public class AccountDanger implements Runnable{

	private Account account = new Account();

	private void makeWithdrawnal(int amount){
		if(account.getBalance() >= amount){
			print(curThread().getName()+" is going to withdrawn");
			
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
			
			account.withdrawn(amount);
			
			print(curThread().getName() + " completed the withdrawnal");
		}else{
			print("No funds! bal:"+account.getBalance()+" for "+curThread().getName());
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
		
		AccountDanger accDanger = new AccountDanger();
		
		Thread one = new Thread(accDanger);
		Thread two = new Thread(accDanger);
		
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