package javaapplication;

public class EmailVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mariyazaveri13@gmail.com";
		System.out.println(str.contains("gmail"));
		System.out.println(str.split("@")[0]);
		System.out.println(str.split("@")[1]);
	}

}
