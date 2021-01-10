package kh.java.gui.swing.container.layout;

import static kh.java.common.util.MyUtil.init;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NullLayoutTest extends JFrame {

	public NullLayoutTest(int x, int y, int width, int height) {
		init(this, x, y, width, height);
		
		//LayoutManager를 사용하지 않음.
		setLayout(null);
		
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(50, 100, 60, 50);
		
		//행(row)열(column)
		//column은 flowLayout사용시에 지정.
		//nullLayout에서는 size로 너비 지정.
		JTextField idInput = new JTextField();//컬럼수
		idInput.setBounds(110, 100, 200, 50);
		
		
		JLabel pwLabel = new JLabel("패스워드: ");
		pwLabel.setBounds(50, 160, 60, 50);
		
		JPasswordField pwInput = new JPasswordField();
		pwInput.setBounds(110, 160, 200, 50);
		
		JButton btn = new JButton("로그인");
		btn.setBounds(320, 100, 100, 110);
		
		add(idLabel);
		add(idInput);
		
		add(pwLabel);
		add(pwInput);
		
		add(btn);
		
		
	}
	
	public static void main(String[] args) {
		new NullLayoutTest(50, 50, 500, 500).setVisible(true);
	}

}
