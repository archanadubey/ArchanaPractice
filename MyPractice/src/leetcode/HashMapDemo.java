package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	// creating the hashmap 
	//creating mao for country and its population
	public static void main(String ar[]) {
	HashMap<String, Integer> map = new HashMap<>();
	
	//map.put("India", 150);
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
	System.out.println();
	
	// removing key-value pair from HashMap
	String country1 = "Nepal";
	map.remove(country1);
	System.out.println(map);
	// update the map
	map.put("USA", 70);
	System.out.println(map);
	int size = map.size();
	System.out.println("Size of the  "+size);
	//copy the hashmap
	/* to copy a hash map we need to create another enpty hashmap and pass the original one as its parameter eg: */
	
	HashMap<String, Integer> copied = new HashMap<String,Integer>(map);
	System.out.println("copied hashmap: "+ copied);
	
	
	//checking if the map isEmpty
	HashMap<String, Integer> checking = new HashMap();
	boolean isEmpty1 = checking.isEmpty();
	boolean isEmpty = copied.isEmpty();
	System.out.println(isEmpty);
	System.out.println(isEmpty1);
	
	
	//merging the hashmap 
	/* To merge the hashmap we need two hashmap and use the putAll method .*/
	HashMap<String, Integer> merge = new HashMap<>();
	merge.put("paris", 78);
	merge.put("Russia", 58);
	merge.put("Sri Lanka", 55);
	merge.put("bhutan", 20);
	
	map.putAll(merge);
	System.out.println("After merge the country will be: "+ map);
	map.put("Nepal", 15);
	int mergeSize = map.size();
	System.out.println("new size of map: "+ mergeSize);
	
	// clearing the hashmap
	merge.clear();
	
	System.out.println("Merge hashmap is clear: "+merge);
	System.out.println(map);
	
	}

}
