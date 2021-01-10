package com.kh.test.multi.dimentional.array;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.exercise1();
	}
	
	/**
	 * 1. 4행4열 2차원배열 선언 및 생성
	 * 2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
	 * 3. 아래의 내용처럼 처리함
     * 
     * <li>		0열	1열	2열	3열</li>	
     * <li>0행	값	값	값 	0행 값들의 합계</li>
     * <li>1행	값	값	값	1행 값들의 합계</li>
     * <li>2행	값	값	값	2행 값들의 합계</li>
	 * <li>3행     0열합  1열합  2열합  전체합 </li>
	 * 
	 */
	private void exercise1() {
		int[][] arr = new int[4][4];
		int rowSum = 0;
		int col0Sum = 0;
		int col1Sum = 0;
		int col2Sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			//행마다 초기화되어야 하므로, inner loop이전에 작성
			rowSum = 0;
			
			for(int j=0; j<arr[i].length; j++) {

				//0 1 2행일때
				if(i != arr.length - 1) {
					
					int rnd = (int)(Math.random()*100)+1;
					
					//0 1 2열인 경우
					if(j != arr[i].length-1) {
						arr[i][j] = rnd;
						rowSum += rnd;
						
						//열별 누적합
						switch(j) {
						case 0 : col0Sum += rnd; break;
						case 1 : col1Sum += rnd; break;
						case 2 : col2Sum += rnd; break;
						}
						
					}
					//3열인 경우 합계대입
					else {
						arr[i][j] = rowSum;
					}
					
				}
				//3행일때
				else {
					
					switch(j) {
					case 0: arr[i][j] = col0Sum; break;
					case 1: arr[i][j] = col1Sum; break;
					case 2: arr[i][j] = col2Sum; break;
					case 3: arr[i][j] = col0Sum + col1Sum + col2Sum; break;
					}
					
				}
				
				
			}
//			System.out.println(col0Sum + " " + col1Sum + " " + col2Sum);
		}
	
		//값읽기
		String header = "\t0열\t1열\t2열\t3열\n"
					  + "-----------------------------------------------------------";
		System.out.println(header);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+"행\t");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

}
