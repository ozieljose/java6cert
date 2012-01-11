package examples.cap2;

class Animal{
	Animal(int i){
		this(i, "");
	}
	Animal(int i, String s){		
	}
}

class Horse extends Animal{
	Horse(){super(1);}//se comentar essa linha da erro
}