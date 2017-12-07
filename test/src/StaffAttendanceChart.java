import java.util.ArrayList;

/**
 * @brief 직원출근전표
 * @details 센터의 직원의 출근부를 기록하는 책임이 있는 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class StaffAttendanceChart {
	String staffId;
	String time;
	int state;
	

	//Constructor
	public StaffAttendanceChart(String staffId, String time, int state) {
		this.staffId = staffId;
		this.time = time;
		this.state = state;
	}
	
	public StaffAttendanceChart() {}
	
	//Getters and Setters
	
	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	//Methods
	public void AddStaffAttendanceInfo() {
		/**
		 * @brief 직원출근정보 추가
		 * @details 센터에 출근한 직원의 정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	

	public void DeleteStaffAttendanceInfo() {
		/**
		 * @brief 직원출근정보 삭제
		 * @details 센터에 출근한 직원의 정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<StaffAttendanceChart> SendStaffAttendanceInfo() {
		/**
		 * @brief 직원출근정보 탐색
		 * @details 센터에 출근한 직원의 정보를 탐색한다.
		 * @return StaffAttendanceChart | ArrayList<StaffAttendanceChart>
		 * @throws 
		 */
		
		return new ArrayList<StaffAttendanceChart>();
	}
}
