package q2;

class Emp{
	String name;
	int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");
		
	}
}

public class main{
	public static void main(String[] args) {
		Emp emp = new Emp("soham", 1);
		emp = null;
		System.gc();
		
	}
	
}