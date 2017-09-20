package com.practicaljava.lesson6;

public class Person {
	private String name;
	private String address;
	
	int INCREASE_CAP = 20;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "Person's name is " + name;
	}
	
	public void changeAddress(String address) {
		this.address = address;
		System.out.println("New address is " + address);
	}
	
	private void giveDayOff() {
		System.out.println("Giving day off to " + name);
	}
	
	public void promote(int percent) {
		System.out.println("Prmoting a worker...");
		giveDayOff();
		increasePay(percent);
	}

}
