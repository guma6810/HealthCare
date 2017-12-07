import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SalesChartDAO {
	
	private DBconnector connector = new MariaConnector("healthCare");
	public SalesChartDAO() {}
	
	public void AddSalesChart(SalesChart chart, Goods goods, Member member, Staff staff) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {

			statement = connection.prepareStatement(
					"INSERT INTO sales(mid, gid, sid, type, money, time, expireDate, etc) VALUES(?,?,?,?,?,?,?,?);");

			statement.setString(1, member.getId());
			statement.setInt(2, goods.getGoodsId());
			statement.setString(3, staff.getId());
			statement.setInt(4, chart.getTranscationType());
			statement.setInt(5, chart.getMoney());
			statement.setString(6, "2017-01-01"); //현재시간 입력 방법??
			statement.setString(7, "2017-01-02");//today + goods.getValidDate()...
			statement.setString(8, chart.getEtc());
					
			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void ModifySalesChart(SalesChart chart, Goods goods, Member member, Staff staff) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;

		try {
			statement = connection.prepareStatement(
					"UPDATE sales SET mid = ?, gid = ?, sid = ?, type = ?, money = ?, time = ?, expireDate = ?, etc = ?;");

			statement.setString(1, member.getId());
			statement.setInt(2, goods.getGoodsId());
			statement.setString(3, staff.getId());
			statement.setInt(4, chart.getTranscationType());
			statement.setInt(5, chart.getMoney());
			statement.setString(6, ""); //현재시간 입력 방법??
			statement.setString(7, "");//today + goods.getValidDate()...
			statement.setString(8, chart.getEtc());
			
			statement.executeUpdate();
			statement.close();

			connection.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void DeleteSalesChart(int transcationId) {
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM member WHERE mid = ?");
			statement.setInt(1, transcationId);

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<SalesChart> GetSalesChart(String startDate, String endDate) {
		
		ArrayList<SalesChart> SalesChartList = new ArrayList<SalesChart>();
		Connection connection = connector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM sales WHERE time BETWEEN " + startDate + " AND " + endDate + ";");
			while (result.next()) {
				SalesChartList.add(new SalesChart());
			}
			result.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SalesChartList;

		
	}

}
