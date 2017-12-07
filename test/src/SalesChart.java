import java.util.ArrayList;

/**
 * @brief 매출전표
 * @details 센터의 매출을 기록을 책임지는 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class SalesChart {
	private int transactionId;
	private String time;
	private int money;
	private int transcationType;
	private String salesGoodsName;
	private String etc;
	
	
	//Constructor
	public SalesChart(int transactionId, String time, int money, int transactionType, String salesGoodsName, String etc) {
		this.transactionId = transactionId;
		this.time = time;
		this.money = money;
		this.transcationType = transactionType;
		this.salesGoodsName = salesGoodsName;
		this.etc = etc;
	}
	
	public SalesChart(String time, int money, int transactionType, String salesGoodsName, String etc) {
//		this.transactionId = transactionId; transaction Id for Auto incl from db.
		this.time = time;
		this.money = money;
		this.transcationType = transactionType;
		this.salesGoodsName = salesGoodsName;
		this.etc = etc;
	}
	
	public SalesChart() {}
	
	//Getters and Setters
	
	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getTranscationType() {
		return transcationType;
	}

	public void setTranscationType(int transcationType) {
		this.transcationType = transcationType;
	}

	public String getSalesGoodsName() {
		return salesGoodsName;
	}

	public void setSalesGoodsName(String salesGoodsName) {
		this.salesGoodsName = salesGoodsName;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	//Methods
	public void AddSalesInfo() {
		/**
		 * @brief 매출정보추가
		 * @details 센터에 매출정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	

	public void DeleteSalesInfo() {
		/**
		 * @brief 매출정보삭제
		 * @details 센터에 매출정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<SalesChart> SendSalesInfo() {
		/**
		 * @brief 매출정보전송
		 * @details 센터에 매출정보를 전송한다.
		 * @return ArrayList<SalesChart>
		 * @throws 
		 */
		
		return new ArrayList<SalesChart>();
	}

}
