package com.mega.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TomcatSocketProgramming {
										// 스트림을 만드는것이기 떄문에(외부처리) 반드시 예외처리 해주어야한다
	public static void main(String[] args) throws IOException {
		// 네트워크 통신을 하기 위해서 Socket(소켓)이 필요.
		// 네트워크 프로그래밍을 소켓 프로그래밍이라고도 한다.
		// 클라이언트의 요청이 들어왔을 때 클라이언트를 선별하여.
		// 승인만을 담당하는 서버 소켓이 필요.
		
		//TCP방식이다.
		// UDP보다 안정적인 방식.
							  // 소켓프로그램에 포트번호가 들어간다  >> 임의적으로 설정할수있다
		ServerSocket server = new ServerSocket(9700);	
		System.out.println("클라이언트의 요청을 기다리는 중");
		// 서버 소켓의 승인이 되면
		// 클라이언트와 서버사이에 통신이 가능하다.
		// 양쪽에 네트워크 통신을 하려면 양쪽다 소켓이 필요하다.
		int count = 0;
		while(true) {
			// 서버 승인
			Socket socket = server.accept();
			count++;
			System.out.println("요청이 승인되어 클라이언트 스트림이 연결됌");
			System.out.println(count + "번 연결됌");
				
			// 서버측은 소켓이 2개가 필요
			// 승인용 소켓, 통신용 소켓이 필요
			
			// 클라이언트의 요청을 계속 받기위해서는
			// 서버가 죽으면 안된다. 무한루프(while)
			String data = "i am a java programmer";
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			out.print(data);
			out.close();
			socket.close();
			
		}

	}
}
