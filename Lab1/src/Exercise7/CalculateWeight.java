package Exercise7;

import java.util.Scanner;

public class CalculateWeight {
		
	//Declare variables
	
	double mass;
	
	public CalculateWeight(double mass) {
		this.mass = mass;
	}
	
	void setMass(double mass) {
		this.mass = mass;
	}
	
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		public void Calculate() {
			
		//Compute Weight in Mars
		//Compute Formula
		double earth = (mass * 9.81);
		double mars = (mass * 3.711);
		
		//Display weight
		System.out.println();
		System.out.println("Human Mass : " + mass + "Kg");
		System.out.println("Weight On Earth : " + earth + " N");
		System.out.println("Weight On Mars : " + mars + " N");
	}

}