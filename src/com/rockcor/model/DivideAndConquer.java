/**
 * 
 */
package com.rockcor.model;

import java.lang.reflect.Array;

/**
 * @author Rockcor
 *
 */
public class DivideAndConquer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] values = {2, 1, 1, 1, 1, 1, 2};
		
		System.out.println("Sum = " + sum(values, 0));
	}
	
	/**
	 * Sum all the elements of an arrangement, using the Divide and Conquer strategy and recursive method. 
	 * @param values
	 * @param index
	 * @return
	 */
	private static int sum(int[] values, int index) {
		
		if(values.length-1 == index) { //Base case
			return values[index];
		}
		else { //Recursive case
			int tempValue = values[index];
			index++;
			return tempValue + sum(values, index); 
		}
	}

}
