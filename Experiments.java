/*
 * Created on: Aug 31, 2023
 *
 * ULID: <nross14>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <Experimenting on which data types can go together than calculating the total
 * output>
 *
 * @author <Nicholas Ross;
 *
 */
public class Experiments
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// variables
		short aShort = 6;
		long aLong = 105;
		int int1 = 10;
		int int2 = 11;
		float aFloat = 1.5f;
		double aDouble = 100.3;

		// calculates total outputs
		double total1 = int2 / 2;
		double total2 = int2 / 2.0;
		long total3 = int1 % 2;
		long total4 = int1 % 4;
		int total5 = int2 % 2;
		int total6 = int2 % 3;
		int total7 = int2 % 4;
		int total8 = 2 + 3 * 4;
		int total9 = (2 + 3) * 4;

		/*
		 * all assignments can be assign together aLong = aShort; aLong = int1; aLong =
		 * int2;
		 * 
		 * int1 = aShort; int1 = int2;
		 * 
		 * int2 = aShort; int2 = int1;
		 * 
		 * aFloat = aShort; aFloat = aLong; aFloat = int1; aFloat = int2;
		 * 
		 * aDouble = aShort; aDouble = aLong; aDouble = int1; aDouble = int2; aDouble =
		 * aFloat;
		 */

		/*
		 * assignments can't be together aLong = aFloat; aLong = aDouble;
		 * 
		 * int1 = aDouble; int1 = aLong; int1 = aFloat;
		 * 
		 * int2 = aLong = 105; int2 = aFloat =1.5f; int2 = aDouble = 100.3;
		 * 
		 * aFloat = aDouble = 100.3;
		 */

		// prints out predictions
		aDouble = int2 / 2; // print out 5.0;
		aDouble = int2 / 2.0; // prints out 5.5
		aLong = int1 % 2; // prints out 0
		aLong = int1 % 4; // prints out 2
		int1 = int2 % 2; // prints out 1
		int1 = int2 % 3; // prints out 2
		int1 = int2 % 4; // prints out 3
		int1 = 2 + 3 * 4;// prints out 14
		int1 = (2 + 3) * 4; // prints out 24

		// prints out the correct answers
		System.out.println("aDouble = int2 / 2; results in: " + total1);
		System.out.println("aDouble = int2 / 2.0; results in: " + total2);
		System.out.println("aLong = int1 % 2; results in: " + total3);
		System.out.println("aLong = int1 / 4; results in: " + total4);
		System.out.println("int1 = int2 % 2; results in: " + total5);
		System.out.println("int1 = int2 % 3; results in: " + total6);
		System.out.println("int1 = int2 % 4; results in: " + total7);
		System.out.println("int1 = 2 + 3 * 4; results in: " + total8);
		System.out.println("int1 = (2 + 3) * 4; results in: " + total9);

	}

}
