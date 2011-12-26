package examples.thread;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class NameList{
	private List names = Collections.synchronizedList(new ArrayList());
	
	public void add(String name){
		names.add(name);
	}
	
	public String removeFirst(){
		if(names.size() > 0){
			return (String)names.remove(0);
		}else{
			return null;
		}
	}
	
	public static void main(String[] args){
		final NameList nl = new NameList();
		
		nl.add("Ozymandias");
		nl.add("Jose");
		nl.add("Oziel");
		nl.add("Franca");
		nl.add("Fernanda");
		nl.add("Gomes");
		
		class NameDropper extends Thread{
			public void run(){
				for(int x=0; x<5; x++){
					String name = nl.removeFirst();
					out.println(name);
				}
			}
		}
		
		Thread t1 = new NameDropper();
		Thread t2 = new NameDropper();
		
		t1.start();
		t2.start();
	}
}