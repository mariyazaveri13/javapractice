package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable{
	private static final long serialVersionUID = 2L;
	private static int count = 0;
	private int accNo;
	private String name;
	private long balance;
	
	public Account() {}
	public Account(String name, long balance) {
		this.accNo = ++count;
		this.balance = balance;
		this.name = name;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Account.count = count;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}

public class MegaProject {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		HashMap<Integer, Account> hm = new HashMap<Integer, Account>();
	
		int selection=0;
		Scanner sc = new Scanner(System.in);
		File f = new File("D:/MARIYA/java/AccountDetails.txt");

		if(f.exists()) {
			FileInputStream fis = new FileInputStream("D:/MARIYA/java/AccountDetails.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			hm = (HashMap<Integer, Account>) ois.readObject();
			ois.close();
		}

		FileOutputStream fos = new FileOutputStream("D:/MARIYA/java/AccountDetails.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
				
		
		while(selection<6) {

			System.out.println("Select your choice:");
			System.out.println("1. Create Account");
			System.out.println("2. Delete Account");
			System.out.println("3. View Account");
			System.out.println("4. View All Account");
			System.out.println("5. Save Accounts");
			System.out.println("6. Exit");
			
			selection = sc.nextInt();
			
			switch (selection) {
				case 1: {
					String name;
					Long balance;
					
					System.out.println("Enter name :");
					name=sc.next();
		
					System.out.println("Enter Balance :");
					balance = sc.nextLong();
					
					Account acc = new Account(name,balance);
					
					hm.put(acc.getAccNo(),acc);
					System.out.println(acc);
										
					break;
				}
				case 2: {
					System.out.println("Enter AccNo :");
					Integer in = sc.nextInt();
					
					Boolean isExist = hm.containsKey(in);
					if(isExist) {
						hm.remove(in);
						System.out.println("Account deleted");
						System.out.println(hm);
					}
					else
					{
						System.out.println("Invalid account number");
					}
					
					break;
				}
				case 3: {
					System.out.println("Enter AccNo :");
					Integer in = sc.nextInt();
					
					Boolean isExist = hm.containsKey(in);
					if(isExist) {
						System.out.println(hm.get(in));
					}
					else
					{
						System.out.println("Invalid account number");
					}
					break;
				}
				case 4: {
					System.out.println("All account details are as follows :");
					System.out.println(hm);
					break;
				}
				case 5: {
					if(!hm.isEmpty()) {
						oos.writeObject(hm);
						System.out.print("Details saved on disk at loc - "+new File("D:/MARIYA/java/AccountDetails.txt").getAbsolutePath());
					}
					else {
						System.out.println("Nothing to save");
					}
					break;
				}
				case 6: {
					oos.writeObject(hm);
					if(hm.isEmpty()){
						f.deleteOnExit();
					}
					oos.close();
					fos.close();
					System.exit(0);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + selection);
				}
			selection = 0;
		
		}
	}

}
