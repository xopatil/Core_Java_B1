package q5;

class Emp {

	String name = "soham";
	static String companyName;

	void displayinfo() {

		int phone_no = 1234;
		System.out.println(name);
		System.out.println(phone_no);
	}

}

public class Main {
	static {
		Emp.companyName = "google";
	}

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.displayinfo();
		System.out.println(Emp.companyName);

	}

}
