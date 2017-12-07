import java.util.ArrayList;

/**
 * @brief 센터: '설비' 클래스
 * @details 센터의 설비 관련 책임을 가진 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class CenterFacility {
	
	//Constructor
	public CenterFacility() {}
	
	//Methods
	public void AddEquipment(String equipmentId) {
		/**
		 * @brief 운동기구추가
		 * @details 센터에  운동기구를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteEquipment(String equipmentId) {
		/**
		 * @brief 운동기구삭제
		 * @details 센터에  등록되어있는 운동기구를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Equipment> SearchEquipment() {
		/**
		 * @brief 운동기구탐색
		 * @details 센터에  운동기구를 탐색한다.
		 * @return ArrayList<Equipment>
		 * @throws 
		 */
		
		return new ArrayList<Equipment>();
	}
	
	public void AddLockerData(String lockerId, String memberId) {
		/**
		 * @brief 락커자료 추가
		 * @details 센터에  등록된 락커에 자료를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteLockerData(String lovkerId, String memberId) {
		/**
		 * @brief 락커자료 삭제
		 * @details 센터에 등록된 락커의 자료를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Locker> SearchLockerData() {
		/**
		 * @brief 락커 자료 탐색
		 * @details 센터에  등록된 락커의 자료를 탐색한다.
		 * @return void
		 * @throws 
		 */
		
		return new ArrayList<Locker>();
	}

}
