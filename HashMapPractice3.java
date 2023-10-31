package self;

import java.util.HashMap;

public class HashMapPractice3 {
	public static void main(String[] args) {

		// 1. Default constructor
		HashMap<Integer, String> mapObject1 = new HashMap<>(10);
		mapObject1.put(101, "Arnav");
		mapObject1.put(202, "Shalini");
		mapObject1.put(303, "Garima");
		mapObject1.put(404, "Gaurav");

		/*
		 * System.out.println("The 1st hashMap is: " + mapObject1);
		 * System.out.println("The size of the hashMap is: " + mapObject1.size());
		 * 
		 * // 1. Constructor with SINGLE PARAMETER HashMap<Integer, String> mapObject2 =
		 * new HashMap<>(10); mapObject2.put(10, "Anil"); mapObject2.put(20, "Anita");
		 * mapObject2.put(30, "Rohan"); mapObject2.put(40, "Rohan");
		 * 
		 * System.out.println("The 2nd hashMap is: " + mapObject2);
		 * System.out.println("The size of the hashMap is: " + mapObject2.size());
		 * 
		 * // 2. Constructor with INITIAL CAPACITY and LOAD FACTOR HashMap<Integer,
		 * String> mapObject3 = new HashMap<>(10, 0.65f); mapObject3.put(101, "Rohan");
		 * mapObject3.put(102, "Ramesh"); mapObject3.put(103, "Sarita");
		 * mapObject3.put(104, "Bhavesh");
		 * 
		 * System.out.println("The 3rd hashmap is: " + mapObject3);
		 * 
		 * // 4. Constructor with HashMap reference HashMap<Integer, String> mapObject4
		 * = new HashMap<>();
		 * 
		 * mapObject4.put(201, "Shashwat"); mapObject4.put(202, "Satvik");
		 * mapObject4.put(203, "Shashank"); mapObject4.put(204, "Ashutosh");
		 * 
		 * System.out.println("The 4th hashmap is: " + mapObject4);
		 * 
		 */

		// MORE FUNCTIONS.....

		// 1. containsValue(value)
		System.out.println(mapObject1.containsValue("Shashwat"));

		// 2. entrySet()
		System.out.println(mapObject1.entrySet());

		// 3. getOrDefault(key,value)

		System.out.println(mapObject1.getOrDefault(101, ""));
		System.out.println(mapObject1.getOrDefault(1012, "Shashwat_Malasi"));
		System.out.println(mapObject1);

		/*
		 * 4.putIfAbsent(key,value) Returns null if the key was not in the map and is
		 * inserted by this function Otherwise returns the key already present in the
		 * map
		 */

		System.out.println(mapObject1.putIfAbsent(102, "Amol"));

		System.out.println(mapObject1);

		// 5. replace(key,oldValue, newValue)
		System.out.println(mapObject1.values());

		// return true is replacement was successful...It is a boolean function
		System.out.println(mapObject1.replace(101, "Arnav", "Raam"));

		System.out.println(mapObject1.values());

		// Returns the replaces value from the map
		System.out.println(mapObject1.replace(202, "Poornima"));
		System.out.println(mapObject1);
	}

}
