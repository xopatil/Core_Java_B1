package linkedList;

import java.util.List;

public interface Operation {
	void insertData(List<EmpPojo> list);
	void updateData(int id , String name);
	void deleteData(int id);
	void search(int id);
	void showData();

}
