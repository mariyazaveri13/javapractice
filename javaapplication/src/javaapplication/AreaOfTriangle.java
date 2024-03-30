package javaapplication;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		
		System.out.println((1f/2f)*base*height);
		
	}

}
