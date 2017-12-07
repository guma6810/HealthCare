import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @brief 회원 DAO 클래스
 * @details 센터 회원의 DAO 클래스이다.
 * @author 이요셉
 * @date 2017-11-04
 * @version 0.0.1
 */

public class MemberDAO {
	private DBconnector connector = new MariaConnector("healthCare");
	
	//constructor
	public MemberDAO() {}
	
	
	//methods
	public void AddMember(Member member) {
		/** 
		 * @brief 멤버 정보 추가
		 * @details 데이터베이스에 멤버를 저장한다.
		 * @return void
		 * @throws 
		 */
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			
			statement = connection.prepareStatement(
					"INSERT INTO member(mid, userKey, password, name, gender, birthdate, address, phone, grade, valid) VALUES(?,?,?,?,?,?,?,?,?,?)");
			
			statement.setString(1, member.getId());
			statement.setString(2, "");
			statement.setString(3, member.getPassword());
			statement.setString(4, member.getName());
			statement.setString(5, member.getGender());
			statement.setString(6, member.getBirthDate());
			statement.setString(7, member.getAddress());
			statement.setString(8, member.getPhone());
			statement.setInt(9, 1);
			statement.setInt(10, 1);
						
			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void ModifyMember(Member member) {
		/** 
		 * @brief 멤버 정보 수정
		 * @details 데이터베이스에 멤버를 수정한다.
		 * @return void
		 * @throws 
		 */
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;

		try {
			statement = connection.prepareStatement(
					"UPDATE member SET userKey = ?, password = ?, name = ?, gender = ?, birthdate = ?, address = ?, phone = ?, grade = ?, valid = ? WHERE mid = ?;");
			
			statement.setString(1, "");
			statement.setString(2, member.getPassword());
			statement.setString(3, member.getName());
			statement.setString(4, member.getGender());
			statement.setString(5, member.getBirthDate());
			statement.setString(6, member.getAddress());
			statement.setString(7, member.getPhone());
			statement.setInt(8, 1);
			statement.setInt(9, 1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

}

	public void DeleteMember(String memberId) {
		/** 
		 * @brief 멤버 정보 삭제
		 * @details 데이터베이스에 멤버를 삭제한다.
		 * @return void
		 * @throws 
		 */
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM member WHERE mid = ?");
			statement.setString(1, memberId);

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Member GetMember(String userKey) {

		/**
		 * @brief 멤버 정보 탐색(1명) 
		 * @details 데이터베이스에 저장되어있는 멤버 정보를 불러온다. 로그인에 사용된다. 
		 * @return Member
		 * @throws
		 */

		Connection connection = connector.getConnection();
		Statement statement;
		try {
			Member member;
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM member WHERE userKey = " + userKey + ";");

			member = new Member(result.getString(1), result.getString(2), result.getString(3), result.getString(4),
					result.getString(5), result.getString(6), result.getString(7), result.getString(8), result.getInt(9), result.getInt(10));

			result.close();
			connection.close();
			return member;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new Member();
	}

	public ArrayList<Member> GetMemberList() {
		
		/** 
		 * @brief 멤버 정보 탐색
		 * @details 데이터베이스에 저장되어있는 멤버 정보를 불러온다.
		 * @return void
		 * @throws 
		 */

		ArrayList<Member> MemberList = new ArrayList<Member>();
		Connection connection = connector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM member");
			while (result.next()) {
				MemberList.add(new Member(result.getString(1), result.getString(2), result.getString(3), result.getString(4),
						result.getString(5), result.getString(6), result.getString(7), result.getString(8), result.getInt(9), result.getInt(10)));
			}
			result.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return MemberList;

	}

}
