package com.skilldistillery;

import java.util.*;

public class JetsApplication {

	Scanner input = new Scanner(System.in);
	private AirField airField = new AirField();

	public static void main(String[] args) {
		JetsApplication jaApp = new JetsApplication();

	}

	private void launch() {

	}

	private void UserMenu() {
		boolean menu = true;
		while (menu) {
			showMenu();
			String switchero = input.nextLine();
			
			switch(switchero) {
			case "1" :
				
			case "2" :
				
			case "3" :
				
			case "4" :
				
			case "5" :
				
			case "6" :
				
			case "7" :
				
			case "8" :
				
			case "9" :
				
			default:
			}
		}
	}

	private void showMenu() {
		StringBuilder choice = new StringBuilder(
				"\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n\n" 
				+ "1)  List fleet\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81|" 
				+ "2)  Fly all jets\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDEE9 |"
				+ "3)  View fastest jet\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81|" 
				+ "4)  View aircraft with longest range\n\t~ ~ ~ ~ ~ ~ ~ |\\\\uD83D\\\\uDEE9 |"
				+ "5)  Load all cargo jets\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81|" 
				+ "6)  Dogfight!\n\t~ ~ ~ ~ ~ ~ ~ |\\\\uD83D\\\\uDEE9 |"
				+ "7)  Add aircraft to fleet\n\t~ ~ ~ ~ ~ ~ ~ |\\uD83D\\uDE81s|" 
				+ "8) Remove aircraft from fleet\\t~ ~ ~ ~ ~ ~ ~ |\\\\uD83D\\\\uDEE9 |n" 
				+ "9) Quit"
				+ "\n~ ~ ~ ~ ~ ~ ~ |\uD83D\uDE81 \t  \uD83D\uDEE9 | ~ ~ ~ ~ ~ ~ ~  \n" );



}