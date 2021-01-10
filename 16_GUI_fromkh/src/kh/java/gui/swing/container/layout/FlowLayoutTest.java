package kh.java.gui.swing.container.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import kh.java.common.util.MyUtil;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest(int x, int y, int w, int h) {
		MyUtil.init(this, x, y, w, h);
		
		//기본 BorderLayout에서 FlowLayout으로 변경
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//버튼 추가
		for(int i = 0; i < 15; i++) {
			JButton btn = new JButton(String.valueOf(i + 1));
			add(btn);
		}
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest(200,200, 800, 500).setVisible(true);
	}

}
