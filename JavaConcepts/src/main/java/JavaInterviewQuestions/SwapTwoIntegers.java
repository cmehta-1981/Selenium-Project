package JavaInterviewQuestions;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//swap the number with third variable
		/*
		int t;
		t = x;
		x = y;
		y = t;
		
	
		//swap the number without using third var
		
		x = x+y;  // x= 30
		y = x-y;  // y = 10
		x = x-y;  // x = 20
		*/
		
		//swap the number without using third var
		
				x = x*y;  // x= 30
				y = x/y;  // y = 10
				x = x/y;  // x = 20
		
		
		System.out.println("value of x :- " +x);
		System.out.println("value of y :- " +y);
		


	}

}
