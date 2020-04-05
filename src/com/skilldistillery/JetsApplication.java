package com.skilldistillery;

import java.util.Scanner;

public class JetsApplication {
	private AirField airField = new AirField();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication jaApp = new JetsApplication();
		jaApp.launch();
//		showMenu();
//		airField.pJets();
	}

	private void launch() {

		boolean menu = true;
		while (menu) {

			System.out.println("\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n\n");
			System.out.println("1)  List fleet \uD83D\uDEE9");
			System.out.println("2)  Fly all jets");
			System.out.println("3)  View fastest jet");
			System.out.println("4)  View aircraft with longest range");
			System.out.println("5)  Load all cargo jets");
			System.out.println("6)  Dogfight!");
			System.out.println("7)  Add aircraft to fleet ");
			System.out.println("8) Remove aircraft from fleet");
			System.out.println("9) Done / Quit");
			System.out.println("\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n");

			String nextSwitch = input.nextLine();
			switch (nextSwitch) {
			case "1":
				airField.listFleet();
				break;
			case "2":
				airField.flyAll();
				break;
			case "3":
				airField.fastestJet();
				break;
			case "4":
				airField.longestRange();
				break;
			case "5":
				airField.addCargo();
				break;
			case "6":
				airField.dogFight();
				break;
			case "7":
				airField.addJet(input);
				break;
			case "8":
				break;
			case "9":
				System.out.println("Leaving-------------");
				menu = false;
			default:
			}
		}
	}

	

	

	

}