package collections;

public class ArrayDemo {

	/*
	 * Array:
	 * is collection of multiple elements of similar data type
	 * 
	 * Three Steps:
	 * 1. Declaration
	 * 2. Instantiation
	 * 3. Initialization
	 * 
	 * rule:
	 * 1. by default all the elements are initialized to 0
	 * 2. Indexes are maitained
	 * 3. Duplicate values are allowed
	 * 4. It is compulsory to define the size of an array while instantiation
	 * 
	 * Disadvantage:
	 * The size is fixed
	 * 
	 */
	public static void main(String[] args) {
		
		int[] id; //declaration
		//int id1[];
		id = new int[10]; //instantiation
		id[0] = 21; //init
		id[1] = 45;
		id[1] = 46;
		id[2] = 45;
		id[4] = 0;
		//id[2] = 45.45; not allowed
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
		System.out.println(id[3]);
		System.out.println(id[4]);
		//System.out.println(id[5]);//cannot use
		System.out.println("Length of the Array is "+id.length);
		
		
		//Decl + Instantiation
		//int[] id1 = new int[3];
		
		//Decl + Inst + Init
		int[] id1 = new int[] {1,4,54,23};
		System.out.println(id1.length);
		
		//print all the variables of an array
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		
		
		String[] fruits = {"apple", "banana"};
		System.out.println(fruits.length);
		
		System.out.println(fruits[0]);
		
		//fruits = new String[5];
		//fruits[0] = "Apple";
		//System.out.println(fruits[0]);
		
		
		
		/*
		 * Ass1
		 * an array
		 * to store 5 elements
		 * assign using for loop
		 * 10
		 * 20
		 * 30
		 * 40
		 * 50
		 * done use this: int[] id1 = new int[] {1,4,54,23};
		 * and print them using for loop
		 * 
		 * 
		 * Ass2:
		 * create a copy of a given array
		 * aar1 = {}10,20,30;
		 * OP : Arr2 with same elements and size as array1
		 * 
		 * 
		 */
		
		
		
		
	}
}
