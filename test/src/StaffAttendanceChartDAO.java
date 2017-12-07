import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @brief 직원출근전표 DAO
 * @details 직원출근전표 DAO 클래스
 * @author 이요셉
 * @date 2017-11-05
 * @version 0.0.1
 */

public class StaffAttendanceChartDAO {
	private DBconnector connector = new MariaConnector("healthCare");
	
	public StaffAttendanceChartDAO() {}
	
	public void AddStaffAttendanceChart(Staff staff, int state) {
		/** 
		 * @brief 직원 입장 정보 추가
		 * @details 데이터베이스에 멤버 입장정보를 저장한다.
		 * @return void
		 * @throws 
		 */
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {

			statement = connection.prepareStatement("INSERT INTO attendance VALUES(?, ?, ?); ");

			statement.setString(1, staff.getId());
			statement.setString(2, "2017-01-01"); // 현재시간을 어떻게 넘길 것인가??... 데이터베이스에서 입력??
			statement.setInt(3, state);

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<StaffAttendanceChart> GetStaffAttendanceChart() {
		
		/** 
		 * @brief 회원 입장정보 탐색
		 * @details 데이터베이스에 저장되어있는 멤버 입장정보를 불러온다.
		 * @return StaffAttendanceChart | ArrayList<StaffAttendanceChart>
		 * @throws 
		 */

		ArrayList<StaffAttendanceChart> StaffAttendanceChartList = new ArrayList<StaffAttendanceChart>();
		Connection connection = connector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM attendance");
			while (result.next()) {
				StaffAttendanceChartList.add(new StaffAttendanceChart(result.getString(1), result.getString(2), result.getInt(3)));
			}
			result.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return StaffAttendanceChartList;

	}

}
