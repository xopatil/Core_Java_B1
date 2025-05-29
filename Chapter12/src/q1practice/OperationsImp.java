package q1practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationsImp implements Operations{
	
	List<EmpPojo> db = new ArrayList<EmpPojo>();
	@Override
	public void insertdata(List<EmpPojo> list) {
		db.addAll(list);
		
	}

	@Override
	public void updateData(int id, String name) {
		// TODO Auto-generated method stub
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId()==id) {
				empPojo.setName(name);
				System.out.println("data is updated sucessfully");
			}
			
		}
		
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId()==id) {
				iterator.remove();
				System.out.println("deletd successfully");
			}
			
		}
		
		
	}

	@Override
	public void showData() {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
			
		}
		
	}

	@Override
	public void searchData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId()==id) {
				System.out.println(empPojo);
				
			}
			
		}
		
	}
	
	
	

}
