package self;

import java.util.HashMap;

public class HashMapPractice2 {
	public static void main(String[] args) {

		// 1. Default constructor
		HashMap<Integer, String> mapObject1 = new HashMap<>(10);
		mapObject1.put(101, "Arnav");
		mapObject1.put(202, "Shalini");
		mapObject1.put(303, "Garima");
		mapObject1.put(404, "Gaurav");

		System.out.println("The 1st hashMap is: " + mapObject1);
		System.out.println("The size of the hashMap is: " + mapObject1.size());

		// 1. Constructor with SINGLE PARAMETER
		HashMap<Integer, String> mapObject2 = new HashMap<>(10);
		mapObject2.put(10, "Anil");
		mapObject2.put(20, "Anita");
		mapObject2.put(30, "Rohan");
		mapObject2.put(40, "Rohan");

		System.out.println("The 2nd hashMap is: " + mapObject2);
		System.out.println("The size of the hashMap is: " + mapObject2.size());

		// 2. Constructor with INITIAL CAPACITY and LOAD FACTOR
		HashMap<Integer, String> mapObject3 = new HashMap<>(10, 0.65f);
		mapObject3.put(101, "Rohan");
		mapObject3.put(102, "Ramesh");
		mapObject3.put(103, "Sarita");
		mapObject3.put(104, "Bhavesh");

		System.out.println("The 3rd hashmap is: " + mapObject3);

		// 4. Constructor with HashMap reference
		HashMap<Integer, String> mapObject4 = new HashMap<>();

		mapObject4.put(201, "Shashwat");
		mapObject4.put(202, "Satvik");
		mapObject4.put(203, "Shashank");
		mapObject4.put(204, "Ashutosh");

		System.out.println("The 4th hashmap is: " + mapObject4);
	}
}
