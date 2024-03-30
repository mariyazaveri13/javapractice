package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("D:/MARIYA/java/JAva2.txt");
			String str = "JAVA IS SUPER";
			fos.write(str.getBytes());
			fos.close();
			
			FileInputStream fis = new FileInputStream("D:/MARIYA/java/JAva2.txt");
			byte b[] = new byte[fis.available()];
			fis.read(b);
			String str2 = new String(b);
			
			FileOutputStream fos2 = new FileOutputStream("D:/MARIYA/java/JAva2Copied.txt");
			fos2.write(str2.toLowerCase().getBytes());
			fos2.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
	}

}
