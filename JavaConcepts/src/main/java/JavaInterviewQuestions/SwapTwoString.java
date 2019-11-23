package JavaInterviewQuestions;

public class SwapTwoString {

	public static void main(String[] args) {

		
		
		String str1 = "Selenium";
		String str2 = "Java";
		
		//Concat the str1 and str2
		str1 = str1+str2;
		System.out.println(str1);
		
		str2 = str1.substring(0, str1.length()-str2.length());
		//System.out.println(str2);
		
		str1 = str1.substring(str2.length());
		//System.out.println(str1);
		
		System.out.println(str1);
		System.out.println(str2);

	}

}
