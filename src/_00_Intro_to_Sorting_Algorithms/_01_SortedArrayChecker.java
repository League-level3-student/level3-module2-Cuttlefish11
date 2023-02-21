package _00_Intro_to_Sorting_Algorithms;

import static org.junit.Assert.assertArrayEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _01_SortedArrayChecker {
	/*
	 * Write a static method called intArraySorted.
	 *
	 * This method takes in an array of integers and it returns a boolean. The
	 * method returns true if the integer array is in ascending order and false
	 * otherwise.
	 */
	public static boolean intArraySorted(int[] arr) {
		boolean q = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					q = false;
				}
			}

		}
		if (q == false) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * int[] ray = arr; for (int i = 0; i < ray.length; i++) { for (int j = 0; j <
	 * ray.length - 1; j++) { if (ray[j] > ray[j + 1]) {
	 * 
	 * int temp = ray[j]; ray[j] = ray[j + 1]; ray[j + 1] = temp; } } } if (ray ==
	 * arr) { return true; } else { return false; }
	 */

	/*
	 * 2. Write a static method called doubleArraySorted.
	 *
	 * This method takes in an array of doubles and it returns a boolean. The method
	 * returns true if the double array is in ascending order and false otherwise.
	 */
	public static boolean doubleArraySorted(double[] arr) {
		boolean q = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					q = false;
				}
			}

		}
		if (q == false) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * 3. Write a static method called charArraySorted.
	 * 
	 * This method takes in an array of characters and it returns a boolean. The
	 * method returns true if the character array is in alphabetical order and false
	 * otherwise (You can compare characters just like integers).
	 */

	
	
	  public static boolean charArraySorted(char[]arr) {
		  boolean q = true;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						q = false;
					}
				}

			}
			if (q == false) {
				return false;
			} else {
				return true;
			}
	 } 
	 /* 4. Write a static
	 * method called stringArraySorted.
	 *
	 * This method takes in an array of Strings and it returns a boolean. The method
	 * returns true if the String array is in alphabetical order and false otherwise
	 * (Use the compareTo(String) method).
	 */
	public static boolean stringArraySorted(String[] arr) {
		boolean q = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo(arr[ j+1 ]) > 0) {
					q = false;
				}
			}

		}
		if (q == false) {
			return false;
		} else {
			return true;
		}
	}
}
