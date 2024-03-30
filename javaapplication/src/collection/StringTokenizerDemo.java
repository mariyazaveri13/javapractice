package collection;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Name=Mariya;Age=25";
		StringTokenizer st = new StringTokenizer(data,"=;");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
