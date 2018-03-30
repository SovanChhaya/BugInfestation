package main.java;
import java.util.Scanner;



public class Maincokroch {

	 final double GROWTH_RATE =0.95;
	   final double ONE_BUG_VOLUME = 0.002;
	   
	   
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Maincokroch myCokroch = new Maincokroch();
			myCokroch.compteNumOfBugKill();
			
		}
		
		public void compteNumOfBugKill() {
			 Scanner keyboard = new Scanner(System.in);
			 	
		//	Scanner keepWork = new Scanner (System.in);
			
			double houseVolumn = keyboard.nextDouble();
			double startPopulation = keyboard.nextDouble();
			double  population  = startPopulation;
			
			
			double totalBugvolumn = population  * ONE_BUG_VOLUME;
			
			int countWeek = 0;
			
	while (totalBugvolumn < houseVolumn) {
		
		double newBugs = population * GROWTH_RATE;
		double newBugVolumn = newBugs * ONE_BUG_VOLUME;
		   population = population + newBugs;
		   totalBugvolumn = countWeek +1;

				   }
		System.out.println(" StartPop = " +startPopulation );
		System.out.println(" house vol = " +houseVolumn );
		System.out.println(" count Week = " +countWeek );
		System.out.println(" Pop = " +population );
		System.out.println(" total bug vol = " +totalBugvolumn );
			
			
		}

	}