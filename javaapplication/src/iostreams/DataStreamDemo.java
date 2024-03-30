package iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	int roll;
	String name;
	String dept;
	transient String data= "Hey";
	static int i = 100;

	public Student(int roll, String name, String dept) {
		super();
		this.roll = roll;
		this.name = name;
		this.dept = dept;
		data = "ok";
		i=200;
	}
	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", dept=" + dept + ", data=" + data + "]";
	}
}

public class DataStreamDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Student s = new Student(12,"Maria","Engg");
		
		FileOutputStream fos = new FileOutputStream("D:/MARIYA/java/DataStream.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(s.roll);
		dos.writeUTF(s.name);
		dos.writeUTF(s.dept);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream("D:/MARIYA/java/DataStream.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		Student s1 = new Student();
		s1.roll=dis.readInt();
		s1.name=dis.readUTF();
		s1.dept=dis.readUTF();
		
		System.out.println(s1.dept);
		System.out.println(s1.name);
		System.out.println(s1.roll);
		
		fis.close();
		dis.close();
	}

}
