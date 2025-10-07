package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent 
{
public SuperConstructorChild()
{
	super(56, 23);
	System.out.println("Child class constructor");
}
	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild();

	}

}
