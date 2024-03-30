package iostreams;

import java.io.ByteArrayInputStream;

public class ByteArrayStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte [] b = {'a','b','c','d'};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
		String str = new String(bis.readAllBytes());
		
		System.out.print(str);
		
		bis.close();
		
	}

}
