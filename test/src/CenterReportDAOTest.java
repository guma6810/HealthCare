import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class CenterReportDAOTest {
	
	CenterReportDAO dao = new CenterReportDAO();

	CenterReport centerReport = new CenterReport(1,"1",1,"2017-11-07 14:19:08","1","1",1);
	Staff staff;

	ArrayList<CenterReport> list= new ArrayList<CenterReport>();
	
	@Test
	void testAdd() {
		dao.Add(centerReport);
	}

	@Test
	void testGetCenterReportList() {
		list=dao.GetCenterReportList("2017-11-07 14:19:08","2017-11-07 21:54:10");
		for(CenterReport temp : list) {
			System.out.println(temp.getCategoryId());
		}
	}

	@Test
	void testDeleteCenterReport() {
		dao.DeleteCenterReport(1);
	}

	@Test
	void testModifyCenterReport() {
		centerReport.setCategoryId(11);
		dao.ModifyCenterReport(centerReport);
	}

	@Test
	void testGet() {

		list= dao.GetCenterReportList("2017-11-07 14:18:52", "2017-11-07 14:19:08");

	}

}
