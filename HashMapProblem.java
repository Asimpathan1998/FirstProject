package part2.Collections;
import java.util.HashMap;
//import java.util.Hashtable;
					//	HashMap

public class HashMapProblem {

	public static void main(String[] args) {
		
		//country(key), population(value)
		HashMap<String, Integer> map = new HashMap<>();
		
		//Insertion
		map.put("India", 120);
		map.put("China", 140);
		map.put("USA", 35);
		map.put("Japan", 20);
		map.put("Turkey", 10);
		System.out.println(map);
		//Hashtable obj = new Hashtable();
		
		 
		//Search
		if(map.containsKey("India")) {
			System.out.println("Key is present in the map");
		}
		else {
			System.out.println("Key is not present in the map");
		}
//		System.out.println(map.get("China"));	//key exists
//		System.out.println(map.get("Indonesia")); 	//key doesn't exists
		if(map.remove("USA", 35)) {
			System.out.println( map );
		}
	}
}
