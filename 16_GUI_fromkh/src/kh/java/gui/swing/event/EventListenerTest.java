package kh.java.gui.swing.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import kh.java.common.util.MyUtil;

/**
 * 이벤트리스너를 작성하는 방법
 * 1. 내부클래스
 * 2. 익명클래스(추상클래스, 인터페이스 직접 객체로 생성)
 * 3. 프레임클래스에서 인터페이스 구현하기
 * 
 */
public class EventListenerTest 
					extends JFrame 
					implements ActionListener {

	JButton btn;
	
	public EventListenerTest(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);
		
		setLayout(new FlowLayout());
		
		btn = new JButton("클릭");
		JLabel label = new JLabel("안녕");
		
		//1.내부클래스를 바인딩
//		btn.addActionListener(new CustomListener());
	
		//2. 익명클래스 : 클래스작성&객체생성
		//지역내부클래스
//		ActionListener listener = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("익명클래스로 작성!");
//				label.setText("좋지?");
//			}
//			
//		};
//		btn.addActionListener(listener);
		
		//3.프레임클래스가 리스너인터페이스 구현
		btn.addActionListener(this);
		
		add(label);
		add(btn);
		
	}
	
	public class CustomListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("내부클래스로 작성!");
		}
		
	}
	

	public static void main(String[] args) {
		new EventListenerTest(200,200,300,200).setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("프레임클래스가 리스너인터페이스 구현!");
	}

}
