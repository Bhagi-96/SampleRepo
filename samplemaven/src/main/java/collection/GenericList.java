package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList <String>();
		l1.add("Apple");
		l1.add("orange");
		l1.add("Guava");
		l1.add("Pomgranate");
		l1.add("Apple");
System.out.println(l1);
System.out.println(l1.get(3));
l1.set(3, "banana");
System.out.println(l1);
System.out.println(l1.indexOf("Apple"));
System.out.println(l1.lastIndexOf("Apple"));
l1.remove(2); //by giving index
System.out.println(l1);
l1.remove("orange"); //by giving value of element
System.out.println(l1);
System.out.println(l1.contains("banana")); 
System.out.println(l1.isEmpty());
System.out.println(l1.size());



	}

}
