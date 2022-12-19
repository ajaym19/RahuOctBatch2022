package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	/*
	 * LinkedList:
	 * to store multiple elements
	 * 
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(18);
		System.out.println(list);
		list.add(18);
		System.out.println(list);
		System.out.println(list.get(2));
		list.add(0, 101);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		list.addFirst(101);
		list.addLast(501);
		System.out.println(list);
		
		
	}
	
}
