package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> intArrList = new ArrayList<Integer>();

		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		intArrList.add(2, 4);
		
		intArrList.addAll(intArrList);
		
		//creates an arraylist and immediately assigns values to it
		ArrayList<Integer> egArr = new ArrayList<Integer>(List.of(10,30,60));
		
		intArrList.addAll(3,egArr);
		
		System.out.println(intArrList.contains(3));
		System.out.println(intArrList.containsAll(egArr));
		System.out.println(intArrList.indexOf(60));
		System.out.println(intArrList.isEmpty());
		System.out.println(intArrList.remove(2));
		System.out.println(intArrList.removeAll(egArr));
		System.out.println(intArrList.size());
		System.out.println(intArrList.get(0));
		System.out.println(intArrList.set(0,10));

		System.out.println(intArrList);
		
		System.out.println();
		
		for (Iterator<Integer> iterator = intArrList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		
		System.out.println();
		
		for(Iterator<Integer> iterator = egArr.iterator();iterator.hasNext();) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		for (var integer : egArr) {
			System.out.print(integer+" ");
		}
		System.out.println();
		egArr.forEach((x)->{
			System.out.print(x+" ");
		});
		System.out.println();
		egArr.forEach(System.out::println);
		
		egArr.forEach(n->show(n));
		
	}
	
	static void show(Integer n) {
		if(n>20)
		System.out.print(n+" ");
	}

}
