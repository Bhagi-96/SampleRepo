package inheritance;

public class SingleChild extends Singleparent {

	public static void main(String[] args) {
	
		SingleChild obj = new SingleChild();
		obj.display();
		obj.print();
		}
	public void print()
	{
		System.out.println("This is the child class");
	}

	
}
