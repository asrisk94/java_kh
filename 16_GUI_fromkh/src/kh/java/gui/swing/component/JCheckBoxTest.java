package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.common.util.MyUtil;


public class JCheckBoxTest extends JFrame {
	
	JLabel result;
	
	public JCheckBoxTest(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);
		
		topPanel();
		checkboxPanel();
		resultPanel();
		
	}

	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel title = new JLabel("과일을 선택하세요(복수개 가능)");
		panel.add(title);
		add(panel, BorderLayout.NORTH);
	}

	private void checkboxPanel() {
		JPanel panel = new JPanel();
		String[] strFruits = {
			"사과", "오렌지", "귤", "포도", "수박"	
		};
		
		//1.JCheckBox생성 및 JCheckBox[]추가
		JCheckBox[] chkArr = new JCheckBox[strFruits.length];
		for(int i = 0; i < strFruits.length; i++) {
			JCheckBox chk = new JCheckBox(strFruits[i]);
			chkArr[i] = chk;
			panel.add(chk);
		}
		
		//2.이벤트리스너 바인딩
		for(int i = 0; i < chkArr.length; i++) {

			chkArr[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("actionPerformed!");
					
					String str = "";
					int cnt = 0;
					
					for(int i = 0; i < chkArr.length; i++) {
						if(chkArr[i].isSelected()) {
							cnt++;
							str += chkArr[i].getText() + " ";
						}
					}
					
					if(cnt == 0)
						str = "선택한 과일이 없습니다.";
					else
						str = "[" + str + "]를 선택하셨습니다.";
					
					result.setText(str);
					
					
				}
				
			});
		}
		
		add(panel);
		
	}

	private void resultPanel() {
		JPanel panel = new JPanel();
		result = new JLabel("선택된 과일이 없습니다.");
		panel.add(result);
		add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new JCheckBoxTest(100,100,300,300).setVisible(true);
	}	

}
