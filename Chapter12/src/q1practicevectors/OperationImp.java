package q1practicevectors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import q1practice.EmpPojo;

public class OperationImp implements Operation{
	Vector<EmpPojo> db = new Vector<EmpPojo>();

	@Override
	public void insertdata(List<EmpPojo> list) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData(int id, String name) {
		Enumeration<EmpPojo> enumeration = db.elements();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData(int id) {
		Enumeration<EmpPojo> enumeration = db.elements();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showData() {
		Enumeration<EmpPojo> enumeration = db.elements();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchData(int id) {
		Enumeration<EmpPojo> enumeration = db.elements();
		// TODO Auto-generated method stub
		
	}
	
}
