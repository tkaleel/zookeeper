package com.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		super();
		this.energyLevel = 300;
		//override bc this is a giant person-eating bat
	}
	
	public void fly() {
		System.out.println("*WOOOOSH* The giant bat takes off into the night!");
		this.energyLevel -= 50;
	}
	
	public void eatHuman() {
		System.out.println("*CENSORED FOR VIOLENT CONTENT*");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("SKREEEEE!! The giant bat is attacking! The town is on fire!");
		this.energyLevel -= 100;
	}
	
}
