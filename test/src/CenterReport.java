import java.util.ArrayList;
import java.util.Date;
/**
 * @brief 센터특이사항
 * @details 센터에 등록된 특이사항을 기억하는 책임이 있는 클래스이다.
 * @author 이요셉
 * @date 2017-10-21
 * @version 0.0.1
 */

public class CenterReport {

	private int postId; //게시물 아이디
 	private String staffId; // 직원 아이디
	private int categoryId; // 대분류 아이디
	private String time; //작성 시간
	private String title; // 제목
	private String content; //내용
	private int state; //상태

	public String getStaffId() {
		return staffId;
	}

	public int getPostId() {
		return postId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getTime() {
		return time;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getState() {
		return state;
	}
	
	
	public void setPostId(int postId) {
		this.postId = postId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setState(int state) {
		this.state = state;
	}

	//Constructor
	public CenterReport() {};
	
	public CenterReport(int postId, String staffId, int categoryId, String time, String title, String content, int state) {
		this.postId = postId;
		this.staffId = staffId;
		this.categoryId = categoryId;
		this.time = time;
		this.title = title;
		this.content = content;
		this.state = state;
	}
	
	
	//Methods
	public void AddCenterReportInfo() {
		/**
		 * @brief 특이사항정보추가
		 * @details 센터에 입력된 특이사항 정보를 추가한다.
		 * @return void
		 * @throws 
		 */
		
	}
	public void DeleteCenterReportInfo() {
		/**
		 * @brief 특이사항정보삭제
		 * @details 센터에 입력된 특이사항 정보를 삭제한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public void ModifyCenterReportInfo() {
		/**
		 * @brief 특이사항정보수정
		 * @details 센터에 입력된 특이사항 정보를 수정한다.
		 * @return void
		 * @throws 
		 */
		
	}
	
	public ArrayList<CenterReport> SendCenterReportInfo() {
		/**
		 * @brief 특이사항정보탐색
		 * @details 센터에 입력된 특이사항 정보를 탐색한다.
		 * @return CenterReport | ArrayList<CenterReport>
		 * @throws 
		 */
		
		return new ArrayList<CenterReport>();
	}
	
}
