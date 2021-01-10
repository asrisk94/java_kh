package kh.java.gui.swing.event;

import static kh.java.common.util.MyUtil.init;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 1. 저수준 이벤트
 * 	- 마우스
 * 	- 키보드
 *  - 포커스관련...
 *  
 * 2. 고수준 semantic 이벤트
 *	- 컴포넌트 별로 작성된 이벤트
 *	- ActionEvent
 *  - ItemEvent...
 *  
 * 이벤트리스너 구현
 *  - 1. 리스너 인터페이스 
 *  - 2. 어댑터 클래스 (추천) - 추상메소드 구현강제화 
 */
public class MouseEventTest extends JFrame {
	
	JLabel label; 
	
	public MouseEventTest(int x, int y, int width, int height) {
		super("마우스 이벤트"); // String title을 처리하는 JFrame생성자
		init(this, x, y, width, height);
		
		//패널 생성
		JPanel panel = new JPanel();
		label = new JLabel("마우스");
		panel.add(label);
		
		//패널에 이벤트 핸들러객체 바인딩
//		MyMouseListener listener = new MyMouseListener();
		MyMouseListener2 listener = new MyMouseListener2();
		panel.addMouseListener(listener);
		
		//패널 추가
		add(panel);
		
	}
	
	/**
	 * 
	 * Listener 추상메소드를 우선 구현한 Adapter클래스를 상속하면,
	 * 원하는 메소드 오버라이딩이 가능하다.
	 * 
	 */
	public class MyMouseListener2 extends MouseAdapter {
		
		@Override
		public void mousePressed(MouseEvent e) {
			label.setText("마우스를 누르셨습니다.");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			label.setText("마우스를 떼셨습니다.");
		}
	}
	
	public class MyMouseListener 
		implements MouseListener, MouseMotionListener, MouseWheelListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			label.setText("mouseClicked");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			label.setText("mousePressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			label.setText("mouseReleased");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			label.setText("mouseEntered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			label.setText("mouseExited");
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

	public static void main(String[] args) {
		
		new MouseEventTest(300,300,300,200).setVisible(true);
	}

}
