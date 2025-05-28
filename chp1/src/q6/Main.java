package q6;


class Address{
	
	
	String city;
	int pincode;
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
}

class Hobbies{
	
}

class Emp{
	
	String name;
	
	int id;
	Address address;
	Hobbies hobbies;
	public Emp(String name, int id, Address address, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
	
	
}





public class Main {
	public static void main(String[] args) {
		Address address = new Address("borivali", 400091);
		Emp emp = new Emp("soham", 2, address, null);
		System.out.println(emp);
		
		
	}

}