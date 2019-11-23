package JavaInterviewQuestions;

import java.util.Scanner;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		System.out.println("Enter the junk char string"); //Selenium @!@@##@@@@@ is )))())()*&&& magic
		Scanner sc= new Scanner(System.in);
		String junkString = sc.nextLine();
		String withoutJunkChar = junkString.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(withoutJunkChar);
	}

}
