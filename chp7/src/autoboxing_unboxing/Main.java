package autoboxing_unboxing;

public class Main {
	
	public static void main(String[] args) {
		int a = 30 ;
		Integer integer = new Integer(a);
		
		Integer a1 = 100; //auto-boxing
		int i = a1; //auto-unboxing 
		
		System.out.println(i);
		
	
	}

}
