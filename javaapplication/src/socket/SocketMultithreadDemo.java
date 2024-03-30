package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketMultithreadDemo extends Thread {

	Socket skt;
	int count=0;

	public SocketMultithreadDemo(Socket skt) {
		this.skt = skt;
		count++;
	}
	
	public void run() {
		System.out.println("User - "+count);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			PrintStream ps = new PrintStream(skt.getOutputStream());
			String msg;
			StringBuffer sb;
			do {
				msg = br.readLine();
				
				sb = new StringBuffer(msg);
				sb.reverse();
				
				ps.println(sb.toString());
				
			}while(!msg.equals("dne"));
			
			br.close();
			ps.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {

		try (ServerSocket ss = new ServerSocket(2000)) {
			Socket skt ;
			SocketMultithreadDemo smd;
			do {
				skt = ss.accept();
				smd=new SocketMultithreadDemo(skt);
				smd.start();
			}while(true);
		}
	}

}

class Client3{
	public static void main(String args[]) throws Exception {
		
		Socket skt = new Socket("localhost",2000);
		
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		PrintStream ps = new PrintStream(skt.getOutputStream());
		
		String msg;
		do {
			msg = keyb.readLine();
			
			ps.println(msg);
			
			msg = br.readLine();
			System.out.println("Form server -- "+msg);
			
		}while(!msg.equals("dne"));
		
		ps.close();
		br.close();
		keyb.close();
		skt.close();
	}
}
