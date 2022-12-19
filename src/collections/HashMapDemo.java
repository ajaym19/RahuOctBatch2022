package collections;

import java.util.Collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	/*
	 * HashMap:
	 * used to store multiple elements
	 * the elements are stored in the form of key-value pair
	 * a key and value together is called as a Pair/Entry/Bucket
	 * multiple entries/pairs together is called as EntrySet
	 * 
	 * Rules:
	 * 1. Duplicate values are allowed
	 * 2. Multiple null values are allowed
	 * 3. Duplicate keys work as an update if key is already present
	 * 4. Only one null key is allowed, for duplicate it will work as an update
	 */
	
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Rupali");
		map.put(1, "Ajay");
		map.put(2, "Anand");
		System.out.println(map);
		map.put(4, "Anand");
		map.put(5, null);
		map.put(6, null);
		map.put(1, "Rahul");
		map.put(null, "Shweta");
		map.put(null, "Amrita");
		System.out.println(map);
		
		
		System.out.println(map.containsKey(11));
		System.out.println(map.containsValue("Rupa"));
		System.out.println(map.keySet());
		Set<Integer> keys = map.keySet();
		
		map.remove(2);
		System.out.println(map);
		System.out.println(map.values());
		Collection<String> values = map.values();
		
		
		//add an alement, if the key is already present then dont add and dont update also
		System.out.println(map);
		map.putIfAbsent(3, "Raja");
		System.out.println(map);
		
		
		
		//print the key and value using loop
		
		for(Entry<Integer, String> abc : map.entrySet()) {
			System.out.println("Key is " + abc.getKey() 
			+ " Value is "+abc.getValue());
		}
		
		
		
		//Ass: what is tReturns a Set view of the keys contained he diff between hashmap and hashtable in terms of null
	}
}
