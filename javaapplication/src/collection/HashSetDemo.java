package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hashset is unordered and allows only unique value. Takes constant loading time
		 * 2 techniques for hashing
		 * 1. open 
		 * 2. chaining
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(55);
		hs.add(85);
		hs.add(456);
		hs.add(55);
		
		hs.remove(85);
		
		System.out.print(hs.toString());
		
		
		System.out.print(hs);
		
		
	}

}
