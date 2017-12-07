import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class StaffAttendanceChartDAOTest {
	Staff staff = new Staff();
	StaffAttendanceChart chart = new StaffAttendanceChart();
	StaffAttendanceChartDAO dao = new StaffAttendanceChartDAO();
	ArrayList<StaffAttendanceChart> list = new ArrayList<StaffAttendanceChart>();

	@Test
	void testAddStaffAttendanceChartDAO() {
		staff.setId("S001");
		dao.AddStaffAttendanceChart(staff, 0);
	}

	@Test
	void testGetStaffAttendanceChart() {
		list = dao.GetStaffAttendanceChart();
		for (StaffAttendanceChart temp : list) {
			System.out.println(temp);
		}
	}
}
