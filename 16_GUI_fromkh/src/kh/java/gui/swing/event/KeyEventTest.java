package kh.java.gui.swing.event;

import static kh.java.common.util.MyUtil.init;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame {

	JTextField input;
	JTextArea textArea;
	
	public KeyEventTest(int x, int y, int w, int h) {
		super("Key Event");
		init(this, x, y, w, h);
		
		input = new JTextField();
		textArea = new JTextArea();
		textArea.setEditable(false); // 읽기 전용
		
		//이벤트핸들러 바인딩
		input.addKeyListener(new MyKeyListener2());
		
		add(input, BorderLayout.NORTH);
		add(textArea);
		
		
	}
	
	public class MyKeyListener2 extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			char key = e.getKeyChar();
			int code = e.getKeyCode();
			
			System.out.println("key = " + key + ", code = " + code);
//			System.out.println(e);
			
			//엔터키를 누를경우, JTextField -> JTextArea에 쓰기
			if(code == KeyEvent.VK_ENTER) {
				String text = input.getText();
				textArea.append(text + "\n");
				
				input.setText("");//초기화
			}
			
		}
	}
	
	
	public class MyKeyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		new KeyEventTest(100, 100, 300, 100).setVisible(true);
	}

}
