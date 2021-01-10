package kh.java.inherit.object.user;

/**
 * Override Overriding
 * 자식클래스에서 부모클래스의 메소드를 재작성 
 * 1. 메소드명, 파라리터 타입 및 개수, 리턴타입 모두 동일해야함.
 * 		- @Override 어노테이션을 통해 컴파일타임 체크
 * 2. 접근제한자는 부모메소드보다 확장할 수 있다.
 * 		- default -> protected -> public 방향으로 변경 가능
 *		- private메소드 직접 접근할 수 없으므로 override불가
 *		- final메소드는 override불가
 * 3. 부모메소드가 던지는 예외클래스는 더 적은범위로 수정 가능
 * 		- 개수를 줄이거나 상속관계를 고려해 자식클래스로 변경
 * 		
 */
public final class User {

	private String username;
	private String password;
	
	public User() {
		
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	/**
	 * 복사생성자
	 * 동일한 필드값을 가진 새로운 객체 생성
	 */
	public User(User u) {
		this.username = u.username;
		this.password = u.password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "[username = " + username + ", password = " + password + "]";
	}
	
	/**
	 * 필드값 username, password가 같다면 동일한 객체로 취급한다.
	 */
	@Override
	public boolean equals(Object obj) {
		//obj.username Object타입은 username, password필드에 접근할 수 없다.
		User other = (User)obj;//Object타입을 User타입으로 형변환
		
		if(!username.equals(other.username))
			return false;
		
		if(!password.equals(other.password))
			return false;
	
		
		return true;
	}
	
	/**
	 * equals 비교에 사용했던 필드값을 가져와 hashCode생성에 사용
	 * 문자열 hashCode 생성 사용
	 */
	@Override
	public int hashCode() {
		return (username + password).hashCode();
	}
	
	/**
	 * 공변반환타입 Covariant Return Type
	 * 오버라이딩시 부모메서드의 반환타입을 자식클래스타입으로 변경 가능
	 * jdk 1.5
	 * 
	 */
	@Override
	public User clone() {
		//복사생성자
		return new User(this);
	}
}


//class UserDetail extends User{}




