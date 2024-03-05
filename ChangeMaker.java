/*
 * Created on: Sep 28, 2023
 *
 * ULID: <nross14>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author <Nicholas Ross;
 *
 */
public class ChangeMaker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final int QUARTERS = 25;
		final int DOLLAR = 100;
		final int DIMES = 10;
		final int NICKLES = 5;
		final int ITEM_PRICE_INCREMENTS = 5;
		int change;
		int itemPrice;
		int totalQuarters;
		int totalDimes;
		int totalNickels;

		Scanner input = new Scanner(System.in);

		System.out.println("Item price must be 25 cents to a dollar, in 5-cent increment.");
		System.out.print("Enter item price: ");
		itemPrice = input.nextInt();

		if (itemPrice < 25)
		{
			System.out.print("Invalid, must be higher than 25");
		} else if (itemPrice > 100)
		{
			System.out.print("Invaild, must be lower than 100");
		}

		totalQuarters = DOLLAR - itemPrice;
		totalQuarters = itemPrice % QUARTERS;
		totalQuarters %= QUARTERS;

		System.out.println("Quarters: " + totalQuarters);
		System.out.println("Dimes: ");
		System.out.println("Nickles: ");

	}

}
