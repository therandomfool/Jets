package com.skilldistillery;

import java.io.*;
import java.util.*;

public class JetsApplication {
	static AirField airField = new AirField();
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		launch();
//		showMenu();
//		airField.pJets();
	}

	private static void launch() {
		JetsApplication jaApp = new JetsApplication();
		
		System.out.println("\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n\n");
		System.out.println( "1)  List fleet \uD83D\uDEE9");		
		System.out.println("2)  Fly all jets");	
		System.out.println("3)  View fastest jet");	 
		System.out.println("4)  View aircraft with longest range");	 
		System.out.println( "5)  Load all cargo jets");	 
		System.out.println( "6)  Dogfight!");	
		System.out.println( "7)  Add aircraft to fleet ");	
		System.out.println( "8) Remove aircraft from fleet");	
		System.out.println("9) Done / Quit");	
		System.out.println("\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n");
		
		String nextSwitch = input.nextLine();

		boolean menu = true;
		while (menu) {
			
			switch (nextSwitch) {
			case "1":
				listFleet(airField);
				continue;
			case "2":
				flyAll(airField);
				break;
			case "3":
				fastestJet(airField);
				break;
			case "4":
				longestRange(airField);
				break;
			case "5":
				addCargo(airField);
				break;
			case "6":
				dogFight(airField);
				break;
			case "7":
				addJet();
				break;
			case "8":
				break;
			case "9":
				System.out.println("Leaving-------------");
				System.exit(0);
				
			default:
			}
		}
	}
	
	
	//  LIST FLEET
		private static void listFleet(AirField airField) {
//			for (int i = 0; i < jetList.size(); i++) {
//				System.out.println(jetList.get(i).toString());
//			}
			for (Jets jet : airField.getJetList()) {
			System.out.println(jet.toString());	
			System.out.println("************   *************   ************");
			System.out.println();
			}

		}

		//  FLY ALL 
		public static void flyAll(AirField airField) {
//			for (int i = 0; i < jetList.size(); i++) {
//				jetList.Jets.Fly(i);
//			}
			for (Jets jet : airField.getJetList()) {
				jet.fly();
				System.out.println();
			}
		}

		// VIEW LONGEST RANGE
		public static void longestRange(AirField airField) {
			int longestRange = 0;
			String rangeJet = null;
			for (int i = 0; i < jetList.size(); i++) {
				if (longestRange < jetList.get(i).getRange()) {
					longestRange = jetList.get(i).getRange();
					rangeJet = jetList.get(i).toString();
				}
			}
			System.out.println("Aircraft with longest range in inventory is:\n" + rangeJet);
		}

		// LOAD ALL CARGO 
		public static void addCargo(AirField airField) {
			String printOut = "";
			for (int i = 0; i < jetList.size(); i++) {
				if (jetList.get(i) instanceof CargoPlane) {
					printOut = (jetList.get(i).getModel() + " ");
					System.out.print(printOut);
					((CargoPlane) jetList.get(i)).loadCargo();
				}
			}
			if (printOut.contentEquals("")) {
				System.out.println(
						"There are no cargo planes in the inventory!\n" + "Consider adding one with with option 9.");
			}
		}

		// DOGFIGHT!
		public static void dogFight(AirField airField) {
			String printOut = "";
			for (int i = 0; i < jetList.size(); i++) {
				if (jetList.get(i) instanceof FighterJet) {
					printOut = (jetList.get(i).getModel() + " ");
					System.out.print(printOut);
					((FighterJet) jetList.get(i)).fight();
				}
			}
			if (printOut.contentEquals("")) {
				System.out.println(
						"There are no fighter jets in the inventory!\n" + "Consider adding one with with option ....");
			}
		}
		
		//ADD TO FLEET
		public static void addJet() {
			System.out.println(
					"What type of plane would you like to add?\n1. Fighter\n2. " + "Cargo\n3." + " Reconnaissance\n4. Other");
			String jetChoice = input.nextLine();
			System.out.print("Enter model: ");
			String model = input.next();
			System.out.print("Enter speed: ");
			double speed = input.nextDouble();
			System.out.print("Enter range: ");
			int range = input.nextInt();
			System.out.print("Enter price: ");
			int price = input.nextInt();
			input.nextLine();

			switch (jetChoice) {
			case "Fighter":
			case "fighter":
			case "1":
				jetList.add(new FighterJet(jetChoice, model, speed, range, price));
				break;
			case "Cargo":
			case "cargo":
			case "2":
				jetList.add(new CargoPlane(jetChoice, model, speed, range, price));
				break;
			case "Reconnaissance":
			case "reconnaissance":
			case "3":
				jetList.add(new Reconnaissance(jetChoice, model, speed, range, price));
				break;
			case "Other":
			case "other":
			case "4":
				jetList.add(new JetImpl(jetChoice, model, speed, range, price));
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
		// VIEW FASTEST
		public static void fastestJet(AirField airField) {
			double fastest = 0;
			String fastestJet = "";
			for (int i = 0; i < jetList.size(); i++) {
				if (fastest < jetList.get(i).getSpeed()) {
					fastest = jetList.get(i).getSpeed();
					fastestJet = jetList.get(i).toString();
				}
			}
			System.out.println("Fastest aircraft in inventory:\n" + fastestJet);

		}
}