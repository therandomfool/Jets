package com.skilldistillery;

public class CargoPlane extends Jets implements CargoCarrier {




	public CargoPlane(String capability, String model, double speed, int range, long price) {
		super(capability, model, speed, price, range);
	}

	public void loadCargo() {
		System.out.println("LOADING CARGO");
	}

}
