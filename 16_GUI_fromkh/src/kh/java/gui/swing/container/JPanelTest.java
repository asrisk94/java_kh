package kh.java.gui.swing.container;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame {

	/**
	 * 컨테이너는 내부컴포넌트를 배치하기위한 LayoutManager객체를 가지고 있다.
	 * - JFrame : BorderLayout(기본값)
	 * - JPanel : FlowLayout(기본값)
	 * 
	 */
	public JPanelTest() {
		setLocation(200, 200);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Null Layout : LayoutManager객체를 사용하지 않는것.
		setLayout(null);
		
		//JPanel생성 및 프레임에 추가
		JPanel p1 = new JPanel();
		p1.setSize(150,300);
		p1.setLocation(0,0);
		p1.setBackground(Color.GREEN);
		
		JLabel label1 = new JLabel("panel1");
		p1.add(label1);
		
		JPanel p2 = new JPanel();
		p2.setSize(150,300);
		p2.setLocation(150,0);
		p2.setBackground(Color.YELLOW);
		
		JLabel label2 = new JLabel("panel2");
		p2.add(label2);
		
		add(p1, BorderLayout.WEST);
		add(p2);
		
		setVisible(true);
	}
	
//	/**
//	 * 컨테이너는 내부컴포넌트를 배치하기위한 LayoutManager객체를 가지고 있다.
//	 * - JFrame : BorderLayout(기본값)
//	 * - JPanel : FlowLayout(기본값)
//	 * 
//	 */
//	public JPanelTest() {
//		setLocation(200, 200);
//		setSize(300, 300);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		//JPanel생성 및 프레임에 추가
//		JPanel p1 = new JPanel();
//		p1.setBackground(Color.GREEN);
//		
//		JLabel label1 = new JLabel("panel1");
//		p1.add(label1);
//		
//		JPanel p2 = new JPanel();
//		p2.setBackground(Color.YELLOW);
//		
//		JLabel label2 = new JLabel("panel2");
//		p2.add(label2);
//		
//		add(p1, BorderLayout.WEST);
//		add(p2);
//		
//		setVisible(true);
//	}
	
	public static void main(String[] args) {
		new JPanelTest();
	}

	
	

}
