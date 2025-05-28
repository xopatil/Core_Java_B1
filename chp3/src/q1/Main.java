package q1;

class Emp{
	String name;
	int id;
	static String Companyname;
	static String Companyaddress;
	
	
	void displayEmpInfo() {
		System.out.println(name);
		System.out.println(id);
	}
	
	static void displayCompanyInfo() {
		System.out.println(Companyname);
		System.out.println(Companyaddress);
		
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}



public class Main {
	
	static {
		Emp.Companyname="gogogogeee";
		Emp.Companyaddress="goregaon";
	}
	
	public static void main(String[] args) {
		Emp emp = new Emp("soham",1);
		Emp.displayCompanyInfo();
		System.out.println(emp);
		
		
		
	}

}
