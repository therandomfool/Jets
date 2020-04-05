package com.skilldistillery;

import java.io.*;
import java.util.*;

public class AirField {

//	set up
	private List<Jets> jetList = new ArrayList<>();

	public AirField() {
		this.jetList = createJetList();
	}

	public void setJetList(List<Jets> jetList) {
		this.jetList = jetList;
	}

	public List<Jets> getJetList() {
		return jetList;
	}

	public List<Jets> createJetList() {
		try {

			BufferedReader br = new BufferedReader(new FileReader("Jets.txt"));
			String[] newJet = null;
			String name;
			// read txt
			while ((name = br.readLine()) != null) {

				newJet = name.split(",");
				String capability = newJet[0];
				String model = newJet[1];
				double speed = Double.parseDouble(newJet[2].trim());
				int range = Integer.parseInt(newJet[3].trim());
				long price = Long.parseLong(newJet[4].trim());
				Jets jet = null;
				if (newJet[0].equalsIgnoreCase("Fighter")) {
					jet = new FighterJet(capability, model, speed, range, price);

				} else if (newJet[0].equalsIgnoreCase("CargoTransport")) {
					jet = new CargoPlane(capability, model, speed, range, price);

				} else if (newJet[0].equalsIgnoreCase("Reconnaissance")) {
					jet = new Reconnaissance(capability, model, speed, range, price);

				} else {
					jet = new JetImpl(capability, model, speed, range, price);
				}
				jetList.add(jet);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(jetList.size());
		return jetList;

	}

	// DOGFIGHT!
	public void dogFight() {
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

	// ADD TO FLEET
	public void addJet(Scanner input) {

		System.out.println("What type of plane would you like to add?\n1. Fighter\n2. " + "Cargo\n3."
				+ " Reconnaissance\n4. Other");
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
	public void fastestJet() {
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

	// LIST FLEET
	public void listFleet() {

		for (Jets jet : jetList) {
			System.out.println(jet);
			System.out.println("************  *************  ************");
			System.out.println();
		}
	}

	// FLY ALL
	public void flyAll() {
//				for (int i = 0; i < jetList.size(); i++) {
//					jetList.Jets.Fly(i);
//				}
		for (Jets jet : jetList) {
			jet.fly();
			System.out.println();
		}
	}

	// VIEW LONGEST RANGE
	public void longestRange() {
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
	public void addCargo() {
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
}
