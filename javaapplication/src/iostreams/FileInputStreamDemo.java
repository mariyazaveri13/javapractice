package iostreams;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("D:/MARIYA/java/JAva.txt");
//			byte b[] = new byte[fis.available()];
//			fis.read(b);
//			String str = new String(b);
//			System.out.print(str);
			
			int x;	
			do {
				x=fis.read();
				System.out.print((char)x);
			}while(x!=-1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.print(e);
		}
	}

}
