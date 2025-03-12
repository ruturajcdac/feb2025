

import java.util.Scanner;


class Car{
	
	String colour;
	String brand;
	int engineCC;
	int topSpeed;
	
	Car(String colour, String brand, int engineCC, int topSpeed ){
		this.colour = colour;
		this.brand = brand;
		this.engineCC = engineCC;
		this.topSpeed = topSpeed;
	}
	
	void showDetails(){
		System.out.println("Colour: "+ this.colour);
		System.out.println("Brand: "+ this.brand);
		System.out.println("Engine CC: "+ this.engineCC);
		System.out.println("Top Speed: "+ this.topSpeed);
	}
	
	void Accelerator

	

}

class Practice_Car{
	public static void main(String args[]){
	
	Car SUV = new Car("Red", "BMW", 2000, 220);
	
	Car Sedan = new Car("White", "Audi", 1500, 120);
	
	SUV.showDetails();
	Sedan.showDetails();
	
		
		
		
	}
}
