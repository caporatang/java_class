package com.mega.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ManyClients {

	public static void main(String[] args) throws Exception {
		// 소켓은 네트워크 통신 >> 아이피와 포트가 필요
		// 통신연결이기 떄문에 전화를 거는쪽이 이 클래스이기 떄문에 연결할 포트를 입력해준다.
		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost", 9700);
			System.out.println("클라이언트 소켓 시작.");
			System.out.println("서버로 요청 됌");			
			
			// 아래 세줄과 같은 코드							// 인풋 스트림 리더는 브릿지 클래스
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = buffer.readLine();
			System.out.println("서버로부터 받은 데이터는 >>" + data);
		// 버퍼 리더와 같은 코드이다
//			InputStream input = socket.getInputStream();
//			InputStreamReader reader = new InputStreamReader(input);
//			BufferedReader buffer = new BufferedReader(reader);
			
		}

	}

}
