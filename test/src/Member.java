import java.util.ArrayList;

/**
 * @brief 사용자: '회원' 클래스
 * @details 센터의 회원에 대한 클래스이다.
 * @author 이요셉
 * @date 2017-11-04
 * @version 0.0.1
 */

public class Member extends User {
	
	private int remainPersonalTrainingtNumber; 	/** 잔여 PT횟수 */
	private int todayEnterNumber;				/** 금일 입장횟수 */
	private int enterStatus;					/** 입장상태 */			
	

	/** 입장상태 */
	
	//Constructor
	public Member(String id, String userKey, String password, String name, String gender, String birthDate, String address, String phone) {
		super(id, userKey, password, name, gender, birthDate, address, phone);
		
	}
	
	public Member(String id, String userKey, String password, String name, String gender, String birthDate, String address, String phone, int remainPT, int todayEnter) {
		super(id, userKey, password, name, gender, birthDate, address, phone);
		
		this.remainPersonalTrainingtNumber = remainPT;
		this.todayEnterNumber = todayEnter;
	}
	
	public Member() {
		super();
	}
	
	//Getters and Setters
	
	public int getEnterStatus() {
		/**
		 * @brief 입장상태확인
		 * @details 사용자 의 입장상태를 확인한다.
		 * @return int | 0: 퇴장 상태, 1: 입장 상태.
		 * @throws 
		 */
		
		return enterStatus;
	}

	public void setEnterStatus(int enterStatus) {
		this.enterStatus = enterStatus;
	}
	
	public int getRemainPersonalTrainingtNumber() {
		return remainPersonalTrainingtNumber;
	}

	public void setRemainPersonalTrainingtNumber(int remainPersonalTrainingtNumber) {
		this.remainPersonalTrainingtNumber = remainPersonalTrainingtNumber;
	}

	public int getTodayEnterNumber() {
		return todayEnterNumber;
	}

	public void setTodayEnterNumber(int todayEnterNumber) {
		this.todayEnterNumber = todayEnterNumber;
	}
	
	//Methods
	public void enter(String time) {
		/**
		 * @brief 센터입장
		 * @details 사용자 '회원'의 센터 입장을 요청한다. 현재 시간을 기록한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void exit(String time) {
		/**
		 * @brief 센터퇴장
		 * @details 사용자 '회원'의 센터 퇴장을 요청한다. 현재 시간을 기록한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void AddMemberEnterData(String time) {
		/**
		 * @brief 회원입장정보추가
		 * @details 사용자 '회원'의 입장정보를 센터에 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteMemberEnterData(String time) {
		/**
		 * @brief 회원입장정보삭제
		 * @details 사용자 '회원'의 입장정보를 센터에서 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<MemberEnterChart> SearchMemberEnterData(String startTime, String endTime) {
		/**
		 * @brief 회원입장정보 탐색
		 * @details 사용자 '회원'의 일정기간동안의 입장정보를 탐색한다.
		 * @return void
		 * @throws 
		 */
		
		return new ArrayList<MemberEnterChart>();
	}
	
	public void AddMemberInfo(String id, String password) {
		/**
		 * @brief 회원정보추가
		 * @details 사용자 '회원'의 정보를 센터에 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteMemberInfo(String id, String password) {
		/**
		 * @brief 회원정보삭제
		 * @details 사용자 '회원'의 정보를 센터에 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Member> SendMemberInfo() {
		/**
		 * @brief 회원정보탐색
		 * @details 사용자 '회원'의 정보를 센터에서 탐색한다.
		 * @return void
		 * @throws 
		 */
		
		return new ArrayList<Member>();
	}

}
