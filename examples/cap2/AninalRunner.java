package examples.cap2;

class Animal{
	void eat() throws java.io.IOException{
		System.out.println("animal do eat!");
	}
	void makeSound() throws Exception{
		System.out.println("animal sound");
	}
}
class Horse extends Animal{
	void eat() throws java.io.FileNotFoundException{
		System.out.println("im a horse and eatin!");	
	}
	void makeSound(){
		System.out.println("horse sound");
	}
}

class AnimalRunner{
}