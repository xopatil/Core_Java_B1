package q1practice;

import java.util.List;

public interface Operations {
	void insertdata(List<EmpPojo> list);
	void updateData(int id , String name);
	void deleteData(int id);
	void showData();
	void searchData(int id);
	

}
