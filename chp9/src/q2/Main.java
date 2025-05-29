package q2;

interface A{
	void A();
	
	
}

abstract class B{
	abstract void B();
	
}

class C{
	
	void Cmeth(A a , B b) {
		a.A();
		b.B();
		
	}
	
	
	
}

public class Main {
	public static void main(String[] args) {
		C c = new  C();
		c.Cmeth(new A() {
			@Override
			public void A() {
				System.out.println("in A");
				
			}
		}, new B() {
			@Override
			void B() {
				// TODO Auto-generated method stub
				System.out.println("in B");
			}
			
		});
		

}
}