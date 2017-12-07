import java.util.ArrayList;

/**
 * @brief 락커
 * @details 센터에 설치되어있는 락커정보를 기억하는 책임을 가진 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class Locker {
	
	private int lockerId;
	private String memberId;
	private int state;
	
	public int getLockerId() {
		return lockerId;
	}
	public String getMemberId() {
		return memberId;
	}
	public int getState() {
		return state;
	}
	
	
	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setState(int state) {
		this.state = state;
	}
	//Constructor
	public Locker() {}

	public Locker(int lockerId, String memberId, int state) {
		this.lockerId = lockerId;
		this.memberId = memberId;
		this.state = state;

	}
	
	//Methods
	public void AddLockerInfo() {
		/**
		 * @brief 락커정보추가
		 * @details 센터의 락커에 정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteLockerInfo() {
		/**
		 * @brief 릭카장보삭제
		 * @details 센터의 락커에 저장되어있는 정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Locker> SendLockerInfo() {
		/**
		 * @brief 릭카장보탐색
		 * @details 센터의 락커에 저장되어있는 정보를 탐색한다.
		 * @return ArrayList<Locker>
		 * @throws 
		 */
		
		return new ArrayList<Locker>();
	}
	

}
