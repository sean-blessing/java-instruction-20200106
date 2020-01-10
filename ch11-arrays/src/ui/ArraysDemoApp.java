package ui;

import java.util.Arrays;

import business.Stuffy;
import util.Console;

public class ArraysDemoApp {

	public static void main(String[] args) {
		// create an array of ints
		int[] numbers = new int[5];
		numbers[0] = 25;
		numbers[1] = 2;
		numbers[2] = 4;
		numbers[3] = 5;
		numbers[4] = 100;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		//System.out.println(numbers[5]);
		
		// Create an array of strings
		String[] students = {"Farhan", "Tyler", "Christine", "Spiro"};
		
		// old school for loop
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student " + i + ": "+students[i]);
		}
		
		Arrays.sort(students);
		
		// for each loop
		for (String s: students) {
			System.out.println("student: "+s);
		}
		
//		// create an array of Stuffies
//		// how many stuffies in our array?
//		int nbr = Console.getInt("How many stuffies?");
//		Stuffy[] stuffies = new Stuffy[nbr];
//		
//		// prompt for stuffies
//		for (int idx = 0; idx < nbr; idx++) {
//			int id = Console.getInt("Stuffy ID?");
//			String type = Console.getString("Stuffy Type?");
//			String color = Console.getString("Stuffy Color?");
//			String size = Console.getString("Stuffy Size?");
//			int limbs = Console.getInt("Stuffy # of limbs?");
//			Stuffy s = new Stuffy(id, type, color, size, limbs);
//			stuffies[idx] = s;
//		}
//		
//		for (Stuffy s: stuffies) {
//			System.out.println(s);
//		}
//		
//		System.out.println("------------------");
//		int id = Console.getInt("Enter id of Stuffy to retrieve: ");
//		
//		Stuffy stuffy = null;
//		for (Stuffy s: stuffies) {
//			if (s.getId() == id) {
//				stuffy = s;
//			}
//		}
//		System.out.println("Your selected stuff is: "+stuffy);
		
		
		
		
		
		
		

		

	}

}
