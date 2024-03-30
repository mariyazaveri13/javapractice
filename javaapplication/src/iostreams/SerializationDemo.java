package iostreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("D:/MARIYA/java/SerialStream.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s = new Student(3,"Burhanuddin","mech");
		
		oos.writeObject(s);
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("D:/MARIYA/java/SerialStream.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s1;
		s1 = (Student) ois.readObject();
		System.out.println(s1);
		
		ois.close();
		fis.close();
	}

}
