package ui;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsDemoApp {

	public static void main(String[] args) {
		String[] codes = new String[3];
		codes[0] = "java";
		codes[1] = "jsp";
		codes[2] = "mysql";
		
		for (String s: codes) {
			System.out.println(s);
		}
		
		System.out.println("let's do an ArrayList");
		ArrayList<String> codes2 = new ArrayList<>();
		codes2.add(".net");
		codes2.add("angular");
		codes2.add("html");
		
		for (String s: codes2) {
			System.out.println(s);
		}
		System.out.println(codes2);

		ArrayList<Integer> nbrs1 = new ArrayList<>();
		nbrs1.add(7);
		nbrs1.add(11);
		
		int n = nbrs1.get(0);
		
		ArrayList<Double> prices;
		
		System.out.println("HashMap of colors");
		HashMap<String, String> colorsMap = new HashMap<>();
		colorsMap.put("B", "Blue");
		colorsMap.put("R", "Red");
		colorsMap.put("P", "Pink");
		colorsMap.put("Y", "Yellow");
		
		String favoriteColor = colorsMap.get("R");
		System.out.println(favoriteColor);
		
		
		
		
		
		
		
		
		
		
		
	}

}
