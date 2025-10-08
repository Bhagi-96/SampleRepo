package abstraction;

public class AbstractionChild extends AbstractionParent {
	public void print() 
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		AbstractionChild obj = new AbstractionChild();
		obj.display();
		obj.print();
		obj.sum();
			

	}

	@Override
	public void sum() {
		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println(c);
	
		
	}

}
