package practice;

//Abstraction.

abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle{
	void start() {
		System.out.println("car starts with key");
	}
}

class Scooter extends Vehicle{
	void start() {
	System.out.println("scooter starts with kick");
}
	
	
	public static void main(String[] args) {
		Car c= new Car();
		c.start();
		
		Scooter s = new Scooter();
		s.start();
		
		Vehicle v1= new Car();//reference var of vehicle abstract class.
		v1.start();
		
		Vehicle v2= new Scooter();
		v2.start();
		
		
	}

}
