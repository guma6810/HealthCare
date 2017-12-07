import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class StaffMonthPayChartDAOTest {
	
	StaffMonthPayChartDAO dao = new StaffMonthPayChartDAO();
	StaffMonthPayChart staffMonthPayChart = new StaffMonthPayChart(0000000005,"S001", "2017-11-05", 2,100000);
	ArrayList<StaffMonthPayChart> list = new ArrayList<StaffMonthPayChart>();
	
	@Test
	void testAdd() {
		dao.Add(staffMonthPayChart);
	}

	@Test
	void testGetList() {
		list = dao.GetList();
	}

	@Test
	void testDelete() {
		dao.Delete(0000000001);
	}

	@Test
	void testModify() {
		dao.Modify(staffMonthPayChart);
	}

	@Test
	void testGet() {
		dao.Get(0000000002);
	}

}
