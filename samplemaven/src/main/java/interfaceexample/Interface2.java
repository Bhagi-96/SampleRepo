package interfaceexample;

public class Interface2 implements Interface1 {
	public void print()
	{
		System.out.println("This the child class of Interface1");
	}

	public static void main(String[] args) {
		
		Interface2 obj = new Interface2();
		obj.display();
		obj.print();
		obj.sum();

	}

	@Override
	public void display() {
		System.out.println("Interface");
		
	}

	@Override
	public void sum() {
		int a = 45;
		int b = 50;
		int c = a+b;
		System.out.println(c);
		
	}

}
