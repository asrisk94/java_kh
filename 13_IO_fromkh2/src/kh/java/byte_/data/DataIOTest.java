package kh.java.byte_.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest {

	public static void main(String[] args) {
		DataIOTest d = new DataIOTest();
//		d.test1();
//		d.test2();
		d.test3();
	}

	/**
	 * 총점 평균 구하기
	 */
	private void test3() {
		DataInputStream dis = null;
		File f = new File("data/scores.dat");
		int sum = 0;
		int cnt = 0;
		
		try {
			dis = new DataInputStream(new FileInputStream(f));
			
			while(true) {
				sum += dis.readInt();
				cnt++;
			}
			
		} catch (EOFException e) {
//			e.printStackTrace();
			System.out.println(sum);
			
			System.out.println(cnt + "명의 데이터");
			
			System.out.println((double)sum / cnt);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	/**
	 * 기록
	 */
	private void test2() {
		DataOutputStream dos = null;
		File f = new File("data/scores.dat");
		
		try {
			dos = new DataOutputStream(new FileOutputStream(f));
			int[] scores = {80,90,70,60,44,20,100,80,50,75,100,90,28,99};
			
			for(int s : scores) {
				dos.writeInt(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * DataInputStream
	 * DataOuputStream
	 * 자료형을 단위로 읽거나 쓰는 스트림
	 * 적절한 자료형별 읽기/쓰기 메소드를 사용.
	 * 자료형이 섞여있는 경우, 순서가 매우 중요하다.
	 */
	private void test1() {
		File f = new File("data/sample.dat");
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(f));
			dis = new DataInputStream(new FileInputStream(f));
			
			//쓰기
			dos.writeInt(100);
			dos.writeDouble(123.456);
			dos.writeBoolean(true);
			dos.writeUTF("안녕하세요");
			
			//읽기
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
