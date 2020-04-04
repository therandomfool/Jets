package com.skilldistillery;

import java.util.*;

public class AirField {
	
//	set up
	private List<Jets> jetList = new ArrayList<>();
	private Scanner input = new Scanner(System.in);
	
	
//	create contructor
	public AirField() {
		super();
		// TODO Auto-generated constructor stub
	}

//	setters n getters

	public List<Jets> getJetList() {
		return jetList;
	}


	public void setJetList(List<Jets> jetList) {
		this.jetList = jetList;
	}


	public Scanner getInput() {
		return input;
	}


	public void setInput(Scanner input) {
		this.input = input;
	}
	

	
}
