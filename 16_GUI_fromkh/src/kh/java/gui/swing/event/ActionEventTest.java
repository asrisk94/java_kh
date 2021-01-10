package kh.java.gui.swing.event;

import static kh.java.common.util.MyUtil.init;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ActionEventTest extends JFrame {
	
	JTextField idInput;
	JPasswordField pwInput;
	
	public ActionEventTest(int x, int y, int width, int height) {
		init(this, x, y, width, height);
		
		//LayoutManager를 사용하지 않음.
		setLayout(null);
		
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(50, 100, 60, 50);
		
		//행(row)열(column)
		//column은 flowLayout사용시에 지정.
		//nullLayout에서는 size로 너비 지정.
		idInput = new JTextField();//컬럼수
		idInput.setBounds(110, 100, 200, 50);
		
		
		JLabel pwLabel = new JLabel("패스워드: ");
		pwLabel.setBounds(50, 160, 60, 50);
		
		pwInput = new JPasswordField();
		pwInput.setBounds(110, 160, 200, 50);
		
		JButton btn = new JButton("로그인");
		btn.setBounds(320, 100, 100, 110);
		
		//버튼 이벤트 핸들러 바인딩 : Action Event
		btn.addActionListener(new MyButtonListener());
		
		add(idLabel);
		add(idInput);
		
		add(pwLabel);
		add(pwInput);
		
		add(btn);
	}

	public class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("actionPerformed");
			
			//아이디/패스워드 입력값 가져오기
			String id = idInput.getText();
			char[] pwArr = pwInput.getPassword();
			String password = new String(pwArr);
			
			if(id.length() == 0)
				JOptionPane.showMessageDialog(null, "아이디를 입력하세요!");
			else if(password.length() == 0)
				JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요!");
			else {
				System.out.println("id = " + id);
				System.out.println("password = " + password);				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new ActionEventTest(50, 50, 500, 500).setVisible(true);
	}

}
