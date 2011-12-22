package example.thread;

public class Account{
	
	private int balance = 50;
	
	public int getBalance(){
		return balance;
	}
	
	public void withdrawn(int amount){
		balance = balance - amount;
	}
}