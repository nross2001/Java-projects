/*
 * Created on: Sep 21, 2023
 *
 * ULID: <nross14>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <The user would type in a url website and the program would tell what type of
 * website it is>
 *
 * @author <Nicholas Ross;
 *
 */
public class URLchecker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);// creates scanner
		String website;// declared variable
		System.out.print("Enter a website: ");// prints message
		website = input.nextLine();// user input

		// declared variables
		String gov;
		String edu;
		String com;
		String org;
		String web;

		int end = website.lastIndexOf(".");// starts off with a character
		web = website.substring(end + 1);// only count the last three characters
		// if statements
		if (web.equals("gov"))// if it has gov
		{
			System.out.println("This is a government website");// prints message
		} else if (web.equals("edu"))// if it has edu
		{
			System.out.println("This is a school website");// prints message
		} else if (web.equals("com"))// if it has com
		{
			System.out.print("This is a commercial website");// prints message
		} else if (web.equals("org"))// if it has org
		{
			System.out.print("This is a goverment website");// prints message
		} else
		{
			System.out.print("");
		}
		input.close();// close user input

	}

}
