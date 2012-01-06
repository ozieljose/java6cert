package examples.cap1;

class VariableExample{
	private void myMethod1(int... x){}
	private void myMethod2(char tipo, double... valores){}
	private void myMethod3(String nome, String... fones){}
	
	public static void main(String... args){
		VariableExample v = new VariableExample();
		v.myMethod1();
		v.myMethod1(1);
		v.myMethod1(2,1);
		v.myMethod3("um");
		v.myMethod3("um", "dois");
	}
}