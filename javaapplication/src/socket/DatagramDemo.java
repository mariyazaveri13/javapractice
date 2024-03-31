package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramDemo {

	public static void main(String[] args) throws Exception{
		//if client is not recieving any data then data gram socket does not need port no
		DatagramSocket ds = new DatagramSocket(2001);
		String msg = "Helllo world";
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(),
				InetAddress.getByName("localhost"),2000);
		
		//for recieving the packet
		byte b[] = new byte[1024];
		dp = new DatagramPacket(b, 1024);
		ds.receive(dp);
		msg = new String(dp.getData()).trim();
		System.out.println("From server : "+msg);
		
		ds.close();
	}

}



class Server {

	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket(2000);
		
		//for recieving the packet
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, 1024);
		ds.receive(dp);

		String msg = new String(dp.getData()).trim();
		System.out.println("From client : "+msg);

		StringBuilder sb=new StringBuilder(msg);
		sb.reverse();
		msg= sb.toString();

		
		dp = new DatagramPacket(msg.getBytes(), msg.length(),
				InetAddress.getByName("localhost"),2001);
		
		ds.send(dp);
		ds.close();
	}

}
