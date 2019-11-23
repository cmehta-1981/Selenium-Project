package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		
		System.out.println("###################### Method 1:: by using for loop which is not recommended##################### ");
		
		String lang[] = {"C","C++","Java","VC++","Python","Java","C"};
		
		for(int i = 0;i<lang.length;i++) {
			for(int j = i+1;j<lang.length;j++) {
				if(lang[i].equals(lang[j])) {
					System.out.println("Duplicate elements in array are:- "+lang[i]);
				}
			}
		}
		
		
		System.out.println("######################### Method 2:: by using HashSet class####################################### ");
		
		Set<String> ele = new HashSet<String>();
		for(String list:lang) {
			if(ele.add(list)==false) {
				System.out.println("Duplicate elements in array are:- "+list);
			}
		}	
		
		
		
		System.out.println("######################### Method 3:: by using ArrayList class ####################################### ");
		
		
		List<String> list  = new ArrayList<String>();
		list.add("Java");
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("C++");
		System.out.println(list);
		
		Set<String> dupList = new HashSet<String>();
		for(String s:list) {
			if(dupList.add(s)==false) {
				System.out.println("Duplicate elements are :- " +s);
			}			
		}	
		
		
		System.out.println("######################### Method 4:: by using HashMap class ####################################### ");
		
		Map<String,Integer> hasList = new  HashMap<String,Integer>();
		
		
	}
}
