package inheritanceassignment;

public class SalaryCalculation extends Employee {
	double hra;
	double pf;
	public SalaryCalculation(double basicpay,double deduction,double bonus)
	{
		super(basicpay,deduction,bonus); //calling employee constructor
		
	}
public void calculate()
{
	hra = 0.05*basicpay;
	pf = 0.20*basicpay;
}
}
