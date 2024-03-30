package iostreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
	OutputStream os;
	public Producer(OutputStream os){
		this.os = os;
	}
	
	public void run() {
		
		int count = 0;
		while(true) {
			try {
				os.write(count);
				os.flush();
				System.out.println("Producer "+count);
				System.out.flush();
				Thread.sleep(100);
				count++;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Consumer extends Thread{
	InputStream is ;
	
	public Consumer(InputStream is) {
		this.is = is;
	}
	
	public void run() {
		int x;
		while(true) {
			try {
				x=is.read();
				System.out.println("Consumer "+x);
				System.out.flush();
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

public class PipedStreamDemo {
	
	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		
		try {
			pis.connect(pos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Producer p = new Producer(pos);
		Consumer c = new Consumer(pis);
		
		p.start();
		c.start();
	}

}
