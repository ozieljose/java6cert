package examples.cap3;

class PrimitiveMain{
	public static void main(String[]args){
		byte a = 10;
		byte b = 2;
		byte c = (byte)(a + b);
		int d = c;
		
		int x1 = (int)123.456;
		//System.out.println(x1);
		
		float f = 234.65f;
		short s = (short)120054.65;
		
		System.out.println(s);
		
		int total = 25 - 5 * 4 / 2 - 10 + 4;
		System.out.println(total);
	}
}