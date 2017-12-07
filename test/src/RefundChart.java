import java.util.ArrayList;

/**
 * @brief 환불전표
 * @details 센터의 환불의 기록을 책임지는 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class RefundChart {
	
	private int refundId; //환불 id
	private int salesChartId; // 매출 전표 id
	private String staffId; // 직원 id
	private String memberId;
	private String refundTime; // 환불 시간
	private String goodsBuyDate; // 상품구매일자
	private int deductMoney; // 공제금액
	private int refundMoney; // 환불금액
	private String reason; // 사유
	
	public int getRefundId() {
		return refundId;
	}

	public int getSalesChartId() {
		return salesChartId;
	}

	public String getStaffId() {
		return staffId;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public String getRefundTime() {
		return refundTime;
	}

	public String getGoodsBuyDate() {
		return goodsBuyDate;
	}

	public int getDeductMoney() {
		return deductMoney;
	}

	public int getRefundMoney() {
		return refundMoney;
	}

	public String getReason() {
		return reason;
	}

	//Constructor
	public RefundChart() {}
	
	public RefundChart(int refundId, int salesChartId, String staffId, String memberId, String refundTime, String goodsBuyDate, int deductMoney, int refundMoney, String reason) {
		this.refundId = refundId;
		this.salesChartId = salesChartId;
		this.staffId = staffId;
		this.memberId = memberId;
		this.refundTime = refundTime;
		this.goodsBuyDate = goodsBuyDate;
		this.deductMoney = deductMoney;
		this.refundMoney = refundMoney;
		this.reason = reason;
		
	}
	
	public void setRefundId(int refundId) {
		this.refundId = refundId;
	}

	public void setSalesChartId(int salesChartId) {
		this.salesChartId = salesChartId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public void setGoodsBuyDate(String goodsBuyDate) {
		this.goodsBuyDate = goodsBuyDate;
	}

	public void setDeductMoney(int deductMoney) {
		this.deductMoney = deductMoney;
	}

	public void setRefundMoney(int refundMoney) {
		this.refundMoney = refundMoney;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}

	public void AddRefundInfo() {
		/**
		 * @brief 환불정보추가
		 * @details 센터에 환불정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteRefundInfo() {
		/**
		 * @brief 환불정보삭제
		 * @details 센터에 환불정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<RefundChart> SendRefundInfo() {
		/**
		 * @brief 환불정보탐색
		 * @details 센터에 환불정보를 탐색한다.
		 * @return ArrayList<RefunChart>
		 * @throws 
		 */
		
		return new ArrayList<RefundChart>();
	}
	
	

}
