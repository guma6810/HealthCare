import static org.junit.jupiter.api.Assertions.*;
<<<<<<< HEAD
import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class StaffDAOTest {
	StaffDAO dao = new StaffDAO();
	Staff staff = new Staff();

	@Test
	void testAddStaff() {
		
	}

	@Test
	void testGetStaff() {
		staff = dao.GetStaff("s@naver.com");
		System.out.println(staff.getName());
	}

	@Test
	void testGetStaffList() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteStaff() {
		fail("Not yet implemented");
	}

	@Test
	void testModifyStaff() {
		fail("Not yet implemented");
=======

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
class StaffDAOTest {

	Staff staff = new Staff("P005", "111", "Jangg", "m", "2016-01-01", "ICT", "333-3333");
	ArrayList<Staff> list = new ArrayList<Staff>();
	StaffDAO dao = new StaffDAO();
	
	public StaffDAOTest() {}

	
	@Test
	public void testAdd() {
		dao.Add(staff);
	}

	@Test
	public void testModify() {
		staff.setPassword("222");
		dao.Modify(staff);
		
	}

	@Test
	public void testDelete() {
		dao.Delete("M003");
	}

	@Test
	public void testGetList() {
		list = dao.GetList();
		for(Staff temp : list) {
			System.out.println(temp.getId());
		}
>>>>>>> leeyubin
	}

}
