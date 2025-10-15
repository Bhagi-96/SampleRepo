package inheritance;

public class Multiplechild implements Parent1,Parent2 {
	public void show()
	{
		System.out.println("This is the Multiplechild");
	}

	public static void main(String[] args) {
		Multiplechild obj = new Multiplechild();
		obj.display();
		obj.show();
		obj.sum();
	}

	@Override
	public void sum() {
	int a = 45;
	int b = 67;
	int c = a + b;
	System.out.println(c);
		
	}

	@Override
	public void display() {
		System.out.println("This is the Parent");
		
	}

}
