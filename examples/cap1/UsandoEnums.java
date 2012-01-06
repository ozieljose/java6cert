package examples.cap1;

import java.io.Console;

enum Sinal{ 
	VERDE(0), AMARELO(1), VERMELHO(2);
	
	private int valor;
	
	Sinal(){}
	
	Sinal(int i){}
	
	public int getValor(){
		return valor;
	}
	
	/*public static void main(String... args){
		System.out.println(VERMELHO.getClass());
		System.out.println(VERMELHO instanceof java.lang.Enum);
	}*/
}

/*class Sinal extends java.lang.Enum{
	public static final Sinal VERDE = new Sinal("VERDE");
	public static final Sinal AMARELO = new Sinal("AMARELO");
	public static final Sinal VERMELHO = new Sinal("VERMELHO");
}*/

/*public class UsandoEnums{

	enum Sinal{ 
		VERDE, AMARELO, VERMELHO;
		public String getStuff(){
			return "oh";
		}
	}
	
	static Sinal s;
	
	public static void main(String... args){
	
		Sinal s = Sinal.VERDE.VERMELHO.AMARELO;
		
		System.console().printf("eita po\n");
	
		System.out.println(s);
		System.out.println(s.VERMELHO);
	}
}
*/