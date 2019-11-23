package JavaInterviewQuestions;

public class AbstractBMW extends AbstractBankClass{
	
	static int a =10;
	final int b=20;
	String s = "Java";

	
	//Overridden methods
	
	@Override
	public void Loan() {
		System.out.println("Print BMW loan");
		
	}

	@Override
	public void Credit() {
		System.out.println("Print BMW credit");
		
	}

	@Override
	public void Debit() {
		System.out.println("Print BMW debit");
		
	}
	
	//non overridden method
	
	public void LaonRepayment() {
		System.out.println("Print BMW laonrepayment");
	}
	

}
