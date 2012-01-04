package examples.cap1;

class Main{
	static public void main(String... args){
		System.out.println("Rodou");
		
		final int x;
		//System.out.println(x);//da erro de compilacao
		x = 0;
		//x = 1;//erro de compilacao
		
		//int[3] t;//erro de compilacao
		
		System.out.println(Object[].class.getName());
	}
}
class Outra1{}
class Outra2{}
class Outra3{}