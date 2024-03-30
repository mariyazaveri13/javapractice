package collection;

import java.util.List;
import java.util.*;

class Point implements Comparable{
	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "x = "+x+" y = "+y;
	}
	
	@Override
	public int compareTo(Object o) {
		Point p = (Point) o;
		
		if(this.x<p.x)
			return -1;
		else if(this.x>p.x)
			return 1;
		else {
			if(this.y<p.y)
				return -1;
			else if(this.y>p.y)
				return 1;
			else
				return 0;
		}
		
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *It is sorted and since it is a set it does not allow duplicates.  
		 */
		TreeSet< Integer> ts = new TreeSet<Integer>(List.of(25,25,85,46,65,97,22,2));
		
		ts.add(8);
		
		System.out.println(ts);
		
		TreeSet<Point> p = new TreeSet<Point>();
		p.add(new Point(1, 5));
		p.add(new Point(1, 3));
		p.add(new Point(2, 5));
		p.add(new Point(6, 5));
		p.add(new Point(1, 6));
		
		System.out.println(p);
		
	}

}
