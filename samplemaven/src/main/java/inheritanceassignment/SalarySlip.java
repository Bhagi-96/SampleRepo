package inheritanceassignment;

public class SalarySlip extends SalaryCalculation {
	public SalarySlip(double basicpay,double deduction,double bonus)
	{
		super(basicpay,deduction,bonus);
	}
	public void displaySlip()
	{
		calculate();
		double totalsalary = basicpay + hra - pf - deduction + bonus;
		System.out.println("SALARY SLIP");
		System.out.println("Basic pay :" + basicpay);
		System.out.println("Deduction :" + deduction);
		System.out.println("hra :" + hra);
		System.out.println("pf ;" + pf);
		System.out.println("Bonus :" + bonus);
		System.out.println("total salary" + totalsalary);
		
	
	}
	public static void main(String[] args) {
		
		SalarySlip obj = new SalarySlip (20000,2500,500);
		obj.displaySlip();
	}

	
}
