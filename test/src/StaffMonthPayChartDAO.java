import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @brief 직원월급전표 DAO
 * @details 직원의 월급여 지급이 기록된 DAO 클래스 
 * @author 이유빈
 * @date 2017-11-03
 * @version 0.0.1
 */
public class StaffMonthPayChartDAO {

	private static DBconnector connector = new MariaConnector("healthCare");
	
	/**
	 * @brief 직원월급전표 추가
	 * @details 센터에 등록외어있는 직원의 월급정보를 추가하는 DAO.
	 * @return void
	 * @throws 
	 */
	public void Add(StaffMonthPayChart staffMonthPayChart) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
<<<<<<< HEAD

			statement = connection.prepareStatement("INSTERT INTO monthPay(sid, month, typeId, money) VALUES(?,?,?,?)");
			statement.setString(1, staff.getId());
			statement.setString(2, staffMonthPayChart.getDate());
			statement.setInt(3, staffMonthPayChart.getTypeId());
			statement.setInt(4, staffMonthPayChart.getMoney());

=======
			statement = connection.prepareStatement("INSERT INTO monthPay(id, sid, month, typeId, money) VALUES(?,?,?,?,?)");
			statement.setInt(1, staffMonthPayChart.getChartId());
			statement.setString(2, staffMonthPayChart.getStaffId());
			statement.setString(3, staffMonthPayChart.getDate());
			statement.setInt(4, staffMonthPayChart.getTypeId());
			statement.setInt(5, staffMonthPayChart.getMoney());
			
>>>>>>> leeyubin
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @brief 직원월급전표리스트
	 * @details 센터에 등록외어있는 직원의 월급정보 리스트를 보여주는 DAO.
	 * @return ArrayList<StaffMonthPayChart>
	 * @throws 
	 */
	public ArrayList<StaffMonthPayChart> GetList() {
		ArrayList<StaffMonthPayChart> staffMonthPayChart_list = new ArrayList<StaffMonthPayChart>();
		Connection connection = connector.getConnection();
		Statement statement ;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT id, m.sid, month, typeId, money FROM monthPay m join staff s on m.sid=s.sid;");
			while(result.next()){
				staffMonthPayChart_list.add(new StaffMonthPayChart(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5)));
			}
			result.close();
			connection.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return staffMonthPayChart_list;
	}
	
	/**
	 * @brief 직원월급정보삭제
	 * @details 센터에 등록외어있는 직원의 월급정보를 삭제한다.
	 * @return void
	 * @throws 
	 */
	public void Delete(int chartId) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
<<<<<<< HEAD

			statement = connection.prepareStatement("DELETE FROM monthPay WHERE sid = ?");
			statement.setInt(1, chartId);

			
			statement.executeUpdate();
=======
			statement = connection.prepareStatement("DELETE FROM monthPay WHERE id = ?");
			statement.setInt(1, chartId);
>>>>>>> leeyubin
			statement.close();
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @brief 직원월급정보수정
	 * @details 센터에 등록외어있는 직원의 월급정보를 수정한다.
	 * @return void
	 * @throws 
	 */
	public void Modify(StaffMonthPayChart staffMonthPayChart) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
<<<<<<< HEAD

			statement = connection.prepareStatement("UPDATE monthPay SET date =?, typeId =?, money=? WHERE sid = ? ");
			statement.setString(1, staffMonthPayChart.getDate());
			statement.setInt(2, staffMonthPayChart.getTypeId());
			statement.setInt(3, staffMonthPayChart.getMoney());
			statement.setString(4, staff.getId());

=======
			statement = connection.prepareStatement("UPDATE monthPay SET sid = ?, month =?, typeId =?, money=? WHERE id = ? ");
			statement.setString(1, staffMonthPayChart.getStaffId());
			statement.setString(2, staffMonthPayChart.getDate());
			statement.setInt(3, staffMonthPayChart.getTypeId());
			statement.setInt(4, staffMonthPayChart.getMoney());
			statement.setInt(5, staffMonthPayChart.getChartId());
>>>>>>> leeyubin
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @brief 직원월급정보조회
	 * @details 센터에 등록외어있는 직원의 월급정보를 조회한다.
	 * @return void
	 * @throws 
	 */
	public StaffMonthPayChart Get(int chartId) {
		StaffMonthPayChart staffMonthPayChart = null;
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
<<<<<<< HEAD

			statement = connection.prepareStatement("SELECT * FROM monthPay WHERE sid = ?");
			statement.setInt(1, chartId);

=======
			statement = connection.prepareStatement("SELECT * FROM monthPay WHERE id = ?");
			statement.setInt(1, chartId);
			
>>>>>>> leeyubin
			ResultSet result = statement.executeQuery();
			result.next();
			staffMonthPayChart = new StaffMonthPayChart(result.getInt(1),result.getString(2), result.getString(3), result.getInt(4), result.getInt(5));
			
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return staffMonthPayChart;
	}

}
