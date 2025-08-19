package com;
import java.util.HashMap;
public class hash_map {
	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, "mango");
		map.put(4, "pine apple");
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("banana"));
		map.remove(3);
		for( Integer key :map.keySet()) {
			System.out.println(key+" --->"+map.keySet());
		}
	}

}
