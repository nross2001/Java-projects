/**
 *Created on: Sep 12, 2023
 * ULID:<nross14>
 *Class: IT 168
 */
package edu.ilstu;

import java.util.Random;
import java.util.Scanner;

/**
 * <After user inputs in what's being asked, the program would generate a
 * password for them>
 *
 * @author Nicholas Ross
 */
public class PasswordVault {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// created for user to be able to input
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		// generate random characters
		Random rand = new Random();
		// declared variables
		String website;
		String email;
		String username;
		String note;
		// displays message
		System.out.print("Enter the website name: ");
		// user input
		website = input.next();
		// display message
		System.out.print("Enter the username: ");
		// user input
		username = input.next();
		// display message
		System.out.print("Enter the email: ");
		// user input
		email = input.next();
		// display message
		System.out.print("Add a note: ");
		// user input
		note = input2.nextLine();

		// next line
		System.out.println();

		// declared variables
		int num = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int num3 = rand.nextInt(10);
		char c1 = (char) (rand.nextInt(26) + 65);
		char c2 = Character.toLowerCase((char) (rand.nextInt(26) + 65));
		char c3 = (char) (rand.nextInt(26) + 65);
		char c4 = Character.toLowerCase((char) (rand.nextInt(26) + 65));
		char c5 = Character.toLowerCase((char) (rand.nextInt(26) + 65));
		int num4 = rand.nextInt(10);
		int num5 = rand.nextInt(10);

		// displays outputs
		System.out.println("Website Name: " + website);
		System.out.println("Website URL: https://www." + website + ".net");
		System.out.println("Email: " + email);
		System.out.println("Username: " + username);
		System.out.println("Password: " + num + num2 + num3 + c1 + c2 + c3 + c5 + num4 + num5);
		System.out.println("Note: " + note);

		// user input stops
		input.close();

	}
}
