package collection;

import java.util.*;

public class LinkedHashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Linked hash map is an ordered hash map. It also has the reference to the element previous and later. Hence named linked hash map
		 * it can bee ordered by 1. order of insertion or 2. order of access
		 * if we want to use it according to order of access then we need to pass true as 3rd arg in the constructor
		 * if we want to limit the no of entries than we can specify the number in 1st arg and override removeEldestEntry and it'll remove older ones
		 * Below is implementation for linked hash map as cache and using order of access
		 * 
		 */
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5,0.75f,true){
			protected boolean removeEldestEntry(Map.Entry e) {
				return size() > 5;
			}
		};

		lhm.put(1, "A");
		lhm.put(2, "A");
		lhm.put(3, "A");
		lhm.put(4, "A");
		lhm.put(5, "A");
		lhm.put(6, "A");
		lhm.put(7, "A");
		
		String s = lhm.get(4);
		s = lhm.get(5);
		
		lhm.put(8, s);
		
		System.out.println(lhm);
	}

}
