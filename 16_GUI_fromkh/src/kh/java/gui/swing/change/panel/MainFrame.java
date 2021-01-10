package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.common.util.MyUtil;

public class MainFrame extends JFrame {

	//다른 JPanel객체에서 접근할 수 있도록 static자원으로 패널
	public static JPanel[] panels = new JPanel[3];
	
	public MainFrame(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);
		
		panels[0] = new CustomPanel(this, Color.green, "panel1");
		panels[1] = new CustomPanel(this, Color.pink, "panel2");
		panels[2] = new CustomPanel(this, Color.yellow, "panel3");
		
		add(panels[0]);
	}

}




