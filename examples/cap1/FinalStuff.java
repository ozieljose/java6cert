package examples.cap1;

class MyClass{ int x; }

class FinalStuff{

	final int x = 0;
	
	final void sayHello(final int param){
		final MyClass my = new MyClass();
		my.x = 4;
	}
}