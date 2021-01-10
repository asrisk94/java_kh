package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import kh.java.common.util.MyUtil;



/**
 * JTable - Model
 * 
 * JScrollPane(container)
 * 
 * 
 *
 */
public class JTableTest extends JFrame {
	public class Member implements Serializable {
		private String name;
		private String addr;
		private int age;
		private boolean married;
		public Member() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Member(String name, String addr, int age, boolean married) {
			super();
			this.name = name;
			this.addr = addr;
			this.age = age;
			this.married = married;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isMarried() {
			return married;
		}
		public void setMarried(boolean married) {
			this.married = married;
		}
		@Override
		public String toString() {
			return "Member [name=" + name + ", addr=" + addr + ", age=" + age + ", married=" + married + "]";
		}
	}
	//JTableTest의 필드
	List<Member> list = new ArrayList<>();
	//초기화블럭
	{
		list.add(new Member("홍길동", "서울", 25, false));
		list.add(new Member("신사임당", "경기", 48, true));
		list.add(new Member("세종대왕", "광주", 76, true));
		list.add(new Member("홍길동", "서울", 25, false));
		list.add(new Member("신사임당", "경기", 48, true));
		list.add(new Member("세종대왕", "광주", 76, true));
		list.add(new Member("홍길동", "서울", 25, false));
		list.add(new Member("신사임당", "경기", 48, true));
		list.add(new Member("세종대왕", "광주", 76, true));
		list.add(new Member("홍길동", "서울", 25, false));
		list.add(new Member("신사임당", "경기", 48, true));
		list.add(new Member("세종대왕", "광주", 76, true));
	}
	public JTableTest(int x, int y, int width, int height) {
		MyUtil.init(this, x, y, width, height);
		//화면 가운데 위치 시키기
		setLocationRelativeTo(null);
		//1. 데이터 준비
		//컬럼정보
		Object[] columns = {
			"이름", "주소", "나이", "결혼여부"	
		};
		//실데이터
		Object[][] data = new Object[list.size()][];	// 행 12개, 열 모름
		for(int i = 0; i < list.size(); i++) {
			//Member -> Object[] -> data에 추가
			Member m = list.get(i);
			Object[] o = {
				m.getName(), m.getAddr(), m.getAge(), m.isMarried()	
			};
			data[i] = o;
		}
		//2. 테이블 생성
		JTable table = new JTable(data, columns);
		//컬럼별 정렬기능 사용
		table.setAutoCreateRowSorter(true);
		//3. JScrollPane에 담기
		JScrollPane scrollPane = new JScrollPane(table);
		//저장 버튼
		JButton btn = new JButton("저장");
		add(scrollPane);
		add(btn, BorderLayout.SOUTH);
		//버튼 액션이벤트핸들러 바인딩
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TableModel model = table.getModel();
				int rowLen = model.getRowCount();				// rowLen : 행 갯수
				int colLen = model.getColumnCount();			// colLen : 열 갯수
				List<Member> anotherList = new ArrayList<>();
				for(int i = 0; i < rowLen; i++) {
					Member newMember = new Member();
					for(int j = 0; j < colLen; j++) {
						Object data = model.getValueAt(i, j);
						System.out.print(data + " ");
						//각 열(셀)의 정보를 가져다 Member객체 생성 
						//-> anotherList에 추가
						switch(j) {
						case 0: newMember.setName(String.valueOf(data)); break;
						case 1: newMember.setAddr(String.valueOf(data));break;
						case 2: newMember.setAge(Integer.parseInt(data.toString()));break;
						case 3: newMember.setMarried(Boolean.parseBoolean(data.toString()));break;
						}
					}
					anotherList.add(newMember);
					System.out.println();
				}
				System.out.println("-------------------------------");
				System.out.println(anotherList);
			}
		});
	}
	public static void main(String[] args) {
		new JTableTest(100,100,500,200).setVisible(true);
	}
}