package email.controller;

import email.io.EmailIO;
import email.model.vo.EmailVO;

public class EmailController {
	
	private EmailIO emailIO = new EmailIO();

	public void saveEmail(EmailVO vo) {
		//IO객체에게 saveEmail 요청
		emailIO.saveEmail(vo);
	}
	
}
