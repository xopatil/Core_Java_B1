package q2;

public class Employee extends Account{
	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal + bonus - tax ;
	}

}
