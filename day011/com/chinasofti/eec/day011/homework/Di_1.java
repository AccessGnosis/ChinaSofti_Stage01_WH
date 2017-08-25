/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_1.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: обнГ3:51:50
*/
package com.chinasofti.eec.day011.homework;

public class Di_1 {

	public static void main(String[] args) {
		RaceCar racer = new RaceCar();
		Car car = new RaceCar();
		Vehicle vehicle = new RaceCar();
		System.out.println(
				racer.speed() + ", " + car.speed() + ", " + vehicle.speed());

	}

}

abstract class Vehicle {
	public int speed() {
		return 0;
	}
}

class Car extends Vehicle {
	public int speed() {
		return 60;
	}
}

class RaceCar extends Car {
	public int speed() {
		return 150;
	}
}
