import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class StaffScheduleDAOTest {
	Staff staff = new Staff();
	Member member = new Member();
	StaffSchedule staffSchedule = new StaffSchedule();
	StaffScheduleDAO dao = new StaffScheduleDAO();
	ArrayList<StaffSchedule> list = new ArrayList<StaffSchedule>();

	@Test
	void testAddStaffSchedule() {
		staff.setId("S001");
		staffSchedule.setCategory(0);
		dao.AddStaffSchedule(staffSchedule, staff);
	}

	@Test
	void testModifyStaffSchedule() {
		
		dao.ModifyStaffSchedule(staffSchedule, staff);
	}

	@Test
	void testDeleteStaffSchedule() {
		dao.DeleteStaffSchedule(staffSchedule);
	}

	@Test
	void testGetStaffSchedule() {
		list = dao.GetStaffSchedule(staffSchedule);
	}

}
