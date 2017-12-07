import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @brief 회원입장전표 DAO
 * @details 회원입장전표 DAO 클래스
 * @author 이요셉
 * @date 2017-11-04
 * @version 0.0.1
 */

public class MemberEnterChartDAO {
	private DBconnector connector = new MariaConnector("healthCare");
	
	public MemberEnterChartDAO() {}
	
	public void AddMemberEnterChartDAO(Member member, int state) {
		/** 
		 * @brief 멤버 입장 정보 추가
		 * @details 데이터베이스에 멤버 입장정보를 저장한다.
		 * @return void
		 * @throws 
		 */
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {

			statement = connection.prepareStatement("INSERT INTO enterance VALUES(?, ?, ?); ");

			statement.setString(1, member.getId());
			statement.setString(2, "2017-01-01"); // 현재시간을 어떻게 넘길 것인가??... 데이터베이스에서 입력??
			statement.setInt(3, state);

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<MemberEnterChart> GetMemberEnterChart() {
		/** 
		 * @brief 회원 입장정보 탐색
		 * @details 데이터베이스에 저장되어있는 멤버 입장정보를 불러온다.
		 * @return MemberEnterChart | ArrayList<MemberEnterChart>
		 * @throws 
		 */

		ArrayList<MemberEnterChart> MemberEnterChartList = new ArrayList<MemberEnterChart>();
		Connection connection = connector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM enterance");
			while (result.next()) {
				MemberEnterChartList.add(new MemberEnterChart(result.getString(1), result.getString(2), result.getInt(3)));
			}
			result.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return MemberEnterChartList;

	}
}
