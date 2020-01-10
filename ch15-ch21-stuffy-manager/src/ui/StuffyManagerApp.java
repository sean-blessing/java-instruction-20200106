package ui;

import business.Stuffy;
import db.DAO;
import db.StuffyDB;
import db.StuffyTextFile;
import util.Console;

public class StuffyManagerApp {
	private static DAO<Stuffy> sDAO = new StuffyDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the stuffy app");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("List of all stuffies:");
			for (Stuffy s: sDAO.getAll()) {
				System.out.println(s);
			}
			
			System.out.println("========================");
			System.out.println("Get a stuffy");
			int id = Console.getInt("Stuffy id: ");
			Stuffy s = sDAO.get(id);
			System.out.println("Selected Stuffy: "+s);
			
//			System.out.println("Add a stuffy:");
//			int id = Console.getInt("Stuffy ID: ");
//			String type = Console.getString("Stuffy Type: ");
//			String color = Console.getString("Stuffy Color: ");
//			String size = Console.getString("Stuffy Size: ");
//			int limbs = Console.getInt("Stuffy # of Limbs: ");
//			Stuffy s = new Stuffy(id, type, color, size, limbs);
//			if (sDAO.add(s)) {
//				System.out.println("Stuffy added successfully!");
//			}
//			else {
//				System.out.println("Issue adding Stuffy. :(");
//			}
			
			choice = Console.getString("Continue?");
		}
		
		
		
		
		System.out.println("Bye");

	}

}
