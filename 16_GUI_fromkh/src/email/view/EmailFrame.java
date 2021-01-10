package email.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import email.controller.EmailController;
import email.model.vo.EmailVO;
import kh.java.common.util.MyUtil;

/**
 * view
 * 
 * 사용자 보게될 화면을 담당하는 클래스
 * 
 *
 */
public class EmailFrame extends JFrame {

	private EmailController controller = new EmailController();
	
	public EmailFrame(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);

		JLabel title = new JLabel("이메일을 입력해주세요");
		JTextField emailInput = new JTextField();
		JButton btn = new JButton("저장");
		
		add(title, BorderLayout.NORTH);
		add(emailInput);
		add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String email = emailInput.getText();
				
				if(email.length() == 0) {
					JOptionPane.showMessageDialog(null, "이메일을 작성해주세요.");
					return;
				}
				
				EmailVO vo = new EmailVO(email);
				
				//컨트롤러에 이메일 저장 요청 - 해당메소드 호출
				controller.saveEmail(vo);
				
				JOptionPane.showMessageDialog(null, "이메일을 저장했습니다.");
				
				emailInput.setText("");
				
			}
			
		});
		
	}
}





