package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseSocketDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(2000);
		
		//use this socket to communicate with the client
		Socket skt = ss.accept();
		
		System.out.print("Server communication accepted");
		
		//for reading input stream
		//the below line is getting input stream from socket and then it is given to input stream reader to convert it to reader from stream
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		
		//to give output to client
		PrintStream ps = new PrintStream(skt.getOutputStream());
		
		String msg;
		StringBuffer sb;
		do {
			//for reading message
			msg = br.readLine();
			
			//for reversing the string
			sb=new StringBuffer(msg);
			sb.reverse();
			msg = sb.toString();
			
			//for writing msg
			ps.println(msg);
		}while(!msg.equals("dne"));
		
		skt.close();
		ss.close();
		
	}

}

