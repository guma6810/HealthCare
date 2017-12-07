import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class LockerDAOTest {
	
	LockerDAO dao = new LockerDAO();
	Locker locker = new Locker(1,"M001", 1);
	ArrayList<Locker> list = new ArrayList<Locker>();

	@Test
	void testAdd() {
		dao.Add(locker);
		

	}

	@Test
	void testGetList() {

		list=dao.GetList();
		for(Locker temp : list) {
			System.out.println(temp.getLockerId());
		}
	}

	@Test
	void testDelete() {
		dao.Delete(1);
	}

	@Test
	void testModify() {
		locker.setLockerId(11);
		dao.Modify(locker);
		
	}

}
