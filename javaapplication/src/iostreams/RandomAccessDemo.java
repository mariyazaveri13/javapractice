/**
 * 
 */
package iostreams;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 */
public class RandomAccessDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile rf = new RandomAccessFile("D:/MARIYA/java/rwtest.txt", "rw");
		
		System.out.println((char) rf.read());
		System.out.println((char) rf.read());
		System.out.println((char) rf.read());
		System.out.println((char) rf.read());
		System.out.println((char) rf.read());
		rf.write('f');
		rf.seek(2);
		System.out.println((char) rf.read());		
		System.out.println(rf.getFilePointer());
		
		rf.close();

	}
}
