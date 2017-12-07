import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * @brief 센터특이사항 DAO
 * @details 센터에 등록된 특이사항을 기억하는 DAO
 * @author 이유빈
 * @date 2017-11-04
 * @version 0.0.1
 */

public class CenterReportDAO {
	
private static DBconnector connector = new MariaConnector("healthCare");

	/**
	 * @brief 센터 특이사항 추가 DAO
	 * @details 센터에 입력된 특이사항 정보를 추가하는 DAO
	 * @return void
	 * @throws 
	 */
	public void Add(CenterReport centerReport) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("INSERT INTO centerReport(id, sid, catId, date, title, contents, state) VALUES(?,?,?,?,?,?,?)");
			statement.setInt(1, centerReport.getPostId());
			statement.setString(2, centerReport.getStaffId());
			statement.setInt(3, centerReport.getCategoryId());
			statement.setString(4, centerReport.getTime());
			statement.setString(5, centerReport.getTitle());
			statement.setString(6, centerReport.getContent());
			statement.setInt(7, centerReport.getState());
			
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @brief 센터 특이사항 리스트
	 * @details 센터에 입력된 특이사항의 리스트를 보여주는 DAO
	 * @return ArrayList<CenterReport>
	 * @throws 
	 */
	public ArrayList<CenterReport> GetCenterReportList(String startDate, String endDate) {
		ArrayList<CenterReport> centerReport_list = new ArrayList<CenterReport>();
		Connection connection = connector.getConnection();
		Statement statement ;
		try {
			statement = connection.createStatement();

			ResultSet result = statement.executeQuery("SELECT * FROM centerReport where date BETWEEN 'startDate' AND 'endDate';");

			while(result.next()){
				centerReport_list.add(new CenterReport(result.getInt(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getInt(7)));
			}
			result.close();
			connection.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return centerReport_list;
	}
	/**
	 * @brief 센터 특이사항 삭제
	 * @details 센터에 입력된 특이사항을 삭제하는 DAO
	 * @return void
	 * @throws 
	 */
	public void DeleteCenterReport(int postId) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM centerReport WHERE id = ?");
			statement.setInt(1, postId);
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @brief 센터 특이사항 수정
	 * @details 센터에 입력된 특이사항을 수정하는 DAO
	 * @return void
	 * @throws 
	 */
	public void ModifyCenterReport(CenterReport centerReport) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("UPDATE centerReport SET tilte=?, contents=?, state WHERE id = ? ");
			statement.setString(1, centerReport.getTitle());
			statement.setString(2, centerReport.getContent());
			statement.setInt(3, centerReport.getState());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @brief 센터 특이사항 조회
	 * @details 센터 특이사항을 조회하는 DAO
	 * @return CenterReport
	 * @throws 
	 */
public CenterReport Get(int postId) {
	CenterReport centerReport = null;
	Connection connection = connector.getConnection();
	PreparedStatement statement;
	try {
		statement = connection.prepareStatement("SELECT * FROM centerReport WHERE id = ?");
		statement.setInt(1, postId);
		
		ResultSet result = statement.executeQuery();
		result.next();
		centerReport = new CenterReport(result.getInt(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(4),result.getString(4), result.getInt(4));
		
		connection.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return centerReport;
}

}
