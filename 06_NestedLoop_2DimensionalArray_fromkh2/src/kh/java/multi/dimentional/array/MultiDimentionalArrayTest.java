package kh.java.multi.dimentional.array;

/**
 * 2차원배열
 * - 참조의 참조형태로 2차원배열을 생성할수 있다.
 * - 간단히 행/열을 이용해서 배열을 다룰수 있다. 
 *
 */
public class MultiDimentionalArrayTest {

	public static void main(String[] args) {
		MultiDimentionalArrayTest m = 
				new MultiDimentionalArrayTest();
//		m.test1();
//		m.test2();
//		m.test3();
//		m.test4();
		m.test5();
	}
	
	/**
	 * 2차원 배열 구조
	 */
	public void test5() {
		int[][] arr = new int[2][3];
		
		
	}
	
	/**
	 * 1 2 3 4
	 * 5 6 7 8
	 * 9 10 11 12
	 * 
	 * 2 4 6 8
	 * 10 12 14 16
	 * 18 20 22 24
	 */
	public void test4() {
		int[][] arr = new int[3][4];
		int k = 2;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				//값대입
				arr[i][j] = k;
				k += 2;
				
				//값출력
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2차원배열 2 * 26
		// A B C D ....Z
		// a b c d ....z
		char[][] alpha = new char[2][26];
		
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < alpha[0].length; j++) {
				if(i == 0)
					alpha[i][j] = (char)('A' + j);
				else
					alpha[i][j] = (char)('a' + j);
				
				System.out.print(alpha[i][j] + " ");
			}
			System.out.println();
		}
	
		
		
	}
	
	/**
	 * 2 * 5
	 * 
	 * A B C D E
	 * a b c d e
	 */
	public void test3() {
		char[][] alphabet = {
				{'A', 'B', 'C', 'D', 'E'},
				{'a', 'b', 'c', 'd', 'e'}
			};
		
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 0; j < alphabet[0].length; j++) {
				System.out.println(alphabet[i][j]);
			}
		}
		
		
	}
	
	public void test2() {
		String[][] m = new String[5][6];
		m[0][0] = "이원빈";
		m[0][1] = "김동현";
		m[0][2] = "유영국";
		m[0][3] = "강준혁";
		m[0][4] = "정인식";
		m[0][5] = "권송현";

		m[1][0] = "김진하";
		m[1][1] = "주진홍";
		m[1][2] = "유선아";
		m[1][3] = "정다미";
		m[1][4] = "김지헌";
		m[1][5] = "김지훈";
		
		m[2][0] = "한광희";
		m[2][1] = "정다솜";
		m[2][2] = "이상원";
		m[2][3] = "이제환";
		m[2][4] = "황현준";
		m[2][5] = "정다빈";
		
		m[3][0] = "황수빈";
		m[3][1] = "김지수";
		m[3][2] = "김자경";
		m[3][3] = "박소연";
		m[3][4] = "서강석";
		m[3][5] = "유리";
		
		m[4][0] = "정소희";
		m[4][1] = "사영리";
		m[4][2] = "강송이";
		m[4][3] = "강유정";
		m[4][4] = "이효정";
		m[4][5] = "이수연";
		
		System.out.println(m.length);
		System.out.println(m[0].length);
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void test1() {
		
		//1. 배열 선언
		// int[][] 타입
		int[][] arr;
		
		//2. 할당
		arr = new int[2][3];
		
//		int[][] arr = new int[2][3];
		
		//3. 요소에 값대입
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		for(int i = 0; i < 2; i++) {
		
			for(int j = 0; j < 3; j++) {
//				System.out.println(i + ", " + j);
				System.out.println(arr[i][j]);
			}
		}
		
		
		
		
		
	}
	
}
