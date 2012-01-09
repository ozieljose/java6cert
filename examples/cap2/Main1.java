package examples.cap2;

interface ThrowStuff{ void throwing() throws Exception; }

class Catching implements ThrowStuff{
	public void throwing(){}
}

class Main1{
	public static void main(String[]args){
		ThrowStuff t = new Catching();
		Catching c = new Catching();
		c.throwing();
		
		int i = (int)3.4f;
		System.out.println(i);
	}
}