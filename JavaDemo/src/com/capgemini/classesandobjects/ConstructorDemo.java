package com.capgemini.classesandobjects;

public class CarDemo{
	private String doors;
	private int speed;
	
	
	public void Car() {
		doors = "opned";
		speed =0;
		
	}
	public void Car(String doors, int speed) {
		this.doors =doors;
		this.speed = speed;
		
	}
	
	public String getDoors() {
		return doors;
	}
	
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("closed") && speed>0) {
			return "running";
		}
		else {
			return"not running";
		}
	}
}	
	
public class ConstructorDemo {
	public static void main(String[] args) {
		Car car =new Car("closed", 10);
		System.out.println(car.run());
		
	}

}
