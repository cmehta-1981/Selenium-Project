package javaTraining;

import java.util.*;
import java.util.Vector;

public class DemoList {

	public static void main(String[] args) {
		
		
		List list =new Vector();
		list.add("Hello");
		list.add(1);
		list.add(1);
		list.add(true);
		list.add(0, "Welcome");
		list.add(null);
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		System.out.println("***********************************");
		
		List list1 =new ArrayList();
		list1.add("Hello");
		list1.add(1);
		list1.add(1);
		list1.add(true);
		list1.add(0, "Welcome");
		list1.add(null);
		
		System.out.println(list1);
		
		
		list1.remove(1);
		System.out.println(list1);
		
	}

}
