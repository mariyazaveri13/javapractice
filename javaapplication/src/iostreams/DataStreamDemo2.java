package iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		float [] floatArray = {6,1.2f,5f,4.4f,9,29,17};
		
		FileOutputStream fos = new FileOutputStream("D:/MARIYA/java/FloatStream.txt");
		DataOutputStream dos = new DataOutputStream(fos);
				
		for(float f : floatArray) {
			dos.writeFloat(f);
		}
		
		dos.close();
		
		FileInputStream fis = new FileInputStream("D:/MARIYA/java/FloatStream.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int len = (int) dis.readFloat();
		
		for(int i = 0 ; i<len;i++) {
			System.out.println(dis.readFloat());
		}

		dis.close();
		fis.close();
	}

}
