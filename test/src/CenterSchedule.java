import java.util.ArrayList;
import java.util.Date;
/**
 * @brief 센터스케줄
 * @details 센터에 등록된 스케줄을 기억하는 책임이 있는 클래스이다.
 * @author 이유빈
 * @date 2017-11-04
 * @version 0.0.1
 */

public class CenterSchedule {
	
	private int scheduleId; //스케줄 아이디
	private String date; //날짜
	private String reson; // 사유
	
	
	public int getScheduleId() {
		return scheduleId;
	}

	public String getDate() {
		return date;
	}

	public String getReson() {
		return reson;
	}

		public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}

		//Constructor
		public CenterSchedule() {};
		
		public CenterSchedule(int scheduleId, String date, String reson) {
			this.scheduleId = scheduleId ;
			this.date = date;
			this.reson = reson;
		}
		
		
		//Methods
		public void AddCenterSchedule() {
			/**
			 * @brief 센터 스케줄 추가
			 * @details 센터에 입력된 스케줄을 추가한다.
			 * @return void
			 * @throws 
			 */
			
		}
		public void DeleteCenterSchedule() {
			/**
			 * @brief 센터스케줄삭제
			 * @details 센터에 입력된 스케줄을 삭제한다.
			 * @return void
			 * @throws 
			 */
			
		}
		
		public void ModifyCenterSchedule() {
			/**
			 * @brief 센터스케줄수정
			 * @details 센터에 입력된 스케줄을 수정한다.
			 * @return void
			 * @throws 
			 */
			
		}
		
		public ArrayList<CenterSchedule> SendCenterSchedule() {
			/**
			 * @brief 센터스케줄탐색
			 * @details 센터에 입력된 스케줄을 탐색한다.
			 * @return CenterSchedule | ArrayList<CenterSchedule>
			 * @throws 
			 */
			
			return new ArrayList<CenterSchedule>();
		}
		
}

