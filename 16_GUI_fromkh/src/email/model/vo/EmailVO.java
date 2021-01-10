package email.model.vo;

import java.io.Serializable;

public class EmailVO implements Serializable {

	private String email;

	public EmailVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmailVO(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmailVO [email=" + email + "]";
	}
	
	
	
}
