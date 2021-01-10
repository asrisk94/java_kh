package kh.java.network.socket.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	
	final int PORT = 7777;
	
	
	public static void main(String[] args) {
		
		ChatServer cs = new ChatServer();
		
		cs.start();
		
	}
	
	public void start() {
		
		// 1. 서버 소켓 생성
		ServerSocket serverSocket;
		
		try {
			
			serverSocket = new ServerSocket(PORT);
			InetAddress ip = InetAddress.getLocalHost();
		
			
			while(true) {	// 클라이언트로부터 계속 요청을 받음
				System.out.println("[" + ip + ":" + PORT + "]에서 서버 연결중");
				
				// 2. client 접속대기 - 새로운 소켓을 만들어 통신
				Socket socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress().getHostAddress() + "]로부터 연결 요청");
				
				// 3. 입출력 스트림을 통한 통신
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				PrintWriter pw = new PrintWriter(os);	// 보조스트림 필요 없음. 라이터만 있음. 리더는 없음
				
				// 4. 메시지 전송
				pw.println("환영합니다 :)");
				pw.flush();	// 버퍼 내용 즉시 전송 (한 줄 꽉 차야 전송하기 때문에 그냥 변기물내림(flush) 해버림)
				
				Scanner sc = new Scanner(System.in);
				String inMsg = "";
				
				while((inMsg = br.readLine()) != null) {
					if("exit".equals(inMsg)) {
						break;
					}
					System.out.println("클라이언트 : " + inMsg);
					System.out.print("서버(나) : ");
					String outMsg = sc.nextLine();
					pw.println(outMsg);
					pw.flush();
				}
				System.out.println("[클라이언트가 채팅을 종료했습니다.]");
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
