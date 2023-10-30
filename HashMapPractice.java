package self;

import java.util.HashMap;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<Integer, String> mapObject1 = new HashMap<>();

		mapObject1.put(1, "Aman");
		mapObject1.put(2, "Aarti");
		mapObject1.put(3, "Suman");
		mapObject1.put(4, "Karn");
		mapObject1.put(5, "Shaanti");
		mapObject1.put(6, "Arun");
		mapObject1.put(7, "Rahul");
		mapObject1.put(8, "Raam");
		mapObject1.put(9, "Shashi");

		// Finding the size of the hashmap.
		System.out.println("The size of the hashmap is: " + mapObject1.size());
		System.out.println("The hashmap is: " + mapObject1);

		// Printing the set of the keys present in the hashmap mapObject1
		System.out.println("The keys present in the map are: " + mapObject1.keySet());

		// Printing the values from mapObject1 corresponding to the keys
		System.out.println("The values corresponding to the map are: " + mapObject1.values());

		// Printing the keys and values simultaneously
		for (Integer iter : mapObject1.keySet()) {
			System.out.println("Keys: " + iter + " Values: " + mapObject1.get(iter));
		}

		// Overwriting the value of a specific key.
		mapObject1.put(1, "Shekhar");
		System.out.println("The hashmap post updation is: " + mapObject1);

		// Finding if mapObject1 contains the key = 2
		System.out.println(mapObject1.containsKey(2));

	}
}
