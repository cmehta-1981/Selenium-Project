package javaConcepts;

public class MethodOverloading {

	private static final String Charecter = null;

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum(); //Non static method can call by class object reference 
		obj.sum("c");
		double d1 = obj.sum(10.10, 12);
		System.out.println(d1);
		
		
		String str = sum("Selenium", 14);   //static method can call directly
		System.out.println(str);
		
		
	}
	
	
	//we can overload main method 
	public static void main(int i) {
		
	}
	
	//zero input parameter
	public void sum() {
		System.out.println("Sum method with no parameter");
		
	}
	
	//one parameter
	public void sum(int i) {
		
	}
	
	public void sum(double j) {
		
	}
	
	public void sum(char j) {
		
	}
	
	public void sum(String j) {
		
	}
	
	public static String sum(String j, int k) {
		System.out.println("sum method with two parameter");
		String l= j+k;
		return l;
		
	}
	
	public double sum(double j, double i) {
		System.out.println("sum method with two parameters double and double");
		double d = j+i;
		return d;
		
	}
	
	public void sum(int j, int i) {
		
	}
	

}
