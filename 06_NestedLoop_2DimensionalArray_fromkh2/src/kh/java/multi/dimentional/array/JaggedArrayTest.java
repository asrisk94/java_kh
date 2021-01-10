package kh.java.multi.dimentional.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 가변배열
 * 2차원배열의 길이가 각각 다른 경우
 * 
 *
 */
public class JaggedArrayTest {

	public static void main(String[] args) {
		JaggedArrayTest j = new JaggedArrayTest();
//		j.test1();
		j.test2();
		
	}
	/**
	 * @실습문제 : 
	 * 	3행짜리 2차원배열을 선언후에, 각행별 열의 개수는 사용자에게 입력받으세요
	 *  1~100사이의 난수를 대입후에...
	 *  5의배수만 출력하세요.
	 *  
	 *  5의 배수가 하나도 없다면 "5의배수가 존재하지 않습니다" 출력.
	 *  
	 *  
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		
		//1. 2차원 배열 할당
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열개수 입력 : ");
			int col = sc.nextInt();
			arr[i] = new int[col];
		}
		
		//2. 요소에 정수 대입
		Random rnd = new Random();
		boolean flag = false; //5의 배수가 존재하는가?
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(100) + 1;
				
				//5의  배수여부 검사
				if(arr[i][j] % 5 == 0) {
					flag = true;
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		if(!flag) 
			System.out.print("5의 배수가 존재하지 않습니다.");
		
		System.out.println("\n-------------------------");
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void test1() {
		//2차원배열의 크기를 지정하지 않는다.
		int[][] arr = new int[2][];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//각각할당 
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//요소별 값할당
		arr[0][0] = 20;
		arr[0][1] = 30;
		arr[0][2] = 40;
		
		arr[1][0] = 100;
		arr[1][1] = 200;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d%n", i, j, arr[i][j]);
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
