package examples.thread;

public class Thread10 extends Thread{

	public void run(){
		for(int i = 1; i <= 100; i++){
			if(i % 10 == 0){
				System.out.println("Dezena chegou:"+i);
			}
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}			
		}
		
		System.out.println("DONE!!!!");
	}
	
	public static void main(String[] args){
		Thread10 thread10 = new Thread10();
		
		thread10.start();
	}
    
}
