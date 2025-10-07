package inheritance;

public class HierarchialChild2 extends Heirarchialparent {

	public static void main(String[] args) {
		
		HierarchialChild2 obj = new HierarchialChild2();
		obj.print();
		obj.display();
	}
	public void display()
	{
		System.out.println("Hierarchial child2");
	}

}
