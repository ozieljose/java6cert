package examples.cap2;

class Animal{}
class Horse extends Animal{}

class NewAnimalRunner{
	
	static void test(Animal animal){System.out.println("Animal eat");}	
	static void test(Horse horse){System.out.println("Horse race");}
	
	public static void main(String[]args){
		Animal animal = new Animal();
		Horse horse = new Horse();
		test(animal);
		test(horse);
		
		Animal animal2 = new Horse();
		test(animal2);
		
		//NewAnimalRunner n = (NewAnimalRunner)animal;
	}
}