package javaapplication;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breadth, height,totalArea,volume;
		
		Scanner sc = new Scanner(System.in);
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalArea= 2*(length*height+breadth*height+length*breadth);
		volume = length*breadth*height;
		
		System.out.println("Total area = "+totalArea+" Volume = "+volume);
		
	}

}
