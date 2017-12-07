import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PresidentDAOTest {
	President president = new President("P005", "111", "Jangg", "m", "2016-01-01", "ICT", "333-3333");
	ArrayList<President> list = new ArrayList<President>();
	PresidentDAO dao = new PresidentDAO();
	

	@Test
	void testAddPresident() {
		dao.AddPresident(president);
	}

	@Test
	void testModifyPresident() {
		president.setPassword("222");
		dao.ModifyPresident(president);
	}

	@Test
	void testDeletePresident() {
		dao.DeletePresident("M003");
	}

	@Test
	void testGetPresident() {
		list = dao.GetPresident();
		for(President temp : list) {
			System.out.println(temp.getId());
		}
	}

}
