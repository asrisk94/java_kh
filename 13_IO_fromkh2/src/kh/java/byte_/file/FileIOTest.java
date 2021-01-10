package kh.java.byte_.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		FileIOTest f = new FileIOTest();
//		f.test1();
		f.test2();
	}
	

	/**
	 * 기본스트림  + 보조스트림
	 */
	private void test2() {
		String fileName = "file/myfile.txt";
		String copy = "file/newCopy.txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(fileName));
			bos = new BufferedOutputStream(new FileOutputStream(copy));
			
			int data = 0;
			
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}



	/**
	 * file -> JVM 파일입력
	 * JVM -> file 파일 출력
	 */
	private void test1() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String fileName = "C:\\Users\\user1\\Downloads\\screenshot.png";
		String copy = "file/screenshot.png";
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(copy);
			
			//(0~255)256가지 + 1(값없음 -1)
			int data = 0;
			
			while((data = fis.read()) != -1) {
				System.out.print((char)data + " ");
				
				fos.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원반납
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
