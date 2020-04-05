package com.skilldistillery;

import java.io.*;
import java.util.*;

public class AirField {

//	set up
	private List<Jets> jetList = new ArrayList<>();

	public AirField() {
//		this.jetList = createJetList();
	}

	public void setJetList(List<Jets> jetList) {
		this.jetList = jetList;
	}

	public List<Jets> getJetList() {
		return jetList;
	}

	public void  createJetList() {
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
					jetList.add(jet);
				} else if (newJet[0].equalsIgnoreCase("CargoTransport")) {
					jetList.add(new CargoPlane(capability, model, speed, range, price));
				} else if (newJet[0].equalsIgnoreCase("Reconnaissance")) {
					jetList.add(new Reconnaissance(capability, model, speed, range, price));
				} else {
					jetList.add(new JetImpl(capability, model, speed, range, price));
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	public void pJets() {
		for (Jets jets : jetList) {
			System.out.println(jets.toString());
		}
	}
	}

