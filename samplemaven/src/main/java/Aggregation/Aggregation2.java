package Aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 reff;
	public Aggregation2 (String city,String state, Aggregation1 reff)
	{
		
	this.city = city;
			this.state = state;
			this.reff = reff;
	}
public void display()
{
	System.out.println(reff.name+ " " + reff.rollno + " " + reff.age + " " + city + " " + state);
}

	public static void main(String[] args) {
		Aggregation1 obj = new Aggregation1("Bhagi", 23, 29);
		Aggregation2 obj1 = new Aggregation2("Trivandrum","Kerala",obj);
		obj1.display();

	}

}
