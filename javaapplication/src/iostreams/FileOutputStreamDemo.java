package iostreams;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("D:/MARIYA/java/JAva.txt");){
			String str = "I am learning io classes....";
			fos.write(str.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
