package lecture_classes.day48_collection_Part3;

import java.util.HashMap;
import java.util.*;

import lecture_classes.day46_collection_Part1.Product;

public class LoopMap {
	
	public static void main(String[] args) {
		
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("username", "user66");
		dataMap.put("password", "abv66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckDriver", "Bob");
		dataMap.put("storeManager", "John");
		
		//keySet -> returns set with all the keys in the map
		//values -> returns with all the values in the map
		
		
		for (String key : dataMap.keySet()) {
			System.out.println(key);
		}
		
		for (String value : dataMap.values()) {
			System.out.println(value);
		}
		
		for (String key : dataMap.keySet()) {
			System.out.println(key+" | "+dataMap.get(key));
		}
		
		dataMap.forEach((k,v)-> System.out.println(k+ " | "+v));
		
		Map<Integer, Product> productMap = new HashMap<>();
		
		Map<String, String[]> data = new HashMap<>();
		
		Map<Integer, List<String>> data2 = new HashMap<>();
		
		Map<Integer, List<String[]>> data3 = new HashMap<>();
		
		Map<String, Map<Integer,Integer>> data4 = new HashMap<>();
		
		Map<String, Map<Integer, Product>> data5 = new HashMap<>();
		
		
		
		
		
		
		
		
	}

}
