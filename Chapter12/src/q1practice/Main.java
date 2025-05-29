package q1practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		EmpPojo empPojo = new EmpPojo(1, "A", "boriwali");
		EmpPojo empPojo1 = new EmpPojo(2, "B", "kandiwali");
		EmpPojo empPojo2 = new EmpPojo(3, "C", "malad");
		EmpPojo empPojo3 = new EmpPojo(4, "D", "goregaon");
		
		List<EmpPojo> empPojos = new ArrayList<EmpPojo>();
		empPojos.add(empPojo3);
		empPojos.add(empPojo2);
		empPojos.add(empPojo1);
		empPojos.add(empPojo);
		
		
		OperationsImp imp = new OperationsImp();
		imp.insertdata(empPojos);
		imp.showData();
		imp.updateData(1, "x");
		imp.showData();
		imp.deleteData(2);
		imp.searchData(3);
		
		
	}

}
