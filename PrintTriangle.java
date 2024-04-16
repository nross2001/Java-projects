/*
 * Created on: Oct 5, 2023
 *
 * ULID: <nross14>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <user enters a number between 3 and 20 to print out a right triangle of *'s>
 *
 * @author <Nicholas Ross;
 *
 */
public class PrintTriangle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int tri;

		System.out.print("Enter a integer between 3 and 20");
		tri = input.nextInt();

		while (tri < 3 || tri > 20)
		{
			System.out.print("Enter a integer between 3 and 20: ");
			tri = input.nextInt();
		}
		for (int i = 1; i <= tri; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		input.close();

	}

}
