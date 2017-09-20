package com.practicaljava.lesson6;

public class Contractor extends Person {

	public Contractor(String name) {
		super(name);
		
	}
	public boolean increasePay(int percent) {
		if (percent < Payable.INCREASE_CAP) {
			System.out.println("Increasing salary by " + percent + "%. "+ getName());
			return true;
		}else {
			System.out.println("Sorry, can't increase pay");
			return false;
		}
}

}
