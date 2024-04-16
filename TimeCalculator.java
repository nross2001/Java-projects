/*
 * Created on: Sep 14, 2023
 *
 * ULID: mevelet
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Testing prelab4 question calculates hours minutes and seconds with user input
 * of seconds.
 *
 * @author Michael Veleta Nicholas Ross
 *
 */
public class TimeCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);// creates user input
		final int SECONDS_IN_HOUR = 3600;// constant in seconds

		System.out.print("Enter number of seconds: ");// prints message
		int userSeconds = scan.nextInt();// user input
		// declared variables
		int hours = userSeconds / SECONDS_IN_HOUR;
		int minutes = (userSeconds % SECONDS_IN_HOUR) / 60;
		int seconds = userSeconds % 60;
		// prints message
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);

		scan.close();// closes user input
	}

}
