package com.skilldistillery;

public class FighterJet extends Jets implements CombatReady {


	
	public FighterJet(String capability, String model, double speed, int range, long price) {
		super(capability, model, speed, price, range);
	}

	
@Override
	public void fight() {
		System.out.println("Fight");
	}

}
