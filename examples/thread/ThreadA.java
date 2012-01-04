package examples.thread;

public class ThreadA{
	public static void main(String[] args){
		ThreadB threadB = new ThreadB();
		threadB.start();
		
		synchronized(threadB){
			System.out.println(Thread.currentThread().getName());
			System.out.println(threadB);
			try{
				System.out.println("Wainting for b to complete...");
				threadB.wait();
			}catch(InterruptedException e){}
			System.out.println("Total is "+threadB.total);
		}
	}
}

class ThreadB extends Thread{

	int total;

	public void run(){
		synchronized(this){
			System.out.println(Thread.currentThread().getName());
			System.out.println(this);
			for(int m=0; m<100; m++){
				total += m;
			}
			notify();
		}
	}
}