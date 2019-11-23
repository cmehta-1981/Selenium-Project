package JavaInterviewQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.usingStringBuffer();
		usingForLoop();
		usingScannerClass();

	}
	
	public static void usingForLoop() {
		String s = "Selenium";
		int len = s.length();  //length of string is 8
		
		//String is a immutable object
		String rev = "";
		
		for(int i = len-1; i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		
		System.out.println("reverse string is :- "  +rev);
		
	}
	
	public void usingStringBuffer() {
		String s = "Selenium";
		
		//StringBuffer is a mutable object
		StringBuffer  sf = new StringBuffer(s);
		StringBuffer rev = sf.reverse();
		
		System.out.println("reverse string is :- " +rev);
	}
	
	
	public static void usingScannerClass() {
		
		System.out.println("Enter the string to be reverse");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println("reverse string is :- " +sf.reverse());
	}
	
	

}
