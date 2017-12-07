import java.util.ArrayList;

/**
 * @brief 센터: '설비' 클래스
 * @details 센터의 설비 관련 책임을 가진 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class CenterMgmt {
	
	//Constructor
	public CenterMgmt() {}
	
	//Methods
	public Report GetCenterStatistic(String startPeriod, String endPeriod) {
		/**
		 * @brief 센터통계산출
		 * @details 센터의 통계를 산출한다. 매출통계, 회원통계, 환불내역탐색, PT스케줄, 월급통계, 직원출근부가 산출된다.
		 * @return Report
		 * @throws 
		 */
		
		return new Report();
	}
	
	public void JoinMember(String id, String password) {
		/**
		 * @brief 회원가입
		 * @details 센터에 회원을 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public String GetStaffSchedule() {
		/**
		 * @brief 직원 스케줄 산출
		 * @details 센터 직원에 대한 스케줄을 산출한다. 전체 직원에 대한 스케줄 산출을 수행한다.
		 * @return String
		 * @throws 
		 */
		
		return new String();
	}
	
	
	public ArrayList<StaffSchedule> GetPersonalTrainingSchedule(String startPeriod, String endPeriod) {
		/**
		 * @brief PT스케줄 산출
		 * @details 센터에 등록된 PT자료를 통해 PT스케줄을 산출한다.
		 * @return ArrayList<PersonalTrainingData>
		 * @throws 
		 */
		
		return new ArrayList<StaffSchedule>();
	}
	
	public void AddGoods(String goodsId) {
		/**
		 * @brief 상품추가
		 * @details 센터에 상품을 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteGoods(String goodsId) {
		/**
		 * @brief 상품삭제
		 * @details 센터에  등록된 상품을 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Goods> SearchGoods() {
		/**
		 * @brief 상품탐색
		 * @details 센터에 등록되어있는 상품을 탐색한다.
		 * @return Goods | ArrayList<Goods>
		 * @throws 
		 */
		
		return new ArrayList<Goods>();
	}
	
	
	public void AddCenterReportData(String category, String title, String content) {
		/**
		 * @brief 센터특이사항자료추가
		 * @details 센터에  센터 특이사항 자료를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteCenterReportData(String category, String title, String content) {
		/**
		 * @brief 센터특이사항자료삭제
		 * @details 센터에 등록된 센터특이사항자료를 삭제한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public void ModifyCenterReportData(String category, String title, String content) {
		/**
		 * @brief 센터특이사항자료수정
		 * @details 센터에 등록된 센터특이사항자료를 수정한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public ArrayList<CenterReport> SearchCenterReport() {
		/**
		 * @brief 센터특이사항자료탐색
		 * @details 센터에  등록된 센터특이사항자료를 탐색한다.
		 * @return ArrayList<CenterReport>
		 * @throws 
		 */
		
		return new ArrayList<CenterReport>();
	}
}
