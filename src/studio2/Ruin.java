package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Start amount:");
		int startAmount = in.nextInt();
		System.out.println("Win chance: ");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("How many Simulations");
		int totalSimulation = in.nextInt();

		int totalLoses = 0;

		int counterSimulation = 0;
	

		
		while(counterSimulation <= totalSimulation) {
			
			int counter = 0; 
						
			while((startAmount < winLimit) && (0 <= startAmount)) {
				boolean chance = Math.random() <= winChance;
				if(chance == true) {
					startAmount++;
				}
				else {
					startAmount--;
					totalLoses++;
				}
				counter++;
				//End of Second While
			}
			
			if(startAmount == winLimit) {
				System.out.println("Simulation " + counterSimulation +": " + counter + " Win");	
			}
			else {
				System.out.println("Simulation " + counterSimulation +": " + counter + " Lose");
			}
			//End of First While
			//System.out.println("Simulations ran: " + counter);
			counterSimulation++;
			
		}
		double ruinRate = totalLoses  / totalSimulation;


	}
}
