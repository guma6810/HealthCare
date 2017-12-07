import java.util.ArrayList;
import java.util.PrimitiveIterator.OfLong;

/**
 * @brief 사용자: '직원' 클래스
 * @details 센터의 직원에 대한 클래스이다.
 * @author 이요셉
 * @date 2017-11-04
 * @version 0.0.1
 */

public class Staff extends User {
	
	private String goWorkTime;			/** 지정출근시간 */
	private String leaveWorkTime;		/** 지정퇴근시간 */
	private int enterStatus;			/** 입장상태 */
	
	//Constructor
	public Staff(String goWorkTime, String leaveWorkTime) {
		this.goWorkTime = goWorkTime;
		this.leaveWorkTime = leaveWorkTime;
	}

	public Staff() {
	}

	public Staff(String sid, String userKey, String password, String name, String gender, String birthDate, String address,
			String mobile) {
		super(sid, userKey, password, name, gender, birthDate, address, mobile);

	}

	public Staff(String sid, String userKey, String password, String name, String gender, String birthDate, String address,
			String mobile, String goWorkTime, String leaveWorkTime) {
		super(sid, userKey, password, name, gender, birthDate, address, mobile);
		this.goWorkTime = goWorkTime;
		this.leaveWorkTime = leaveWorkTime;

	}

	// Getters and Setters

	public String getgoWorkTime() {
		return goWorkTime;
	}

	public void setgoWorkTime(String goWorkTime) {
		this.goWorkTime = goWorkTime;
	}

	public String getleaveWorkTime() {
		return leaveWorkTime;
	}

	public void setleaveWorkTime(String leaveWorkTime) {
		this.leaveWorkTime = leaveWorkTime;
	}

	public int getEnterStatus() {
		return enterStatus;
	}

	public void setEnterStatus(int enterStatus) {
		this.enterStatus = enterStatus;
	}

	// Methods
	
	public void GoWork(String time) {
		/**
		 * @brief 직원출근
		 * @details 사용자 '직원'의 센터 출근의 기록을 요청한다. 현재 시간으로 기록한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public void LeaveWork(String time) {
		/**
		 * @brief 직원 퇴근
		 * @details 사용자 '직원'의 센터 퇴근의 기록을 요청한다. 현재 시간으로 기록한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public Report GetCenterStatistic(ArrayList<Integer> privilegeList) {
		/**
		 * @brief 센터의 통계를 조회한다.
		 * @details 센터의 통계를 조회한다. 매출통계, 환불통계, 회원통계, 직원출근부, 월급통계, PT스케줄 조회가 포함된다.
		 * @return Report | Report 객체로 반환.
		 * @throws 
		 */
		
		return new Report();
		
	}
	
	public void InpurRefundList(SalesChart refund, String refundReason) {
		/**
		 * @brief 환불내역 조회.
		 * @details 센터의 환불내역을 조회한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<StaffAttendanceChart> GetPersonalAttendanceBooks(String startDate, String endDate) {
		/**
		 * @brief 개인출근대장부열람 
		 * @details 사용자 '직원'에 대한 개인 출근대장부를 열람한다. 한 개인에 대한 일정 기간의 출근 기록이 반환된다.
		 * @return ArrayList<StaffAttendanceChart>
		 * @throws 
		 */
		
		return new ArrayList<StaffAttendanceChart>();
	}
	
	public ArrayList<StaffMonthPayChart> GetPersonalMonthPayStatus(String startDate, String endDate) {
		/**
		 * @brief 개인월급현황조회
		 * @details 사용자 '직원'에 대한 개인 월급현황을 조회한다. 한 개인에 대한 일정 기간의 월급현황이 반환된다.
		 * @return ArrayList<StaffMonthPayChart>
		 * @throws 
		 */
		
		return new ArrayList<StaffMonthPayChart>();
	}
	
	public void AddStaffSchedule(String staffId, String date, String content) {
		/**
		 * @brief 개인 직원 스케줄 등록
		 * @details 직원 스케줄을 등록한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteStaffSchedule(int scheduleId) {
		/**
		 * @brief 개인 직원 스케줄 등록
		 * @details 직원 스케줄을 등록한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void ModifyStaffSchedule(int scheduleId, String staffId, String date, String content) {
		/**
		 * @brief 개인 직원 스케줄 등록
		 * @details 직원 스케줄을 등록한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<StaffSchedule> SearchStaffSchedule(String staffId, String startDate, String endDate) {
		/**
		 * @brief 개인 직원 스케줄 등록
		 * @details 직원 스케줄을 등록한다.
		 * @return void
		 * @throws 
		 */
	
	return new ArrayList<StaffSchedule>();
		
	}
	
	public ArrayList<Locker> GetLocker() {
		/**
		 * @brief 락커 조회
		 * @details 센터의 락커 리스트와 상태를 확인한다.
		 * @return ArrayList<Locker>
		 * @throws 
		 */
		
		return new ArrayList<Locker>();
	}
	
	public void AddLocker(String lockerId, String memberId) {
		/**
		 * @brief 락커 등록
		 * @details 센터에 존재하는 락커에 회원정보를 입력하여 회원에게 락커를 할당한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void AddCenterReport(int category, String conetent) {
		/**
		 * @brief 센터특이사항추가
		 * @details 센터 특이사항 게시판에 특이사항을 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void ModifyCenterReport(int category, String conetent) {
		/**
		 * @brief 센터특이사항추가
		 * @details 센터 특이사항 게시판에 특이사항을 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteCenterReport(int category, String content) {
		/**
		 * @brief 센터특이사항삭제
		 * @details 센터 특이사항 게시판에 특이사항을 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void AddSales() {
		/**
		 * @brief 매출추가
		 * @details 센터에 매출을 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteSales() {
		/**
		 * @brief 매출삭제
		 * @details 센터의 매출을 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void SearchSales() {
		/**
		 * @brief 매출탐색
		 * @details 센터의 매출을 탐색한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void AddStaffInfo(String Id, String password) {
		/**
		 * @brief 직원정보 추가
		 * @details 센터에 직원의 정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteStaffInfo(String Id, String password) {
		/**
		 * @brief 직원정보 삭제
		 * @details 센터에 직원의 정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Staff> SendStaffInfo() {
		/**
		 * @brief 직원정보 전송
		 * @details 직원의 정보를 전송한다.
		 * @return Staff | ArrayList<Staff>
		 * @throws 
		 */
		
		return new ArrayList<Staff>();
	}
	
}
