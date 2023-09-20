package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	// creating the hashmap 
	//creating mao for country and its population
	public static void main(String ar[]) {
	HashMap<String, Integer> map = new HashMap<>();
	
	map.put("India", 150);
	map.put("USA", 50);
	map.put("Indonesia", 10);
	map.put("UK", 100);
	map.put("Canada", 30);
	map.put("Maxico", 150);
	map.put("Nepal", 10);
	System.out.println(map);
	System.out.println();
	
	//Iterating through HashMap
	/* Map.Entry<String, Integer> --->> is the type of map same as we do in case of
	 * other for loop (int  then i will e a variable. 
	*/
	for(Map.Entry<String, Integer> e : map.entrySet()) {
		//System.out.println(e);
		System.out.println(e.getKey()+":"+ e.getValue());

	}
	// Getting value from hashmap -> get value 
	int population = map.get("India");
	
	System.out.println("India polulation: "+population);
	
	// checking if key exists
	if(!map.containsKey("India")) 
			System.out.println("India is not present in the map");
		
		else 
			System.out.println("India is present in the map");
	
	String name = "Archana";
	if (map.containsKey(name))
		System.out.println("name is present in the map");
	else
		System.out.println("name is not present");
	
	}

}
