package examples.cap1;

import examples.cap1.cert.Animal;

class Cachorro extends Animal{
	//abstract private void fazBraulho();//nao compila
	public static void main(String args[]){
	
		Animal a =  new Animal();
		System.out.println(a.nome);
		
		Cachorro c = new Cachorro();		
		System.out.println(c.nome);//ok
	}
}