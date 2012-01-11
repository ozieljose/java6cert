package examples.cap3;

class InitMain{

	InitMain(int x) { System.out.println("1-arg const"); }
	InitMain() { this(0); System.out.println("no-arg const"); }
	static { System.out.println("1st static init"); }
	{ System.out.println("1st instance init"); }
	{ System.out.println("2nd instance init"); }
	static { System.out.println("2nd static init"); }
	
	public static void main(String[]args){
		new InitMain();
		//new InitMain(1);
	}
}