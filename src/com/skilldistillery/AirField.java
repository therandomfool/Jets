package com.skilldistillery;


import java.io.*;
import java.util.*;

public class AirField {

//	set up
	private List<Jets> jetList = new ArrayList<>();
	private Scanner input = new Scanner(System.in);

//	create contructor
	public AirField(List<Jets> jetList) {
		this.jetList = createJetList();
	}

	public void setJetList(List<Jets> jetList) {
		this.jetList = jetList;
	}

	private List<Jets> createJetList() {
		try {

			BufferedReader br = new BufferedReader(new FileReader("Jets.txt"));
			String name;
			String[] newJet = null;

			// read txt
			while ((name = br.readLine()) != null) {
				newJet = name.split(", ");
				String capability = newJet[0];
				String model = newJet[1];
				double speed = Double.parseDouble(newJet[2]);
				int range = Integer.parseInt(newJet[3]);
				int price = Integer.parseInt(newJet[4]);

				if (newJet[0].equalsIgnoreCase("Fighter")) {
					jetList.add(new FighterJet(capability, model, speed, range, price));
				} else if (newJet[0].equalsIgnoreCase("CargoTransport")) {
					jetList.add(new CargoPlane(capability, model, speed, range, price));
				} else if (newJet[0].equalsIgnoreCase("Reconnaissance")) {
					jetList.add(new Reconnaissance(capability, model, speed, range, price));
				} else {
					jetList.add(new JetImpl(capability, model, speed, range, price));
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jetList;
	}

}
