package q1practice;

public class EmpPojo {
	int id;
	String name;
	String address;
	@Override
	public String toString() {
		return "EmpPojo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public EmpPojo(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
