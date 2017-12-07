import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StaffScheduleDAO {
	private DBconnector connector = new MariaConnector("healthCare");
	
	public StaffScheduleDAO() {}
	
	public void AddStaffSchedule(StaffSchedule staffSchedule, Staff staff) {
		
		//eid에 따라서 StaffSchdeule 또는 PTSchedule에 db 입력되도록 한다.
		//PT스케줄에 대한 객체가 없으므로 이에대한 DAO롤 따로 만들면 직관적이지 않기 때문에 이렇게 처리한다.
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {
			if (staffSchedule.getCategory() == 1) {
				// PT입력, 1 = PT로 가정함.
				statement = connection
						.prepareStatement("INSERT INTO PTSchedule(sid, mid, result, date) VALUES(?, ?, ?, ?);");

				statement.setString(1, staff.getId());
				statement.setString(2, staffSchedule.getMemberId());
				statement.setInt(3, 0);
				statement.setString(4, staffSchedule.getDate());
			} else {
				// 나머지 일정 입력
				statement = connection.prepareStatement(
						"INSERT INTO staffSchedule(sid, eid, reason, date) VALUES(?, ?, ?, ?);");

				statement.setString(1, staff.getId());
				statement.setInt(2, staffSchedule.getCategory());
				statement.setString(3, staffSchedule.getReason());
				statement.setString(4, staffSchedule.getDate());

			}

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void ModifyStaffSchedule(StaffSchedule staffSchedule, Staff staff) {

		//Add와 동일하게 eid에 따라 조건 분기문 처리한다.
		
		Connection connection = connector.getConnection();
		PreparedStatement statement;

		try {
			if(staffSchedule.getCategory() == 1) {
				// pt
				statement = connection.prepareStatement(
						"UPDATE PTSchedule SET sid = ?, mid = ?, result = ?, date = ? WHERE ptId = ?;");

				statement.setString(1, staff.getId());
				statement.setString(2, staffSchedule.getMemberId());
				statement.setInt(3, 1);
				statement.setString(4, staffSchedule.getDate());
				statement.setInt(5, staffSchedule.getScheduleId());

			} else {
				// others
				statement = connection.prepareStatement(
						"UPDATE staffSchedule SET sid = ?, eid = ?, reason = ?, date = ? WHERE id = ?;");

				statement.setString(1, staff.getId());
				statement.setInt(2, staffSchedule.getCategory());
				statement.setString(3, staffSchedule.getReason());
				statement.setString(4, staffSchedule.getDate());
				statement.setInt(5, staffSchedule.getScheduleId());
				
			}

			statement.executeUpdate();
			statement.close();

			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void DeleteStaffSchedule(StaffSchedule staffSchedule) {
		Connection connection = connector.getConnection();
		PreparedStatement statement;
		try {

			if (staffSchedule.getCategory() == 1) {
				// pt
				statement = connection.prepareStatement("DELETE FROM PTSchedule WHERE ptId = ?");
				statement.setInt(1, staffSchedule.getScheduleId());
			} else {
				// others
				statement = connection.prepareStatement("DELETE FROM staffSchedule WHERE id = ?");
				statement.setInt(1, staffSchedule.getScheduleId());
			}

			statement.executeUpdate();
			statement.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<StaffSchedule> GetStaffSchedule(StaffSchedule staffSchedule) {
		
		ArrayList<StaffSchedule> StaffScheduleList = new ArrayList<StaffSchedule>();
		Connection connection = connector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			
			if(staffSchedule.getCategory() == 1) {
				//pt
				ResultSet result = statement.executeQuery("SELECT * FROM PTSchedule limit 100;");
				while (result.next()) {
					StaffScheduleList.add(new StaffSchedule());
				}
				result.close();
				connection.close();
			}
			else {
				//others
				ResultSet result = statement.executeQuery("SELECT * FROM staffSchedule limit 100;");
				while (result.next()) {
					StaffScheduleList.add(new StaffSchedule());
				}
				result.close();
				connection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return StaffScheduleList;
		
	}

}
