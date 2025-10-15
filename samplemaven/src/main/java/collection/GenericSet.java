package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();  
		s.add("Red");
		s.add("Green");
		s.add("blue");
		s.add("black");
		System.out.println(s);
		
		Set<String> s1 = new HashSet<String>();
		s1.add("brown");
		s1.add("white");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("white"));
		System.out.println(s.containsAll(s1));
		System.out.println(s1.isEmpty());
		s.remove("Green");
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());
		s1.clear();
		System.out.println(s1);

	}

}
