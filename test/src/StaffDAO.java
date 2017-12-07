import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StaffDAO {
private static DBconnector connector = new MariaConnector("healthCare");
	
public StaffDAO() {}


	
	public void AddStaff(Staff staff) {
		/**
		 * @brief 직원추가
		 * @details 직원을 추가한다.
		 * @return void
		 * @throws 
		 */
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("INSERT INTO staff(sid, userKey, password, name, gender, birthdate, address, phone, gradeId, goWorkTime, leaveWorkTime) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
			statement.setString(1, staff.getId());
			statement.setString(2, "");
			statement.setString(3, staff.getPassword());
			statement.setString(4, staff.getName());
			statement.setString(5, staff.getGender());
			statement.setString(6, staff.getBirthDate());
			statement.setString(7, staff.getAddress());
			statement.setString(8, staff.getPhone());
			statement.setInt(9, 1);
			statement.setString(10, staff.getgoWorkTime());
			statement.setString(11, staff.getleaveWorkTime());
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Staff GetStaff(String userKey) {

		/**
		 * @brief 멤버 정보 탐색(1명) 
		 * @details 데이터베이스에 저장되어있는 멤버 정보를 불러온다. 로그인에 사용된다. 
		 * @return Staff
		 * @throws
		 */

		Connection connection = connector.getConnection();
		Statement statement;
		try {
			Staff staff;
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM staff WHERE userKey = '" + userKey + "';");

			result.next();

			staff = new Staff(result.getString(1), result.getString(2), result.getString(3), result.getString(4),
					result.getString(5), result.getString(6), result.getString(7), result.getString(8),
					result.getString(9), result.getString(10));

			result.close();
			connection.close();
			return staff;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new Staff();
	}
	

	
	public ArrayList<Staff> GetStaffList() {
		/**
		 * @brief 직원리스트 로드
		 * @details 직원의 리스트를 불러온다.
		 * @return ArrayList<Staff>
		 * @throws 
		 */
		
		ArrayList<Staff> staff_list = new ArrayList<Staff>();
		Connection connection = connector.getConnection();
		Statement statement ;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(
					"SELECT sid, userKey, password, name, gender, birthDate, address, phone, goWorkTime, leaveWorkTime FROM staff;");
			while (result.next()) {
				staff_list.add(new Staff(result.getString(1), result.getString(2), result.getString(3),
						result.getString(4), result.getString(5), result.getString(6), result.getString(7),
						result.getString(8), result.getString(9), result.getString(10)));
			}
			result.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return staff_list;
	}
	
	
	public void DeleteStaff(String sid) {
		/**
		 * @brief 직원삭제
		 * @details 직원을 삭제한다.
		 * @return void
		 * @throws 
		 */
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM staff WHERE sid = ?");
			statement.setString(1, sid);
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void ModifyStaff(Staff staff) {
		/**
		 * @brief 직원정보수정
		 * @details 직원정보를 수정한다.
		 * @return void
		 * @throws 
		 */
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("UPDATE staff SET uerKey=?, password = ?, name = ?, gender =?, birth = ?, address=?, phone=?, gradeId=?, goWorkTime=?, leaveWorkTime=? WHERE sid = ? ");
			statement.setString(1, "");
			statement.setString(2, staff.getPassword());
			statement.setString(3, staff.getName());
			statement.setString(4, staff.getGender());
			statement.setString(5, staff.getBirthDate());
			statement.setString(6, staff.getAddress());
			statement.setString(7, staff.getPhone());
			statement.setInt(8, 1);
			statement.setString(9, staff.getgoWorkTime());
			statement.setString(10, staff.getleaveWorkTime());
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}


