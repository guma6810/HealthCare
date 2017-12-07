
/**
 * @brief 사용자 클래스
 * @details 센터의 사용자의 부모 클래스이다.
 * @author 이요셉
 * @date 2017-11-04
 * @version 0.0.1
 */


public abstract class User {
	private String id;				/** 사용자 id */
	private String userKey;			/** 사용자 key... email 주소 사용됨. */
	private String password;		/** 사용자 password */
	private String name;			/** 사용자 이름 */
	private String gender;			/** 성별 */
	private String birthDate;		/** 생년월일 */
	private String address;			/** 주소 */
	private String mobile;			/** 연락처 */
	
	//constructor
	public User(String id, String userKey, String password, String name, String gender, String birthDate, String address, String mobile) {
		this.id = id;
		this.userKey = userKey;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
		this.mobile = mobile;
	}
	
	public User() {}
	
	//Getters and Setters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return mobile;
	}

	public void setPhone(String mobile) {
		this.mobile = mobile;
	}
	
	//Methods
	public void Login() {}
	public void Logout() {}
	
	

}
