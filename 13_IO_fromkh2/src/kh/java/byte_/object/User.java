package kh.java.byte_.object;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 객체입출력스트림에 사용될 클래스는 반드시 Serializable인터페이스를 구현해야함.
 * 
 * 직렬화/역직렬화
 * 객체의 정보를 이진데이터로 나열해서 관리하기 위한 방법
 * 
 * Serializable을 구현하지 않고, 객체입출력스트림에서 사용하게 되면,
 * NotSerializableException을 던진다.
 * 
 * 
 * 
 */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String userId;
	private transient String password;
	private String userName;
	private Date regDate;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String password, String userName, Date regDate) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.regDate = regDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", userName=" + userName + ", regDate=" + regDate
				+ "]";
	}
	
	
	
	
	
}
