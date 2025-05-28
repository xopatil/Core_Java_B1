package q3b;

import q3a.A;

class Emp extends A{
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.c);
		System.out.println(emp.a);
	}
		
}

public class Main extends A{
	public static void main(String[] args) {
		A a = new A();
		Main main = new Main();
		System.out.println(a.a);
		System.out.println(main.c);
		
		
	}
}