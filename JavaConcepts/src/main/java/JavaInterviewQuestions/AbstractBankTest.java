package JavaInterviewQuestions;

public class AbstractBankTest {

	public static void main(String[] args) {
		
		AbstractBMW bmw =new AbstractBMW();
		
		bmw.Credit();
		bmw.Debit();
		bmw.Loan();
		bmw.Fund();
		bmw.LaonRepayment();
		
		System.out.println("*****************************************************************");
		
		AbstractBankClass bank = new AbstractBMW();
		bank.Credit();
		bank.Debit();
		bank.Loan();
		bank.Fund();
		

	}

}
