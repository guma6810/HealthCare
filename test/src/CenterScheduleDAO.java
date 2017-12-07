import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CenterScheduleDAO {
	
	private static DBconnector connector = new MariaConnector("healthCare");
	/**
	 * @brief 센터 스케줄 추가
	 * @details 센터 스케줄을 추가한다.
	 * @return void
	 * @throws 
	 */
	public void CenterScheduleAdd(CenterSchedule centerSchedule) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("INSERT INTO centerSchedule(id, date, reason) VALUES(?,?,?)");
			statement.setInt(1, centerSchedule.getScheduleId());
			statement.setString(2, centerSchedule.getDate());
			statement.setString(3, centerSchedule.getReson());
		
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @brief 센터 스케줄 리스트
	 * @details 센터 스케줄의 리스트를 보여준다.
	 * @return ArrayList<CenterSchedule>
	 * @throws 
	 */
	public ArrayList<CenterSchedule> GetCenterScheduleList() {
		ArrayList<CenterSchedule> centerSchedule_list = new ArrayList<CenterSchedule>();
		Connection connection = connector.getConnection();
		Statement statement ;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM centerSchedule;");
			while(result.next()){
				centerSchedule_list.add(new CenterSchedule(result.getInt(1), result.getString(2), result.getString(3)));
			}
			result.close();
			connection.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return centerSchedule_list;
	}
	
	/**
	 * @brief 센터 스케줄 삭제
	 * @details 센터 스케줄을 삭제한다.
	 * @return void
	 * @throws 
	 */
	public void DeleteCenterSchedule(CenterSchedule centerSchedule) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM centerSchedule WHERE id = ?;");
			statement.setInt(1, centerSchedule.getScheduleId());
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @brief 센터 스케줄 수정
	 * @details 센터 스케줄을 수정한다.
	 * @return void
	 * @throws 
	 */
	public void ModifyCenterSchedule(CenterSchedule centerSchedule) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("UPDATE centerSchedule SET date = ?, reason = ? WHERE id = ? ;");
			statement.setString(1, centerSchedule.getDate());
			statement.setString(2, centerSchedule.getReson());
			statement.setInt(3, centerSchedule.getScheduleId());
	
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @brief 센터 스케줄 조회
	 * @details 센터 스케줄을 조회한다.
	 * @return void
	 * @throws 
	 */
	public CenterSchedule GetCenterSchedule(int id) {
		CenterSchedule centerSchedule = null;
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("SELECT * FROM centerSchedule WHERE id = ?;");
			statement.setInt(1, id);

			ResultSet result = statement.executeQuery();
			result.next();
			centerSchedule = new CenterSchedule(result.getInt(1), result.getString(2), result.getString(3));

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return centerSchedule;
	}
}
