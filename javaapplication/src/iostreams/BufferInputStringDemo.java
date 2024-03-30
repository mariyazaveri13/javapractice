package iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis = new FileInputStream("D:/MARIYA/java/JAva.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			byte[] b = bis.readAllBytes();
			
			System.out.println(new String(b));
			bis.close();
			fis.close();
			
			//Main reason for buffer is mark is possible in buffered input stream
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
