package examples.thread;

public class StringWriterThread extends Thread{

	private StringBuffer strBuffer;

	public StringWriterThread(StringBuffer strBuffer, String nome){
		super(nome);
		this.strBuffer = strBuffer;
	}

	public void run(){
		System.out.print("[Comecou "+Thread.currentThread().getName()+']');
		synchronized(strBuffer){
			for(int i = 0; i<100; i++){
				System.out.print('['+Thread.currentThread().getName()+'-'+i+':'+strBuffer+']');
			}
			System.out.print("|");
			
			char ultimoChar = strBuffer.charAt(strBuffer.length()-1);
			char inc = (char)(ultimoChar + 1);
			
			strBuffer.setCharAt(strBuffer.length()-1, inc);
		}
	}
	
	public static void main(String args[]){
	
		StringBuffer strBuffer = new StringBuffer("A");
	
		StringWriterThread strThread1 = new StringWriterThread(strBuffer, "Ze");
		StringWriterThread strThread2 = new StringWriterThread(strBuffer, "Jao");
		StringWriterThread strThread3 = new StringWriterThread(strBuffer, "Chico");
		
		strThread1.start();
		strThread2.start();
		strThread3.start();
	}
	
}