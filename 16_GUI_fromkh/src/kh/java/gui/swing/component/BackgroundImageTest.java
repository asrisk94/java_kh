package kh.java.gui.swing.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.common.util.MyUtil;

public class BackgroundImageTest extends JFrame {

	public BackgroundImageTest(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);
	
		JPanel panel = new ImagePanel("images/background.jpg");
		
		add(panel);
	}
	
	public class ImagePanel extends JPanel {
		
		private Image image;
		private int w;
		private int h;
		
		public ImagePanel(String fileName) {
			
			try {
				w = 500;
				h = 500;
				image = ImageIO.read(new File(fileName))
							   .getScaledInstance(w, h, Image.SCALE_DEFAULT);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w, h);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this);
		}
		
		
	}

	public static void main(String[] args) {
		new BackgroundImageTest(100,100,500,500).setVisible(true);
	}

}
