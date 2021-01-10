package kh.java.gui.swing.component;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.common.util.MyUtil;

public class ImageIconTest extends JFrame {

	public ImageIconTest(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);
		
		JPanel panel = new JPanel();
		JLabel imgContainer = new JLabel();
		
		//이미지 크기 그대로 표시
//		imgContainer.setIcon(new ImageIcon("images/user.png"));

		//Icon인터페이스 <--- ImageIcon클래스
		//Image추상클래스 : 크기변경 메소드 제공
		ImageIcon icon = new ImageIcon("images/user.png");
		Image img = icon.getImage();
		img = img.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		imgContainer.setIcon(new ImageIcon(img));
		
		panel.add(imgContainer);
		add(panel);
		
		//컴포넌트의 크기에 따라 컨테이너 크기 조절
//		pack();
		
	}

	public static void main(String[] args) {
		new ImageIconTest(100,100,200,200).setVisible(true);
	}

}
