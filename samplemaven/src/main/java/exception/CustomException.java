package exception;

public class CustomException {

	public static void main(String[] args) throws VotingException, AgeException {
		int age = 17;
		if(age >= 18)
		{
			System.out.println("eligible");
		}
		else
		{ 
			throw new AgeException("Age under 18"); 

	}
	}

}
