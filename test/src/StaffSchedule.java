import java.util.ArrayList;

/**
 * @brief PT자료
 * @details 센터에 등록된 PT를 기억할 책임이 있는 클래스이다.
 * @author 이요셉
 * @date 2017-11-01
 * @version 0.0.1
 */

public class StaffSchedule {
	
	private int scheduleId;
	private String date;
	private int category;
	private String memberId;
	private String reason;
	

	//Constructor
	public StaffSchedule(int scheduleId, String date, int category, String memberId, String reason) {
		this.scheduleId = scheduleId;
		this.date = date;
		this.category = category;
		this.memberId = memberId;
		this.reason = reason;
	}
	
	public StaffSchedule() {}
	
	//Getters and Setters
	
	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	//Methods
	public void AddStaffSchedule() {
		/**
		 * @brief PT정보 추가
		 * @details 센터에 PT정보를 등록한다.
		 * @return void
		 * @throws 
		 */
		
	}
	

	public void DeleteStaffSchedule() {
		/**
		 * @brief PT정보 삭제
		 * @details 센터에 PT정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<StaffSchedule> SendStaffSchedule() {
		/**
		 * @brief PT정보 탐색
		 * @details 센터의 pT정보를 탐색한다.
		 * @return StaffSchedule | ArrayList<StaffSchedule>
		 * @throws 
		 */
		
		return new ArrayList<StaffSchedule>();
	}
}
