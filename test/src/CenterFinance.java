import java.util.ArrayList;

/**
 * @brief 센터: '재무' 클래스
 * @details 센터의 재무관련 책임을 가진 클래스. 매출통계, 환불내역 산출, 월급통계 등을 책임진다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class CenterFinance {

	//Constructor
	public CenterFinance() {}
	
	//Methods
	public Report GetCenterSalesStatistic(String startPeriod, String endPeriod) {
		/**
		 * @brief 센터매출통계산출
		 * @details 센터에서 일정기간동안 발생한 센터의 매출통계를 산출한다.
		 * @return Report
		 * @throws 
		 */
		
		return new Report();
	}
	
	public Report GetRefundList(String startPeriod, String endPeriod) {
		/**
		 * @brief 환불내역산출
		 * @details 센터에서 일정기간동안 발생한 센터의 환불통계를 산출한다.
		 * @return Report
		 * @throws 
		 */
		
		return new Report();
	}
	
	public Report GetMonthPayStatistic(String startPeriod, String endPeriod) {
		/**
		 * @brief 월급통계 산출
		 * @details 센터에서 일정기간동안의 월급통계를 산출한다.
		 * @return Report
		 * @throws 
		 */
		
		return new Report(); 
	}
	
	public void AddSales(int money, String goodsId) {
		/**
		 * @brief 매출추가
		 * @details 센터에서 발생한 매출을 가록한다. 수기 입력한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void DeleteSales(int money, String goodsId) {
		/**
		 * @brief 매출삭제
		 * @details 센터에서 일정기간동안 발생한 센터의 매출을 삭제한다. 수기 입력한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<SalesChart> SearchSales(String startPeriod, String endPeriod) {
		/**
		 * @brief 매출탐색
		 * @details 센터에서 일정기간동안 발생한 센터의 매출을 탐색한다. 
		 * @return SalesChart | ArrayList<SalesChart>
		 * @throws 
		 */
		
		return new ArrayList<SalesChart>();
	}
	
	public void AddRefund(String refundTime, String goodsBuyDate, Manager managerInCharge, int refundMoney, String reason) {
		/**
		 * @brief 환불추가
		 * @details 센터에서 발생한 환불내역을 입력한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<RefundChart> SearchRefund(String startPeriod, String endPeriod) {
		/**
		 * @brief 환불탐색
		 * @details 센터에서 발생하여 환불전표로 저장되어있는 환불기록을 탐색한다.
		 * @return ArrayList<RefundChart>
		 * @throws 
		 */
		
		return new ArrayList<RefundChart>();
	}
	
	public void AddSTaffMonthPayData(String date, int money) {
		/**
		 * @brief 직원월급자료추가
		 * @details 센터에 등록되어있는 직원에 대해 월급자료를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<StaffMonthPayChart> SearchStaffMonthPayData(String startPeriod, String endPeriod) {
		/**
		 * @brief 직원월급자료 탐색
		 * @details 센터에 등록되어있는 직원에 대한 월급자료를 탐색한다.
		 * @return void
		 * @throws 
		 */
		
		return new ArrayList<StaffMonthPayChart>();
	}
	
	
	
}
