package com.skilldistillery;

import java.io.*;
import java.util.*;

public class JetsApplication {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication jaApp = new JetsApplication();
		AirField airField = new AirField();
//		launch();
		
		airField.pJets();
	}

//	private static void launch() {
//		UserMenu();
//	}
//
//	private static void UserMenu() {
//		boolean menu = true;
//		while (menu) {
//			showMenu();
//			String nextSwitch = input.nextLine();
//
//			switch (nextSwitch) {
//			case "1":
//				airField.listFleet();
//			case "2":
//				flyAll();
//			case "3":
//
//			case "4":
//				longestRange();
//			case "5":
//				addCargo();
//			case "6":
//				dogFight();
//			case "7":
//
//			case "8":
//
//			case "9":
//
//			default:
//			}
//		}
//	}

//	private static void showMenu() {
//		StringBuilder choice = new StringBuilder("\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n\n"
//				+ "1)  List fleet\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81|"
//				+ "2)  Fly all jets\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDEE9 |"
//				+ "3)  View fastest jet\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81|"
//				+ "4)  View aircraft with longest range\n\t~ ~ ~ ~ ~ ~ ~ |\\\\uD83D\\\\uDEE9 |"
//				+ "5)  Load all cargo jets\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81|"
//				+ "6)  Dogfight!\n\t~ ~ ~ ~ ~ ~ ~ |\\\\uD83D\\\\uDEE9 |"
//				+ "7)  Add aircraft to fleet\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81s|"
//				+ "8) Remove aircraft from fleet\\t~ ~ ~ ~ ~ ~ ~ |\\\\uD83D\\\\uDEE9 |n" + "9) Quit"
//				+ "\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n");
//
//	}
//	
//	//  LIST FLEET
//		public void listFleet() {
//			for (int i = 0; i < airField.jetList.size(); i++) {
//				System.out.println(airField.jetList.get(i).toString());
//			}
//		}
//
//		//  FLY ALL 
//		public void flyAll() {
//			for (int i = 0; i < airField.jetList.size(); i++) {
//				airField.jetList.get(i).fly();
//			}
//		}
//
//		
//
//		// VIEW FASTEST 
//		public void fastestJet() {
//			double fastest = 0;
//			String fastestJet = "";
//			for (int i = 0; i < airField.jetList.size(); i++) {
//				if (fastest < airField.jetList.get(i).getSpeed()) {
//					fastest = airField.jetList.get(i).getSpeed();
//					fastestJet = airField.jetList.get(i).toString();
//				}
//			}
//			System.out.println("Fastest aircraft in inventory:\n" + fastestJet);
//		}
//
//		// VIEW LONGEST RANGE
//		public void longestRange() {
//			int longestRange = 0;
//			String rangeJet = "";
//			for (int i = 0; i < airField.jetList.size(); i++) {
//				if (longestRange < airField.jetList.get(i).getRange()) {
//					longestRange = airField.jetList.get(i).getRange();
//					rangeJet = airField.jetList.get(i).toString();
//				}
//			}
//			System.out.println("Aircraft with longest range in inventory is:\n" + rangeJet);
//		}
//
//		// LOAD ALL CARGO 
//		public void addCargo() {
//			String printOut = "";
//			for (int i = 0; i < airField.jetList.size(); i++) {
//				if (airField.jetList.get(i) instanceof CargoPlane) {
//					printOut = (airField.jetList.get(i).getModel() + " ");
//					System.out.print(printOut);
//					((CargoPlane) airField.jetList.get(i)).loadCargo();
//				}
//			}
//			if (printOut.contentEquals("")) {
//				System.out.println(
//						"There are no cargo planes in the inventory!\n" + "Consider adding one with with option 9.");
//			}
//		}
//
//		// DOGFIGHT!
//		public void dogFight() {
//			String printOut = "";
//			for (int i = 0; i < airField.jetList.size(); i++) {
//				if (airField.jetList.get(i) instanceof FighterJet) {
//					printOut = (airField.jetList.get(i).getModel() + " ");
//					System.out.print(printOut);
//					((FighterJet) airField.jetList.get(i)).fight();
//				}
//			}
//			if (printOut.contentEquals("")) {
//				System.out.println(
//						"There are no fighter jets in the inventory!\n" + "Consider adding one with with option 9.");
//			}
//		}
//		
//		//ADD TO FLEET
//		public void addJet() {
//			System.out.println(
//					"What type of plane would you like to add?\n1. Fighter\n2. " + "Cargo\n3." + " Reconnaissance\n4. Other");
//			String jetChoice = input.nextLine();
//			System.out.print("Enter model: ");
//			String model = input.next();
//			System.out.print("Enter speed: ");
//			double speed = input.nextDouble();
//			System.out.print("Enter range: ");
//			int range = input.nextInt();
//			System.out.print("Enter price: ");
//			int price = input.nextInt();
//			input.nextLine();
//
//			switch (jetChoice) {
//			case "Fighter":
//			case "fighter":
//			case "1":
//				airField.jetList.add(new FighterJet(capability, model, speed, range, price));
//				break;
//			case "Cargo":
//			case "cargo":
//			case "2":
//				airField.jetList.add(new CargoPlane(model, speed, range, price));
//				break;
//			case "Trainer":
//			case "trainer":
//			case "3":
//				airField.jetList.add(new Reconnaissance(model, speed, range, price));
//				break;
//			case "Other":
//			case "other":
//			case "4":
//				airField.jetList.add(new JetImpl(model, speed, range, price));
//				break;
//			default:
//				System.out.println("Invalid choice.");
//			}
//		}


}