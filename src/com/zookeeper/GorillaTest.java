package com.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla winston = new Gorilla();
//		Mammal sachiko = new Mammal();
//		
//		sachiko.displayEnergy();
		winston.displayEnergy();
		
		winston.throwSomething();
		winston.displayEnergy();
		winston.eatBananas();
		winston.climb();
		winston.displayEnergy();
		System.out.println("Hello Zookeeper");

	}

}
