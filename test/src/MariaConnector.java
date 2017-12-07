import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaConnector implements DBconnector {
	private String DBname;
	private String url = "jdbc:mariadb://192.168.0.55:3306/healthCare";
	private String user = "root";
	private String pass = "1234";
	
	MariaConnector(String name){
		DBname=name;
	}
	
	@Override
	public Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
//			connection = DriverManager.getConnection("jdbc:Maria:" + DBname);
			connection = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
