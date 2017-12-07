import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * @brief 환불전표 DAO
 * @details 센터의 환불을 책임지는 DAO
 * @author 이유빈
 * @date 2017-11-04
 * @version 0.0.1
 */
public class RefundChartDAO {
	
private static DBconnector connector = new MariaConnector("healthCare");

	/**
	 * @brief 환불전표추가 
	 * @details 센터에 등록된 환불전표를 추가하는 DAO
	 * @return void
	 * @throws 
	 */
	public void RefundChartAdd(RefundChart refundChart) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("INSERT INTO refund(tid, salesId, sid, mid, time, deduct, money, reason) VALUES(?,?,?,?,?,?,?,?)");
			statement.setInt(1, refundChart.getRefundId());
			statement.setInt(2, refundChart.getSalesChartId());
<<<<<<< HEAD
			statement.setString(3, staff.getId());
			statement.setString(4, member.getId());

			statement.setInt(5, refundChart.getRefundMoney());
			statement.setString(6, refundChart.getReson());
			

			statement.setString(5, refundChart.getRefundTime());
			statement.setInt(6, refundChart.getRefundMoney());
			statement.setString(7, refundChart.getReson());

=======
			statement.setString(3, refundChart.getStaffId());
			statement.setString(4, refundChart.getMemberId());
			statement.setString(5, refundChart.getRefundTime());
			statement.setInt(6, refundChart.getDeductMoney());
			statement.setInt(7, refundChart.getRefundMoney());
			statement.setString(8, refundChart.getReason());
			
>>>>>>> leeyubin
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @brief 센터환불전표 리스트 
	 * @details 센터에 입력된 환불 전표 리스트를 보여주는 DAO
	 * @return ArrayList<RefundChart>
	 * @throws 
	 */
	public ArrayList<RefundChart> GetRefundChartList(String startDate, String endDate) {
		ArrayList<RefundChart> refundChart_list = new ArrayList<RefundChart>();
		Connection connection = connector.getConnection();
		Statement statement ;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM refund Where time BETWEEN 'startDate' AND 'endDate';");
			while(result.next()){
				refundChart_list.add(new RefundChart(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getInt(7), result.getInt(8), result.getString(9)));
			}
			result.close();
			connection.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return refundChart_list;
	}
	/**
	 * @brief 환불전표 삭제
	 * @details 센터에 입력된 환불전표를 삭제하는 DAO
	 * @return void
	 * @throws 
	 */
	public void DeleteRefundChart(int refundId) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM refund WHERE tid = ?");
			statement.setInt(1, refundId);
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @brief 환불전표 수정
	 * @details 센터에 입력된 특이사항을 수정하는 DAO
	 * @return void
	 * @throws 
	 */
	public void ModifyRefundChart(RefundChart refundChart, Staff staff, Member member) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("UPDATE refund SET salesId=?, sid=?, mid=?, time=?, deduct=?, money=?, reason=? WHERE tid = ? ");
			statement.setInt(1, refundChart.getSalesChartId());
			statement.setString(2, staff.getId());
			statement.setString(3, member.getId());
			statement.setString(4, refundChart.getRefundTime());
			statement.setInt(5, refundChart.getRefundMoney());
			statement.setInt(6, refundChart.getDeductMoney());
			statement.setString(7, refundChart.getReason());
			statement.setInt(8, refundChart.getRefundId());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @brief 환불전표 조회
	 * @details 환불전표 조회하는 DAO
	 * @return RefundChart
	 * @throws 
	 */
/*public RefundChart GetRefundChart() {
	RefundChart refundChart = null;
	Connection connection = connector.getConnection();
	PreparedStatement statement;
	try {
		statement = connection.prepareStatement("Select r.tid, salesId, r.sid, sa.mid, r.money, reason  From refund r Join sales sa On r.mid = sa.mid;");
		
		ResultSet result = statement.executeQuery();
		result.next();
		refundChart = new RefundChart(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4), result.getString(5),result.getInt(6), result.getInt(7), result.getString(8));
		
		connection.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return refundChart;
}*/
}
