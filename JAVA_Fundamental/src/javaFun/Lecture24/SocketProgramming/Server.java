package javaFun.Lecture24.SocketProgramming;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

class ClientThread extends Thread{
	
	ClientThread(Socket sock){
		
	}
	
	
	
}

public class Server {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket();
			InetSocketAddress ipep = new InetSocketAddress("127.0.01",10101);
			server.bind(ipep);
			
			while(true) {
				Socket clientAccess = server.accept();
				
			}
			
		}catch(Exception e) {
			System.out.println("에러코드:001" + e);
		}
		
	}
}
