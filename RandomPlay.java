/*
 * Created on: Sep 21, 2023
 *
 * ULID: <nross14>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Random;

/**
 * <Generates random numbers than compares two numbers with each other and see
 * if one of the numbers is less than or greater than 100>
 *
 * @author <Nicholas Ross;
 *
 */
public class RandomPlay
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Random random = new Random();// imported random generator
		int num1;// declared variable
		final int BEGIN = 0;// declared constant
		final int FINISH = 200;// declared constant
		System.out.println("Pick a number from 1 - 200 ");// prints message
		num1 = random.nextInt(FINISH - BEGIN) + 1;// generates random number
		if (num1 % 2 == 0)// checks if it even or odd
		{
			System.out.println(num1 + " is even");// prints even message
		} else
			System.out.println(num1 + " is odd");// prints odd message
		if (num1 > 100)// checks to see if number is greater than 100
		{
			System.out.println(num1 + " is greater than 100");// prints greater than 100
		} else
			System.out.println(num1 + " is less than 100");// prints less than 100
		int num2;// declared variable
		System.out.println("Pick a number from 1 - 200 ");// prints message
		num2 = random.nextInt(FINISH - BEGIN) + 1;// generate random number
		if (num2 > num1)// compare two numbers to each other
		{
			System.out.println(num2 + " is greater " + num1);// prints number is greater
		} else
			System.out.println(num2 + " is less than " + num1);// prints number is less than

	}

}
