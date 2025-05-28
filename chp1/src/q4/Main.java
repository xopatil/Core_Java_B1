package q4;


abstract class Accounts{
	double calsal(double sal, double bonus, double tax) {
		return 0;
	}
	double calsal(double sal, double bonus) {
		return 0;
	}

}


class Manager extends Accounts{
	@Override
	double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal + bonus;
	}
	
}


public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager.calsal(1222, 2121));
	}

}
