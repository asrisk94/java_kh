package kh.java.gui.swing.container;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		JFrameTest j = new JFrameTest();
		j.test1();
//		j.test2();
	}

	/**
	 * 커스텀 JFrame객체 만들기 2
	 */
	private void test2() {
		new MyFrame();
	}

	/**
	 * 최상위컨테이너 JFrame객체 만들기 1
	 */
	private void test1() {
		
		JFrame mainFrame = new JFrame();
		
		//타이틀 지정
		mainFrame.setTitle("Hello Swing :)");
		
		//리사이즈 불가
		mainFrame.setResizable(false);
		
		//창크기
//		mainFrame.setSize(800, 500);
		
		//위치: offsetX, offsetY
//		mainFrame.setLocation(300, 200);
		
		//창크기, 위치 동시지정
		mainFrame.setBounds(300, 200, 800, 500);
		
		//닫기버튼 -> 프로그램 종료
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//시각화처리 설정 맨 마지막에 처리할 것.
		mainFrame.setVisible(true);
	}

}
