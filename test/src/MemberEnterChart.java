import java.util.ArrayList;

/**
 * @brief 회원입장전표
 * @details 센터의 회원의 입장를 기록하는 책임이 있는 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class MemberEnterChart {
	private String memberId;
	private String time;
	private int state;

	//Constructor
	public MemberEnterChart(String memberId, String time, int state) {
		this.memberId = memberId;
		this.time = time;
		this.state = state;
	}
	
	public MemberEnterChart() {}
	
	
	//Getters and setters
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public void AddMemberEnterInfo() {
		/**
		 * @brief 회원입장정보추가
		 * @details 센터에 입장한 회원의 정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}

	public void DeleteMemberEnterInfo() {
		/**
		 * @brief 회원입장정보삭제
		 * @details 센터에 입장한 회원의 정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<MemberEnterChart> SearchMemberEnterInfo() {
		/**
		 * @brief 회원입장정보탐색
		 * @details 센터에 입장한 회원의 정보를 탐색한다.
		 * @return MemberEnterChart | ArrayList<MemberEnterChart>
		 * @throws 
		 */
		
		return new ArrayList<MemberEnterChart>();
	}
	
}
