package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	/*
	 * 
	 * Collections:
	 * available in util package
	 * 
	 * 
	 * ArrayList
	 * collection of similar elements
	 * internal working is same as Array	
	 * 
	 * 
	 * Operations: CRUD
	 * 1. Creation
	 * 2. Addition
	 * 3. Updation
	 * 4. Deletion
	 * 5. Read
	 * 
	 * Rules:
	 * 1. Insertion Order is maintained
	 * 2. No need to define the size
	 * 3. Duplicates are allowed
	 * 4. Null is also allowed
	 */
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(null);
		
		list.add(60);
		System.out.println(list);
		
		System.out.println(list.get(5));
		list.set(5, 17);
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		list.add(3);
		
		//remove on basis of index?
		//remove on basis of value?
		list.remove(3);
		System.out.println(list.size());
		System.out.println(list);
		list.add(89);
		System.out.println(list);
		System.out.println(list.get(2));
		list.add(1, 90);
		System.out.println(list);
		System.out.println(list.get(2));
		
		System.out.println(list.contains(400));
		
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(101);
		arr2.add(102);
		arr2.add(103);
		
		System.out.println(list);
		
		list.addAll(2, arr2);
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		
		//Ass1
		//Adding all elements from one array to another array list and print original list
		//using for loop is assignment
		//Ass2:
		//Convert an array to arraylist
		//convert an arraylist to array
		
		//Given an arraylist>> find the maximum element
		//Given an arraylist>> find the minimum element
		//Given an arraylist>> find the average of all the elements
		
	
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//foreach
		
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			list2.add(list.get(i));
		}
		
		Iterator<Integer> it = list.iterator();
		
		//hasNext: whether there is a next element
		//next: return the next element
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		Collections.sort(list2);
		
		
		
		/*
		 * Given an array lsit with duplicate elements
		 * remove the duplicates
		 */
		
		
	}
}
