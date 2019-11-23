package JavaInterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "Selenium is the best is the best";
		
		System.out.println("String length is :- " +str.length());
		System.out.println("Displays char from the string:- " +str.charAt(5));   //i
		//System.out.println("Displays char from the string:- " +str.charAt(20));  //java.lang.StringIndexOutOfBoundsException:
		System.out.println("Position of the char is :- " +str.indexOf("s"));
		System.out.println("Position of the char is :- " +str.indexOf("S"));
		System.out.println("Position of the char is :- " +str.indexOf("o"));
		
		System.out.println("Position of the char is :- " +str.indexOf("t"));  //1st occurrence of t
		System.out.println("Position of the char is :- " +str.indexOf("t" , +str.indexOf("t")+1));  //2nd occurrence of t
		System.out.println("Position of the char is :- " +str.indexOf("t",+str.indexOf("t" , +str.indexOf("t")+1)+1)); //3rd occurrence of t
		
		String str1 = "Selenium is the best is the best";
		
		System.out.println("String comparision is :- " +str.equals(str1));
		
		//substring 
		
		System.out.println("Print the substring of string :- " +str.substring(0, 9));
		
		//trim function
		String str2 = "    Selenium is the best is the best   ";
		System.out.println("remove the spaces before and after string :- " +str.trim());
		System.out.println("remove the spaces before and after string :- " +str2.trim());
		
		//replace function
		
		System.out.println("Replace space with no space :- " +str2.replace(" ", ""));
		String date = "10-12-2019";
		System.out.println(date.replace("-", "/"));  //10/12/2019
		
		
		//split
		String st3 = "Selenium_is_the_best";
		String str4[] = st3.split("_");
		
		for(int i=0;i<str4.length;i++) {
			System.out.println(str4[i]);
			
		}
		


	}

}
