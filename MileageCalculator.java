/*
 * Created on: Sep 7, 2023
 *
 * ULID: <nross14>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <Asks the user to input the the number of gallons of gas and miles traveled
 * to calculate the miles per gallon>
 *
 * @author <Nicholas Ross;
 *
 */
public class MileageCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// allows the user to input
		Scanner keyword = new Scanner(System.in);

		// declared variable
		int miles;

		// prints out message
		System.out.print("Enter the amount of miles traveled: ");

		// allows the user to input
		miles = keyword.nextInt();

		// declared variable
		int gallons;

		// prints out message
		System.out.print("Enter the amount of gas used: ");

		// allows the user to input
		gallons = keyword.nextInt();

		// calculate the miles per gallon
		float mph = miles / (float) gallons;

		// prints out calculation
		System.out.print("Miles per gallons: " + mph);

		keyword.close();

	}

}
