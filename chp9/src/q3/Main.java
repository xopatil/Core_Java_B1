package q3;

class Outer {

	private  int a = 10;

	class Inner {
		void innerMeth() {
			System.out.println(a);
		}

	}

}

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerMeth();

	}

}