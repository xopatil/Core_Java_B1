package q1;

class Address {

	String Address;
	int pincode;

	@Override
	public String toString() {
		return "Address [Address=" + Address + ", id=" + pincode + "]";
	}

	public Address(String address, int id) {
		super();
		Address = address;
		this.pincode = id;
	}

}

class Hobbies {

}

class Emp {
	String name;
	int id;
	Address adress;
	Hobbies hobbies;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", adress=" + adress + ", hobbies=" + hobbies + "]";
	}

	public Emp(String name, int id, Address adress, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.adress = adress;
		this.hobbies = hobbies;
	}

}

public class Main {
	public static void main(String[] args) {
		Address address = new Address("borivali", 1);
		Emp emp = new Emp("soham", 1, address, null);
		System.out.println(emp);
		System.out.println(emp.adress);
		System.out.println(emp.hobbies);

	}

}
