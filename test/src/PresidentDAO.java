import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PresidentDAO {
	
	private DBconnector connector = new MariaConnector("healthCare");

	// constructor
	public PresidentDAO() {
	}

	// methods

	public void AddPresident(President president) {
		/**
		 * @brief 대표 정보 추가 
		 * @details 데이터베이스에 멤버를 저장한다. 
		 * @return void @throws
		 */

		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {

			statement = connection.prepareStatement(
					"INSERT INTO member(mid, userKey, password, name, gender, birthdate, address, phone, grade, valid) VALUES(?,?,?,?,?,?,?,?,?,?)");

			statement.setString(1, president.getId());
			statement.setString(2, "");
			statement.setString(3, president.getPassword());
			statement.setString(4, president.getName());
			statement.setString(5, president.getGender());
			statement.setString(6, president.getBirthDate());
			statement.setString(7, president.getAddress());
			statement.setString(8, president.getPhone());
			statement.setInt(9, 1);
			statement.setInt(10, 1);

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void ModifyPresident(President president) {
		/**
		 * @brief 멤버 정보 수정 
		 * @details 데이터베이스에 멤버를 수정한다. 
		 * @return void @throws
		 */

		Connection connection = connector.getConnection();
		PreparedStatement statement;

		try {
			statement = connection.prepareStatement(
					"UPDATE member SET userKey = ?, password = ?, name = ?, gender = ?, birthdate = ?, address = ?, phone = ?, grade = ?, valid = ? WHERE mid = ?;");

			statement.setString(1, "");
			statement.setString(2, president.getPassword());
			statement.setString(3, president.getName());
			statement.setString(4, president.getGender());
			statement.setString(5, president.getBirthDate());
			statement.setString(6, president.getAddress());
			statement.setString(7, president.getPhone());
			statement.setInt(8, 1);
			statement.setInt(9, 1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void DeletePresident(String presidentId) {
		/**
		 * @brief 멤버 정보 삭제 @details 데이터베이스에 멤버를 삭제한다. @return void @throws
		 */
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM member WHERE mid = ?");
			statement.setString(1, presidentId);

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<President> GetPresident() {
		/**
		 * @brief 멤버 정보 탐색 @details 데이터베이스에 저장되어있는 멤버 정보를 불러온다. @return void @throws
		 */

		ArrayList<President> PresidentList = new ArrayList<President>();
		Connection connection = connector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM member WHERE mid LIKE 'P%'");
			while (result.next()) {
				PresidentList.add(new President(result.getString(1), result.getString(2), result.getString(3),
						result.getString(4), result.getString(5), result.getString(6), result.getString(7)));
			}
			result.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return PresidentList;

	}

}
