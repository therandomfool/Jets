package com.skilldistillery;

public class Reconnaissance extends Jets {


	
	
	public Reconnaissance(String capability, String model, double speed, int range, long price) {
		super(capability, model, speed, price, range);
	}


	public void recon() {
		System.out.println("Your Recon Planes have been sent out to observe enemy movements!");
	}
}
