package examples.cap3;

import java.util.Arrays;


final class Collar{}

final public class Dog {
	
	Collar collar;
	String name;
	
	public static void main(String[] args) {
		System.out.println("main antes:"+Arrays.asList(Thread.currentThread().getStackTrace()));
		Dog d = null;		
		d = new Dog();
		d.go(d);
		System.out.println("main final:"+Arrays.asList(Thread.currentThread().getStackTrace()));
	}
	
	public void go(Dog dog) {
		System.out.println("go antes de setName:"+Arrays.asList(Thread.currentThread().getStackTrace()));
		collar = new Collar();
		dog.setName("rex");
		System.out.println("go depois de setName:"+Arrays.asList(Thread.currentThread().getStackTrace()));
	}
	
	public void setName(String dogName){
		name = dogName;
		System.out.println("setName"+Arrays.asList(Thread.currentThread().getStackTrace()));
	}
}
