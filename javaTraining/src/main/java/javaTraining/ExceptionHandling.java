package javaTraining;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		//**************Unchecked Exceptions ****************************//
		
		//arithmeticException();
		//nullPointerException();
		//numberFormatException();
		//arrayIndexOutOfBoundsException();
		exceptionHandledInCatchBlock();
		
		//**************Checked Exceptions ****************************//
		
	}
	
	
	
	public static void arithmeticException() {
		try {
			int a = 10/0;
			System.out.println("The value of a :- " +a);
			// if exception occurs, the remaining statement will not execute  
	        System.out.println("After exception occured"); 
		}
		catch(ArithmeticException  e) {
			System.out.println("Number can not be divided by zero :- " +e);
		}
		System.out.println("print rest of the code");
		
	}
	
	
	public static void nullPointerException() {
		
		try {
			String s = null;
			System.out.println("Print the string value:- " +s.length());
		}
		catch(NullPointerException e) {
			System.out.println("String value can not be null :- " +e);
		}
		System.out.println("Run rest of the code");
	}
	
	
	
	public static void numberFormatException() {
		try {
		String s = "Java";
		int i = Integer.parseInt(s);
		System.out.println("Print the value of i :- " +i);
		}
		catch (NumberFormatException e) {
			System.out.println("String can not be parse into intefer :- " +e);
		}
		
		System.out.println("Run rest of the code");
	}
	
	public static void arrayIndexOutOfBoundsException() {
		int a[] = {1,2,3,4};
		try {
		System.out.println("Print the array value 5 :- " +a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excced array size :- "  +e);
		}
		System.out.println("Run rest of the code");
	}
	
	public static void exceptionHandledInCatchBlock() {
		int a[] = {1,2,3,4};
		try {
			System.out.println("Print the value of a[5]" +a[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" exception handled " +a[1]);
		}
	}
	
	

}
