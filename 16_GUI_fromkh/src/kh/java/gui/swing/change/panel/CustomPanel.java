package kh.java.gui.swing.change.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.common.util.MyUtil;

public class CustomPanel extends JPanel {
	
	JFrame mainFrame;
	
	public CustomPanel(JFrame f, Color c, String title) {
		this.mainFrame = f;
		setBackground(c);
		add(new JLabel(title));
		
		for(int i = 0; i < 3; i++) {
			//이동하고자 하는 패널의 인덱스를 버튼작성
			JButton btn = new JButton(String.valueOf(i));
			add(btn);
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					int idx = Integer.parseInt(btn.getText());
					//mainFrame
					//현재패널 CustomPanel.this
					//다음패널 panels[idx]
					
//					System.out.println(CustomPanel.this);
//					System.out.println(MainFrame.panels[idx]);
					
					MyUtil.changePanel(f, CustomPanel.this, MainFrame.panels[idx]);
					
				}
				
			});
		}
		
		
	}
	
}



