package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Hello");
		l.add('A');
		l.add(45);
		l.add(1.4f);
		l.add(234.567d);
		l.add("Hello");
		System.out.println(l);
	System.out.println(l.get(3));
	l.set(3, "hello world");
	System.out.println(l);
	System.out.println(l.indexOf("Hello"));
	System.out.println(l.lastIndexOf("Hello"));
	 l.remove(4);
	 System.out.println(l);
	 System.out.println(l.contains("hello world"));
	 System.out.println(l.isEmpty());
	 System.out.println(l.size());
	
	
		
		

	}

}
