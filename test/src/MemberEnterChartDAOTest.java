import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MemberEnterChartDAOTest {
	Member member = new Member();
	MemberEnterChart chart = new MemberEnterChart();
	MemberEnterChartDAO dao = new MemberEnterChartDAO();
	ArrayList<MemberEnterChart> list = new ArrayList<MemberEnterChart>();

	@Test
	void testAddMemberEnterChartDAO() {
		member.setId("M001");
		dao.AddMemberEnterChartDAO(member, 0);
	}

	@Test
	void testGetMemberEnterChart() {
		list = dao.GetMemberEnterChart();
		for(MemberEnterChart temp : list) {
			System.out.println(temp);
		}
	}

}
