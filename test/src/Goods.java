import java.util.ArrayList;

/**
 * @brief 상품
 * @details 센터의 상품과 관련된 책임을 가지는 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class Goods {
	
	private int categoryId;
	private int goodsId;
	private String goodsName;
	private int money;
	private int salesGoal;
	private String validDate;

	//Constructor
	public Goods(int categoryId, int goodsId, String goodsName, int money, String validDate) {
		this.categoryId = categoryId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.money = money;
		this.validDate = validDate;
	}
	
	public Goods() {}
	
	//Getters and Setters
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getSalesGoal() {
		return salesGoal;
	}
	
	public void setSalesGoal(int salesGoal) {
		this.salesGoal = salesGoal;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	
	
	//Methods
	public void AddGoodsInfo() {
		/**
		 * @brief 상품정보추가
		 * @details 센터에 상품정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	

	public void DeleteGoodsInfo() {
		/**
		 * @brief 상품정보삭제
		 * @details 센터에 상품정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<Goods> SendGoodsInfo() {
		/**
		 * @brief 상품정보탐색
		 * @details 센터에 상품정보를 탐색한다.
		 * @return Goods | ArrayList<Goods>
		 * @throws 
		 */
		
		return new ArrayList<Goods>();
	}
}
