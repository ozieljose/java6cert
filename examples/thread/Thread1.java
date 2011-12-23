package examples.thread;

import java.util.Arrays;

public class Thread1 extends Thread{
	
	public Thread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("rodou");
		System.out.println(Thread.currentThread().getName()+":"+Arrays.asList(Thread.currentThread().getStackTrace()));
	}

	public static void main(String[] args) {
		say();
		new Thread1("minha thread").start();
	}
	
	static void say(){
		System.out.println("blah");
		System.out.println(Thread.currentThread().getName()+":"+Arrays.asList(Thread.currentThread().getStackTrace()));
	}

}
