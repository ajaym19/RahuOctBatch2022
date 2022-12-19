package collections;

import java.util.HashSet;

public class HashSetDemo {
	
	/*
	 * HashSet:
	 * used to store multiple elements
	 * Internaly it uses the concept of Hashing
	 * is a class implementing Set Interface
	 * 
	 * 
	 * Rules:
	 * 1. Insertion Order is not maintained
	 * 2. No Order is maintained
	 * 3. We cannot use getters and setters
	 * 4. Duplicates are not allowed
	 */
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(34);
		set.add(121);
		System.out.println(set);
		set.add(121);
		System.out.println(set);
		set.remove(100);
		System.out.println(set);
		set.add(null);
		System.out.println(set.size());
		System.out.println(set);
		
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
	}
}
