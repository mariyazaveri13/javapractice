package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	static int count=0;
	String name;
	String phoneNo;
	String id;
	
	public Customer(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		count++;
		id = "C"+ count;
	}
	
	public Customer() {}

	@Override
	public String toString() {
		return "Customer [id "+id+", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
}

public class SerializationDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream  fos = new FileOutputStream("D:/MARIYA/java/CustomerStream.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Customer c1 = new Customer("Mariya","923298");
		Customer c2 = new Customer("Burhany","923298");
		Customer c3 = new Customer("yusuf","923298");
		Customer c4 = new Customer("taher","923298");
		Customer c5 = new Customer("munira","923298");
		
		Customer custList[] = {c1,c2,c3,c4,c5};
		
		oos.writeInt(custList.length);
		
		for(int i =0;i<custList.length;i++) {
			oos.writeObject(custList[i]);
		}
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("D:/MARIYA/java/CustomerStream.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int len = ois.readInt();
		
		for(int i = 0;i<len;i++) {
			System.out.println((Customer)ois.readObject());
		}
		
		ois.close();
	}

}
