package q2;

class Employee {

	String name;
	int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("tom", 15);
		System.out.println(employee);

	}

}