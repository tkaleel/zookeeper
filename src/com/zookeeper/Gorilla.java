package com.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
		this.energyLevel = 200;
		// override bc gorillas are big mammals
	}
	
	public void throwSomething() {
		System.out.println("Gorilla threw something!");
		this.energyLevel -= 5;
		//alternate method if Mammal variables are private
//		int tempLevel = this.getEnergyLevel() - 5;
//		this.setEnergyLevel(tempLevel);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate a banan!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla parkour!");
		this.energyLevel -= 10;
	}
}
