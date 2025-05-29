package q5;



class A{
	int a = 10;
	public A() {
		System.out.println("super constructor");
	}
	
	void meth() {
		System.out.println("A");
	}
	
	
}

class B extends A{
	public B() {
		super();
	}
	
	void meth1() {
		super.meth();
		
	}
}

public class Main {
	public static void main(String[] args) {
		
	}

}