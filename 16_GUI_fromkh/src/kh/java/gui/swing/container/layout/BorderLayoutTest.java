package kh.java.gui.swing.container.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import kh.java.common.util.MyUtil;

public class BorderLayoutTest extends JFrame {
	
	/**
	 * 
	 * JFrame의 기본  LayoutManager객체는 BorderLayout객체이다.
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public BorderLayoutTest(int x, int y, int width, int height) {
//		setBounds(x, y, width, height);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyUtil.init(this, x, y, width, height);
		
		System.out.println(getLayout());
		
		JButton n = new JButton("북");
		JButton s = new JButton("남");
		JButton e = new JButton("동");
		JButton w = new JButton("서");
		JButton c = new JButton("가운데");
		
		//프레임에 추가
		add(n, BorderLayout.NORTH);
		add(s, BorderLayout.SOUTH);
		add(e, BorderLayout.EAST);
		add(w, BorderLayout.WEST);
		add(c, BorderLayout.CENTER);//기본값
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutTest(200, 200, 500, 500);
	}

}
