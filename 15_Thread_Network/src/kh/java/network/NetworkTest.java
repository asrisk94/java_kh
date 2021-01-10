package kh.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;



public class NetworkTest {

	public static void main(String[] args) {
		
		NetworkTest n = new NetworkTest();
		
		n.test();
//		n.test2();
	}
	
	private void test2() {
		
		try {
			URL url1 = new URL("https://docs.oracle.com:443/javase/8/docs/api/java/lang/String.html");
			System.out.println(url1.getProtocol());
			System.out.println(url1.getHost());
			System.out.println(url1.getPort());
			System.out.println(url1.getPath());
			
			
			
			// 연결(세션) 객체 생성
			URLConnection conn = url1.openConnection();
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
			
			// 파일로 저장
			String fileName = "String.html";
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			
			
			
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
				bw.write("\n");
			}
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	private void test() {
		
		try {	// InetAddress 클래스 - ip주소를 표현한 클래스
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());
			
			InetAddress[] navers = InetAddress.getAllByName("naver.com");
			
			for(InetAddress arr : navers) {
				System.out.println(arr.getHostAddress());
			}
			
			// 내 IP 찾기
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("내 ip : " + localhost);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
