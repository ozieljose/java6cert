package examples.cap1;

enum Farol{
	VERDE, AMARELO, VERMELHO
}

class FarolUser{
	static public void main(String...args){
		Farol atual = Farol.VERDE;
		System.out.println(atual);
	}
}