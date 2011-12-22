package examples.thread;

class NameRunnabele implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Run by "+Thread.currentThread().getName()+" and i="+i);
		}
		
		System.out.println(Thread.currentThread().getName()+" is DONE!");		
	}
	
}

public class ManyThreads1 {
	
	public static void main(String[] args) {
		
		NameRunnabele nameRunnabele = new NameRunnabele();
		
		Thread thread1 = new Thread(nameRunnabele);
		Thread thread2 = new Thread(nameRunnabele);
		Thread thread3 = new Thread(nameRunnabele);
		
		thread1.setName("Uno");
		thread2.setName("Dos");
		thread3.setName("Tres");
		
		thread1.start();
		thread2.start();
		thread3.start();			
	}

}
