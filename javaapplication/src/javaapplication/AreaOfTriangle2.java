package javaapplication;

import java.util.Scanner;

public class AreaOfTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a,b,c,s;
		double area;
		a = sc.nextFloat();
		b= sc.nextFloat();
		c=sc.nextFloat();
		
		s = (a+b+c)/2f;
		System.out.println(s);
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println(area);
		
	}

}
