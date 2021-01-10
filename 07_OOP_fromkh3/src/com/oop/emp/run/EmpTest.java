package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	

	public static void main(String[] args) {
		EmpTest t = new EmpTest();
		t.mainMenu();
		
	}
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		String menu = "******* 사원 정보 관리 프로그램 **********\n"
				    + "1. 새 사원 정보 입력\n"
				    + "2. 사원 정보 삭제\n"
				    + "3. 사원정보 출력\n"
				    + "9. 끝내기\n"
				    + "*************************************\n"
				    + "선택하세요 =>";
		int choice = 0;
		Employee e = new Employee();
		
		while(true) {
			System.out.print(menu);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				e = new Employee();
				e.empInput(); 
				break;
			case 2 : 
				e = null;
				System.out.println("사원정보가 삭제 되었습니다.");
				break;
			case 3 :
				if(e != null)
					e.empOutput();
				else
					System.out.println("사원정보를 먼저 입력해주세요.");
				break;
			case 9 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}

	public void mainMenu_() {
		Scanner sc = new Scanner(System.in);
		Employee e = null;
		String menu = "******* 사원 정보 관리 프로그램 **********\n"
				    + "1. 새 사원 정보 입력\n"
				    + "2. 사원 정보 삭제\n"
				    + "3. 사원정보 출력\n"
				    + "9. 끝내기\n"
				    + "*************************************\n"
				    + "선택하세요 =>";
		
		int selected = 0;
		while(true){
			System.out.print(menu);
			selected = sc.nextInt();
			switch (selected) {
				case 1:
					e = new Employee();
					e.empInput();
					break;
				case 2: 
					//사원정보삭제는 참조주소값을 삭제한다.
					//실제 heap영역의 객체 삭제는 garbage collector가 담당.
					e = null; 
					break;
				case 3: 
					//사원정보 미입력시 출력하지 않도록함.
					//NullPointerException 유발
					if(e == null) {
						System.out.println(">>먼저 사원정보를 입력하세요.");
						break;
					}	
					e.empOutput();
					break;
			}
			if(selected==9) break;
		}

	}

}
