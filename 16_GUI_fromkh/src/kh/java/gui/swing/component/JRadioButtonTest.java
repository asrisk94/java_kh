package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import kh.java.common.util.MyUtil;

public class JRadioButtonTest extends JFrame {
	
	JLabel result;
	
	public JRadioButtonTest(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);
		
		initTopPanel();
		initMenuPanel();
		initResultPanel();
	
	}

	private void initResultPanel() {
		JPanel panel = new JPanel();
		result = new JLabel("메뉴를 선택하지 않으셨습니다.");
		panel.add(result);
		add(panel, BorderLayout.SOUTH);
		
	}

	private void initMenuPanel() {
		JPanel panel = new JPanel();
		
		//라디오버튼을 추가
		JRadioButton americano = new JRadioButton("아메리카노");
		JRadioButton latte = new JRadioButton("카페 라떼");
		JRadioButton macchiato = new JRadioButton("마키아또");
		
		//라디오버튼을 그룹핑
		ButtonGroup group = new ButtonGroup();
		group.add(americano);//AbstractButton
		group.add(latte);
		group.add(macchiato);
		
		//이벤트리스너 바인딩
		Enumeration<AbstractButton> menus = group.getElements();
		
		while(menus.hasMoreElements()) {
			AbstractButton btn = menus.nextElement();
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
//					System.out.println("메뉴 선택!");
					JRadioButton btn = (JRadioButton)e.getSource();
					String selected = btn.getText();
					
					result.setText("[" + selected + "]를 선택하셨습니다.");
					
				}
				
			});
		}
		
		
		//패널에 추가
		panel.add(americano);
		panel.add(latte);
		panel.add(macchiato);
		
		add(panel);//center
		
	}

	private void initTopPanel() {
		JPanel panel = new JPanel();
		JLabel title = new JLabel("커피를 주문하세요");
		panel.add(title);
		add(panel, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new JRadioButtonTest(100,100,300,150).setVisible(true);
	}

}
