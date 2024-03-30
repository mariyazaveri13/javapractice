package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo {

	public static void main(String[] args) throws Exception{

		ServerSocket ss = new ServerSocket(3000);
		Socket skt = ss.accept();
		
		System.out.println("Server communication established");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		PrintStream ps = new PrintStream(skt.getOutputStream());
		
		String msg;
		StringBuffer sb;
		
		do {
			msg = br.readLine();
			
			sb = new StringBuffer(msg);
			sb.reverse();
			msg = sb.toString();
			
			ps.println(msg);
			
		}while(!msg.equals("dne"));
		
		skt.close();
		ss.close();	
	}
}

class Client2{
	public static void main(String args[]) throws Exception {
		
		Socket skt = new Socket("localhost",3000);
		
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		
		PrintStream ps = new PrintStream(skt.getOutputStream());
		
		String msg;
		do {
			msg = keyb.readLine();
			
			ps.println(msg);
			
			msg = br.readLine();
			
			System.out.println("Server : "+msg);
			
		}while(!msg.equals("dne"));
		
		skt.close();
		
	}
}