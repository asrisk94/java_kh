package kh.java.gui.swing.container.layout;

import static kh.java.common.util.MyUtil.init;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 사용자 이벤트 -> 이벤트 핸들러(기대하는 다음 코드 작성)
 * 
 *
 */
public class CardLayoutTest extends JFrame {

	private CardLayout cardLayout = new CardLayout(); 
	
	public CardLayoutTest(int x, int y, int width, int height) {
		init(this, x, y, width, height);
		
		//LayoutManager객체를 지정
		setLayout(cardLayout);
		
		//패널생성
		JPanel card1 = new CardPanel("card1", Color.orange);
		JPanel card2 = new CardPanel("card2", Color.cyan);
		JPanel card3 = new CardPanel("card3", new Color(255, 0, 0));
		
		//컴포넌트와 이벤트핸들러객체 바인딩
		MyMouseListener listener = new MyMouseListener();
		card1.addMouseListener(listener);
		card2.addMouseListener(listener);
		card3.addMouseListener(listener);
		
		add(card1); // panel -> frame
		add(card2);
		add(card3);
	}

	public static void main(String[] args) {
		new CardLayoutTest(300, 300, 800, 500).setVisible(true);
	}
	
	//이벤트 핸들러(Listener) 클래스
	//내부클래스에서는 외부클래스의 필드/메소드에 접근할수 있다.
	public class MyMouseListener extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouseClicked!");
			
			//card layout객체에 접근 : 다음 카드 보여주기
			//JFrame - RootPane - JPanel
			JPanel src = (JPanel)e.getSource(); // 이벤트 발생한 객체
			Container parent = src.getParent();
			
			System.out.println("src = " + src);
			System.out.println("parent = " + parent);
			
			cardLayout.next(parent);
			
		}
	}
	
	//내부클래스
	public class CardPanel extends JPanel {
		
		public CardPanel(String title, Color c) {
			JLabel label = new JLabel(title);
			setBackground(c);
			
			add(label);//label -> panel
		}
		
	}

}
