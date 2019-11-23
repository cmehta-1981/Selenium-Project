package JavaInterviewQuestions;

import java.util.Arrays;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		int num[] = {1,2,0,8,1,-1};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i =1;i<num.length;i++) {
			if(num[i]>largest) {
				largest = num[i];
			}
			else if(num[i]<smallest){
				smallest = num[i];
			}
		}
		
		System.out.println("\n given array list " + Arrays.toString(num));
		System.out.println("\n largest number in given array " +largest);
		System.out.println("\n smallest number in given array " +smallest);

	}

}
