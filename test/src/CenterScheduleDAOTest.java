import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class CenterScheduleDAOTest {
	
	CenterScheduleDAO dao = new CenterScheduleDAO();
	CenterSchedule centerSchedule = new CenterSchedule(3,"2017-11-05","Test");
	ArrayList<CenterSchedule> list = new ArrayList<CenterSchedule>();

	
	@Test
	void testCenterScheduleAdd() {
		dao.CenterScheduleAdd(centerSchedule);
	}

	@Test
	void testGetCenterScheduleList() {
		list=dao.GetCenterScheduleList();

		for(CenterSchedule temp : list) {
			System.out.println(temp.getScheduleId());
		}

	}

	@Test
	void testDeleteCenterSchedule() {
		dao.DeleteCenterSchedule(centerSchedule);
	}

	@Test
	void testModifyCenterSchedule() {
		centerSchedule.setReson("그냥");
		dao.ModifyCenterSchedule(centerSchedule);
	}

	@Test
	void testGetCenterSchedule() {

		list=dao.GetCenterScheduleList();

		dao.GetCenterSchedule(1);

	}

}
