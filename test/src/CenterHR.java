import java.util.ArrayList;

/**
 * @brief 센터: '인사' 클래스
 * @details 센터의 인사 관련 책임을 가진 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class CenterHR {
	private MemberDAO mDAO;
	private StaffDAO sDAO;
	
	//Constructor
	public CenterHR() {
		mDAO = new MemberDAO();
		sDAO = new StaffDAO();
	}
	
	// Methods
	public Session AcceptLogin(String id, String pass, int type) {
		/**
		 * @brief 로그인승인 
		 * @details 사용자의 로그인 요청에 대한 처리를 진행한다. 
		 * @return 0 | -1 
		 * @throws
		 */

		if (type == 0) {
			// 회원인 경우
			try {
				Member m1 = mDAO.GetMember(id);
				System.out.println(m1.getName());
				System.out.println("member login:: " + m1.getName());
			} catch (Exception e) {
				System.out.println("등록된 회원이 아닙니다.");
				e.printStackTrace();
			}
		} else {
			// 직원인 경우
			if (id == "") {
			} // 대표인 경우
			else {
				// 일반 직원인 경우
				try {
					Staff s1 = sDAO.GetStaff(id);
					System.out.println("staff login:: " + s1.getName());
				} catch (Exception e) {
					System.out.println("등록된 직원이 아닙니다.");
					e.printStackTrace();
				}
			}
		}

		return new Session();
	}
	
	public Report GetCenterMemberStatistic(String startPeriod, String endPeriod) {
		/**
		 * @brief 센터회원통계산출
		 * @details 일정기간동안의 센터 회원통계를 산출한다.
		 * @return Report
		 * @throws 
		 */
		
		return new Report();
	}
	
	public Report GetStaffAttendanceBooks(String startPeriod, String endPeriod) {
		/**
		 * @brief 직원출근부산출
		 * @details 일정기간동안의 센터 직원출근부를 산출한다.
		 * @return Report
		 * @throws 
		 */
		
		return new Report();
	}
	
	public void AddMember(String id, String password) {
		/**
		 * @brief 회원추가
		 * @details 센터에 회원을 주가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteMember(String id, String password) {
		/**
		 * @brief 회원삭제
		 * @details 센터에 회원을 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Member> SearchMember(String id) {
		/**
		 * @brief 회원탐색
		 * @details 센터에 등록된 회원을 탐색한다.
		 * @return Member | ArrayList<Member>
		 * @throws 
		 */		
		
		return new ArrayList<Member>();
	}
	
	public void AddStaff(String id, String password) {
		/**
		 * @brief 직원추가
		 * @details 센터의 직원을 추가한다.
		 * @return void
		 * @throws 
		 */	
	}
	
	public void DeleteStaff(String id, String password) {
		/**
		 * @brief 직원삭제
		 * @details 센터의 직원을 삭제한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public ArrayList<Staff> SearchStaff(String id) {
		/**
		 * @brief 직원탐색
		 * @details 센터의 직원을 탐색한다.
		 * @return Staff | ArrayList<Staff>
		 * @throws 
		 */
		
		return new ArrayList<Staff>();
	}
	
	public void AddSession() {
		/**
		 * @brief 세선츄가
		 * @details 사용자 인증 후 세션에 추가한다.
		 * @return void
		 * @throws 
		 */	
		
	}
	
	public void DeleteSession() {
		/**
		 * @brief 세선삭제
		 * @details 사용자 인증 후 일정 조건에 따라 세션이 삭제된다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Session> SearchSession() {
		/**
		 * @brief 세션탐색
		 * @details 현재 활성화되어있는 세션을 탐색한다.
		 * @return ArrayList<Session>
		 * @throws 
		 */
		
		return new ArrayList<Session>();
	}
	
	public int AcceptMemberEnter(Member member) {
		/**
		 * @brief 회원센터입장승인
		 * @details 회원의 센터입장을 승인한다.
		 * @return int 0 | 1
		 * @throws 
		 */
		
		return 0;
	}
	
	public int AcceptMemberExit(Member member) {
		/**
		 * @brief 회원센터퇴장승인
		 * @details 회원의 센터퇴장을 승인한다.
		 * @return int 0 | 1
		 * @throws 
		 */
		
		return 0;
	}
	
	public int AcceptStaffGoWork(Staff staff) {
		/**
		 * @brief 직원출근승인
		 * @details 직원의 센터 출근을 승인한다.
		 * @return int 0 | 1
		 * @throws 
		 */
		
		return 0;
	}
	
	public int AcceptStaffLeaveWork(Staff staff) {
		/**
		 * @brief 직원퇴근승인
		 * @details 직원의 센터 퇴근을 승인한다.
		 * @return int 0 | 1
		 * @throws 
		 */
		
		return 0;
	}
	
	public void AddPrivilegeDate() {
		/**
		 * @brief 권한자료추가
		 * @details 권한자료를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeletePrivilegeData() {
		/**
		 * @brief 권한자료삭제
		 * @details 권한자료를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
}
