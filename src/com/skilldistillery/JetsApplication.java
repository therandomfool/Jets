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
		}
	}

	private void showMenu() {
		StringBuilder choice = new StringBuilder(
				"\n| \uD83D\uDE81 \t  \uD83D\uDEE9 |\n\n" 
						+ "1.  List fleet\n" 
						+ "2.  Fly all jets\n"
						+ "3.  View fastest jet\n" 
						+ "4.  View aircraft with longest range\n"
						+ "5.  Load all cargo jets\n" 
						+ "6.  Dogfight!\n"
						+ "7.  Add aircraft to fleet\n" 
						+ "8. Remove aircraft from fleet\n" 
						+ "9. Quit"
						+ "\n| \uD83D\uDE81 \t  \uD83D\uDEE9 |\n\n" );


	}

}