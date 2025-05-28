package q2;


class Emp{	
	String name;
	int id;
	static String Companyname;
	static String Department;
	
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	void dislpayEmpinfo(){
		System.out.println(name);
		System.out.println(id);
		
	}
	static void displayComapnay() {
		System.out.println(Companyname);
		System.out.println(Department);
	}
	
	
}

public class Main {
	static {
		Emp.Companyname ="gogole";
		Emp.Department ="frontend developer";
		
	}
	public static void main(String[] args) {
		Emp emp = new Emp("soham", 1);
		System.out.println(emp);
		Emp.displayComapnay();
		
	}

}
