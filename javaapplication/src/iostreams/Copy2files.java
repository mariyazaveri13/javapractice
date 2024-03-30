package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Copy2files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("D:/MARIYA/java/JAva.txt");
			FileInputStream fis2 = new FileInputStream("D:/MARIYA/java/JAva2.txt");

			FileOutputStream  fos = new FileOutputStream("D:/MARIYA/java/combine.txt");
			
			SequenceInputStream sis = new SequenceInputStream(fis, fis2);
			
			fos.write(sis.readAllBytes());
			fos.close();			
			sis.close();
			fis.close();
			fis2.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
