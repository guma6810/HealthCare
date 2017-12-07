import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MemberDAOTest {
	Member member = new Member("M005", "mm@naver.com", "111", "Jangg", "m", "2016-01-01", "ICT", "333-3333");
	ArrayList<Member> list = new ArrayList<Member>();
	MemberDAO dao = new MemberDAO();
	
	public MemberDAOTest() {}

	
	@Test
	public void testAddMember() {
		dao.AddMember(member);
	}

	@Test
	public void testModifyMember() {
		member.setPassword("222");
		dao.ModifyMember(member);
		
	}

	@Test
	public void testDeleteMember() {
		dao.DeleteMember("M003");
	}

	@Test
	public void testGetMemberList() {
		list = dao.GetMemberList();
		for(Member temp : list) {
			System.out.println(temp.getId());
		}
	}

}
