package kh.java.network.socket.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;



public class ChatClient {

	final String SERVER_IP = "localhost";	// 현재 컴퓨터가 가리키는 도메인 (나는 아이넷어드레스 겟로컬호스트)
											//내 컴퓨터로 접속하면 ip는 127.0.0.1로 받아짐.
	final int PORT = 7777;

	public static void main(String[] args) {
		
		ChatClient cc = new ChatClient();
		
		cc.start();
	}
	
	public void start() {
		
		// 1. client 소켓 생성
		try {
			Socket clientSocket = new Socket(SERVER_IP, PORT);
			System.out.println("[" + SERVER_IP + ":" + PORT + "]에 접속중...");
			
			// 2. 입출력 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
			
			// 3. 통신
			Scanner sc = new Scanner(System.in);
			String inMsg = "";
			
			while((inMsg = br.readLine()) != null) {
				
				System.out.println("서버 : " + inMsg);
				System.out.print("클라이언트(나) : ");
				String outMsg = sc.nextLine();
				pw.println(outMsg);
				pw.flush();
				if("exit".equals(outMsg)) {
					break;
				}
			}
			System.out.println("[서버와 연결이 종료되었습니다.]");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
