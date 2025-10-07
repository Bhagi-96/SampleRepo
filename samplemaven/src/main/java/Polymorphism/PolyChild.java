package Polymorphism;

public class PolyChild extends PolyParent 
{
public void print(int a,int b)
{
	int c = a - b;
	System.out.println(c);
	super.print(23, 34);
}

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.print(10, 5);

	}

}
