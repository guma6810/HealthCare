import java.util.ArrayList;

/**
 * @brief 사용자: '매니저' 클래스 - 사용안함
 * @details 삭제됨:: 2017-10-28.
 * @author 이요셉
 * @date 2017-10-20
 * @version 0.0.1
 */


public class Manager {
	
	private String id;				/** president's ID */
	private String password;		/** president's password */
	private String name;			/** president's name */
	private String birth;			/** president's birthdate(YYMMDD) */
	private String mobile;			/** president's mobile number */
	
	
	//Constructor
	public Manager(String id, String password, String name, String birth, String mobile) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.mobile = mobile;
	}
	
	
	public void Login() {
		/**
		 * @brief 센터의 통계를 조회한다.
		 * @details 센터의 통계를 조회한다. 매출통계, 환불통계, 회원통계, 직원출근부, 월급통계, PT스케줄 조회가 포함된다.
		 * @return Report | Report 객체로 반환.
		 * @throws 
		 */
	
	}
	
	public void LogOut() {
		
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
	
	public void InputStaffIncentive(String staffId, int money) {
		/**
		 * @brief 인센티브 입력
		 * @details 센터의 직원에 대해 인센티브를 입력한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void AddPersonalTraining(String goodsId, String memberId) {
		/**
		 * @brief PT등록
		 * @details 센터에 PT를 등록한다. 선택된 상품 id와 PT할 회원의 id가 필요하다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Locker> GetLocker() {
		/**
		 * @brief 락커 조회
		 * @details 센터의 락커를 조회한다.
		 * @return ArrayList<Locker>
		 * @throws 
		 */
		
		return new ArrayList<Locker>();
		
	}
	
	public void AddLocker(String lockerId, String memberId) {
		/**
		 * @brief 락커 정보를 추가한다.
		 * @details 센터의 락커에 정보를 추가한다. 락커를 사용할 회원 id와 사용될 락커의 id가 필요하다.
		 * @return Report | Report 객체로 반환.
		 * @throws 
		 */
		
	}
	
	public void AddCenterReport(int category, String content) {
		/**
		 * @brief 센터특이사항추가
		 * @details 센터에 등록된 특이사항게시판에 게시물을 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteCenterReport(int category, String content) {
		/**
		 * @brief 센터특이사항삭제
		 * @details 센터에 등록된 특이사항게시판에 게시물을 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
}
