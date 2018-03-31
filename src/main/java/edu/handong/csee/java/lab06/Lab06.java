
//package name edu.handong.csee.java.lab06;
package edu.handong.csee.java.lab06;

//import scanner to scan  keyboard input
import java.util.Scanner;

/**
 * get the volume of house store cockroach from user input 
 * get the value of cockroach
 * increase the value of cockroach 
 * @author SovanEco(Chhaya)
 *
 */
// create class lab06 as public

public class Lab06 {


	final double GROWTH_RATE =0.95;
	final double ONE_BUG_VOLUME = 0.002;

	/**
	 * this class to store the vale of GROWTH_RATE and GROWTH_RATE
	 * class variable as final Double type
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab06 myCokroch = new Lab06(); // constructor
		// object myCokroch call the value from Lab06
		myCokroch.compteNumOfBugKill();// constructor method

	}


	/**
	 * constructs and initializes  Lab06 on compteNumOfBugkill 
	 * 
	 */
	public void compteNumOfBugKill() {


		Scanner keyboard = new Scanner(System.in);
		//	Scanner keyboard = new Scanner (System.in);


		System.out.println("Enter the total volumn of your house");// print out Enter the total volumn of your house
		System.out.print("in cubic feet : ");// print out  in cubic feet
		// method variable 
		double houseVolumn = keyboard.nextDouble();// assign the house as double  and scan keyboard input


		System.out.println("Enter the estimate number of ");// print Enter estimate number of
		System.out.print("roaches in your house : ");// print out roaches is your house
		// method variable 
		double startPopulation = keyboard.nextDouble(); // scan keyboard from user input

		// method variable 
		double  population  = startPopulation;// population value  equal startPopulation value that user input

		// method variable 
		double totalBugvolumn = population  * ONE_BUG_VOLUME;//  totalBugvolumn calculating
		// method variable as integer
		int countWeek = 0;



		// while loop statement
		while (totalBugvolumn < houseVolumn) {

			//local variable
			double newBugs = population * GROWTH_RATE; // value of startPopulation * GROWTH_RATE = newBugs
			//local variable
			double newBugVolumn = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugvolumn = population  * ONE_BUG_VOLUME;
			countWeek = countWeek + 1;

		}	

		//print out Staring with a roach population of
		System.out.println("Staring with a roach population of  " + startPopulation );

		// print out and a house with a volumn of.. (..value..)..Cubic feet
		System.out.println("and a house with a volumn of "+   houseVolumn +" Cubic feet" );

		//print out After ..(value).. Week
		System.out.println("After " + countWeek +" Week" );

		//print out the hourse will be feiiled with...(..value..).. roaches
		System.out.println("the hourse will be feiiled with  " + population +" roaches");

		// print out They will fill a volume of ...(value of totalBugvolumn ).. cubic feet
		System.out.println("They will fill a volume of " + (int) totalBugvolumn + " cubic feet" );

		// print out Better call Debugging Experts Inc.
		System.out.println("Better call Debugging Experts Inc.");



	}



}