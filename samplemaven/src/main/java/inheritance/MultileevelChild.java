package inheritance;

public class MultileevelChild extends MultilevelParent{

	public static void main(String[] args) {
		 MultileevelChild obj = new  MultileevelChild();
				 obj.print();
		 obj.display();
		 obj.show();

	}
	public void print()
	{
		System.out.println("Child class");
	}

}
