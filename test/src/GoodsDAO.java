import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GoodsDAO {
	private DBconnector connector = new MariaConnector("healthCare");
	
	public GoodsDAO() {}
	
	public void AddGoods(Goods goods) {
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {

			statement = connection.prepareStatement(
					"INSERT INTO goods(gid, categoryId, name, money, validValue, salesGoal) VALUES(?,?,?,?,?,?)");

			statement.setInt(1, goods.getGoodsId());
			statement.setInt(2, goods.getCategoryId());
			statement.setString(3, goods.getGoodsName());
			statement.setInt(4, goods.getMoney());
			statement.setString(5, goods.getValidDate());
			statement.setInt(6, goods.getSalesGoal()); //현재시간 입력 방법??
			
					
			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void ModifyGoods(Goods goods) {
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;

		try {
			statement = connection.prepareStatement(
					"UPDATE goods SET categoryId = ?, name = ?, money = ?, validValue = ?, salesGoal = ? WHERE gid = ?;");

			statement.setInt(1, goods.getCategoryId());
			statement.setString(2, goods.getGoodsName());
			statement.setInt(3, goods.getMoney());
			statement.setString(4, goods.getValidDate());
			statement.setInt(5, goods.getSalesGoal());
			statement.setInt(6, goods.getCategoryId()); //현재시간 입력 방법??
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void DeleteGoods(int goodsId) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM goods WHERE gid = ?");
			statement.setInt(1, goodsId);

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Goods> GetGoods() {
		
		ArrayList<Goods> GoodsList = new ArrayList<Goods>();
		Connection connection = connector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM goods;");
			while (result.next()) {
				GoodsList.add(new Goods());
			}
			result.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return GoodsList;

	}

}
