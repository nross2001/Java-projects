/*
 * Created on: Sep 14, 2023
 *
 * ULID: mevelet
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * 
 * <Using objects to calculate the payrate between employee 1 and employee 2>
 * 
 * @author Michael Veleta Nicholas Ross;
 *
 */
public class Payroll
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);// creates user input

		Employee emp1 = new Employee("James", "Addison", 17.00);// declared an object

		// declared variables
		String emp2first;
		String emp2last;
		double rate;
		double raise;

		System.out.print("Enter first name for employee 2: ");// print out message
		emp2first = input.nextLine();// user input
		System.out.print("Enter last name for employee 2: ");// print out message
		emp2last = input.nextLine();// user input
		System.out.print("Enter payrate for employee 2: ");// print out message
		rate = input.nextDouble();// user input

		Employee emp2 = new Employee(emp2last, emp2first, rate);// declared an object

		// passing methods
		emp1.print();
		emp2.print();
		emp1.calculatePay(42);
		emp2.calculatePay(40);
		// declared variable
		double raise2;

		System.out.print("Enter the percentage raise for employee 1: ");// print out message
		raise = input.nextDouble();// user input
		System.out.print("Enter the percentage raise for employee 2: ");// print out message
		raise2 = input.nextDouble();// user input

		// passing methods
		emp1.giveRaise(raise);
		emp1.calculatePay(42);
		emp2.getPayRate();
		emp1.getPayRate();
		emp2.getPayRate();
		emp2.giveRaise(raise2);
		emp1.printPayrollLine(42);
		emp2.printPayrollLine(40);
		emp1.print();
		emp2.print();

		input.close();// close user input

	}

}
