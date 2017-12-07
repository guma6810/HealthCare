import java.util.ArrayList;

/**
 * @brief 사용자: '대표' 클래스
 * @details 센터의 대표에 대한 클래스이다.
 * @author 이요셉
 * @date 2017-10-12
 * @version 0.0.1
 */

public class President extends User {
	
	private int salesGoal; 			/** 목표매출 */
	
	public President(String id, String password, String name, String gender, String birthDate, String address, String phone) {
		super(id, password, name, gender, birthDate, address, phone);
		
	}
	
	public President(String id, String password, String name, String gender, String birthDate, String address, String phone, int slaesGoal) {
		super(id, password, name, gender, birthDate, address, phone);
		this.salesGoal = salesGoal;
		
	}
	
	
	//Gettters and setters
	public int getSalesGoal() {
		return salesGoal;
	}

	public void setSalesGoal(int salesGoal) {
		this.salesGoal = salesGoal;
	}

	//Methods
	public Report GetCenterStatistic() {
		/**
		 * 
		 * @brief 센터의 통계를 조회한다.
		 * @details 센터의 통계를 조회한다. 매출통계, 환불통계, 회원통계, 직원출근부, 월급통계, PT스케줄 조회가 포함된다.
		 * @return Report | Report 객체로 반환.
		 * @throws 
		 */
		
		return new Report();
		
	}
	
	

	public ArrayList<CenterReport> GetCenterReport() {
		/**
		 * 
		 * @brief 센터특이사항조회
		 * @details 특이사항게시판에 등록된 특이사항을 불러온다.
		 * @return ArrayList<CenterReport> | 특이사항 자료의 ArrayList로 반환됨.
		 * @throws 
		 */
		
		
		return new ArrayList<CenterReport>();
	}
	
	public ArrayList<RefundChart> GetRefund() {
		/**
		 * @brief 환불조회
		 * @details 센터에 등록된 환불요청을 조회한다.
		 * @return RefundChart | ArrayList<RefundChart>
		 * @throws 
		 */
		
		return new ArrayList<RefundChart>();
	}
	
	public String GetStaffSchedule() {
		/**
		 * @brief 직원 스케줄 조회
		 * @details 센터의 직원들에 대한 스케줄을 조회한다.
		 * @return String
		 * @throws 
		 */
		
		return new String();
	}
	
	
	public void InputStaffBasicPay(String staffId, int money) {
		/**
		 * @brief 직원 기본급 입력
		 * @details 직원의 기본급을 입력한다.
		 * @param String staffId (직원 id)
		 * @param int money (금액)
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void InputStaffBonusPay(String staffId, int money) {
		/**
		 * @brief 직원의 상여금 입력
		 * @details 직원의 상여급을 입력한다.
		 * @param String staffId (직원 id)
		 * @param int money (금액)
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void InputStaffIncentive(String staffId, int money) {
		/**
		 * @brief 직원 인센티브 입력
		 * @details 직원에게 인센티브를 부여한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public void AddSales() {
		/**
		 * @brief 매출추가
		 * @details 센터에 매출을 추가한다.
		 * @return void
		 * @throws 
		 */
	}
	public void DeleteSales() {
		/**
		 * @brief 매출삭제
		 * @details 센터의 매출을 삭제한다.
		 * @return void
		 * @throws 
		 */
	}
	public void ModifySales() {
		/**
		 * @brief 매출수정
		 * @details 센터의 매출을 수정한다.
		 * @return void
		 * @throws 
		 */
	}
	
	
	public void AddCenterSchedule() {
		/**
		 * @brief 센터특이사항추가
		 * @details 센터 특이사항 게시판에 특이사항을 추가한다.
		 * @return void
		 * @throws 
		 */
	}
	public void DeleteCenterSchedule() {
		/**
		 * @brief 센터특이사항삭제
		 * @details 센터 특이사항 게시판에 특이사항을 삭제한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public void ModifyCenterSchedule() {
		/**
		 * @brief 센터특이사항수정
		 * @details 센터 특이사항 게시판의 게시물을 수정한다.
		 * @return void
		 * @throws 
		 */
	}
	
	public void AddStaff(String staffId, String password) {
		/**
		 * @brief 직원추가
		 * @details 센터에 직원을 신규 생성하여 추가한다.
		 * @param String staffId (직원 id)
		 * @param String password (직원 비밀번호)
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void AddCenterReport(String content) {
		/**
		 * @brief 센터특이사항 입력
		 * @details 센터의 특이사항 게시판에 게시물을 등록한다.
		 * @param String content
		 * @return void
		 */
		
	}
	
	public void DeleteCenterReport(String reportId) {
		/**
		 * @brief 센터 특이사항 삭제
		 * @details 센터 특이사항 게시판에 등록된 특이사항 게시물을 삭제한다.
		 * @param String reportId (게시물 id)
		 * @return void
		 */
		
	}
	
	public ArrayList<CenterReport> SearchCenterReport() {
		/**
		 * @brief 센터특이사항 조회
		 * @details 센터 특이사항 게시판에 등록된 게시물을 불러온다.
		 * @return ArrayList<CenterReport> 게시물 내용의 묶음을 반환한다.
		 * @throws
		 */
		
		return new ArrayList<CenterReport>();
		
	}
	
	public void AddGoodsCategory(String categoryId) {
		/**
		 * @brief 상품대분류추가
		 * @details 센터에 등록된 상품의 대분류를 추가한다.
		 * @param String categoryId (상품 대분류의 id)
		 * @return void
		 */
		
	}
	
	public void DeleGoodsCategory(String categoryId) {
		/**
		 * @brief 상품대분류삭제
		 * @details 센터에 등록된 상품의 대분류를 삭제한다.
		 * @param String categoryId (상품 대분류의 id)
		 * @return 
		 * @throws 
		 */
		
	}

	public void DeleteGoods(String goodsId) {
		/**
		 * @brief 상품삭제
		 * @details 센터에 등록된 상품을 삭제한다.
		 * @param String goodsId (상품id)
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Goods> SearchGoods() {
		/**
		 * @brief 상품탐색
		 * @details 센터에 등록된 상품을 탐색한다.
		 * @return ArrayList<Goods> 상품 리스트 전체를 반환한다.
		 * @throws 
		 */
		
		return new ArrayList<Goods>();
		
	}
}
