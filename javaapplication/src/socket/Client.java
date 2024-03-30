package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client{
	public static void main(String args[]) throws Exception {
		Socket skt = new Socket("localhost",2000);
		
		//get input from keyboard
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));

		PrintStream ps = new PrintStream(skt.getOutputStream());
		
		String msg;
		do {
		
			//read msg from keyboard
			msg=keyb.readLine();
			
			//send msg to server
			ps.println(msg);
			
			//read msg from server;
			msg = br.readLine();
			
			System.out.println("From server "+msg);
			
		}while(!msg.equals("dne"));
		
		skt.close();
	}
}