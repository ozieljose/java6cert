package examples.cap3;

class WrapperMain{	
	public static void main(String[]args){
		Double d1 = Double.valueOf("3.5");
		double d2 = Double.parseDouble("3.6");
		
		Double d = new Double("");
		
		System.out.println(d+1);
	}
}