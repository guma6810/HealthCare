import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LockerDAO {
	private static DBconnector connector = new MariaConnector("healthCare");
	
	//Constructor
	public LockerDAO() {}
	
	
	//Methods
	public void Add(Locker locker) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("INSERT INTO locker(lid, mid, state) VALUES(?,?,?)");
			statement.setInt(1, locker.getLockerId());
			statement.setString(2, locker.getMemberId());
			statement.setInt(3, locker.getState());
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Locker> GetList() {
		ArrayList<Locker> locker_list = new ArrayList<Locker>();
		Connection connection = connector.getConnection();
		Statement statement ;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM locker");
			while(result.next()){
				locker_list.add(new Locker(result.getInt(1), result.getString(2), result.getInt(3)));
			}
			result.close();
			connection.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return locker_list;
	}
	
	public void Delete(int lockerId) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("DELETE FROM locker WHERE lid = ?");
			statement.setInt(1, lockerId);
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Modify(Locker locker) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {

			statement = connection.prepareStatement("UPDATE locker SET mid = ?, state = ? WHERE lid = ? ");

			statement.setString(1, locker.getMemberId());
			statement.setInt(2, locker.getState());
			statement.setInt(3, locker.getLockerId());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
