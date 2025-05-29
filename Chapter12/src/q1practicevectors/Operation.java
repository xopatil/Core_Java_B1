package q1practicevectors;

import java.util.List;

import q1practice.EmpPojo;

public interface Operation {
	void insertdata(List<EmpPojo> list);
	void updateData(int id , String name);
	void deleteData(int id);
	void showData();
	void searchData(int id);

}
