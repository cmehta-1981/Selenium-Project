package javaTraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoException {

	public static void main(String[] args) throws FileNotFoundException {
		
		//int a = 10/0;
	    //FileInputStream fs = new FileInputStream("C:\test");
		
		
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");    
}  
		
		

	

}
