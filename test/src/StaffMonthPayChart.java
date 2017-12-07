import java.util.ArrayList;

/**
 * @brief 직원월급전표
 * @details 직원의 월급여 지급을 기록을 책임지는 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class StaffMonthPayChart {
	private int chartId;
	private String staffId;
	private String date; //시점
	private int typeId; //종류
	private int money; //금액
	
	public int getChartId() {
		return chartId;
	}

	public String getDate() {
		return date;
	}

	public int getTypeId() {
		return typeId;
	}

	public int getMoney() {
		return money;
	}

	public String getStaffId() {
		return staffId;
	}

	//Constructor
	public StaffMonthPayChart() {}
	
	public StaffMonthPayChart(int chartId, String staffId, String date, int typeId, int money) {
		this.chartId = chartId;
		this.staffId = staffId;
		this.date = date;
		this.typeId = typeId;
		this.money = money;
		
	}
	//Methods
	public void AddMonthPayInfo() {
		/**
		 * @brief 직원월급정보추가
		 * @details 센터에 등록외어있는 직원의 월급정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteMonthPayInfo() {
		/**
		 * @brief 직원월급정보t삭제
		 * @details 센터에 등록외어있는 직원의 월급정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<StaffMonthPayChart> SendStaffMonthPayInfo() {
		/**
		 * @brief 직원월급정보전송
		 * @details 센터에 등록외어있는 직원의 월급정보를 잔송한다.
		 * @return void
		 * @throws 
		 */
		
		return new ArrayList<StaffMonthPayChart>();
	}
	
}
