//2)    Write a Java program to calculate the sum of all even,
//odd numbers in a list using streams.

package com.assignment;

import java.util.Arrays;
import java.util.Collection;



public class CalculateSum {
	public static void main(String[]args) {
		Collection<Integer> numbers= Arrays.asList(10,11,12,13,114,15,16,17,18,19,20,21,22,23,24,25);
		//sum of even numbers
		 int sumOfEvens = numbers.stream()
			      .filter(num -> num % 2 == 0)
			      .mapToInt(Integer::intValue)
			      .sum();

			    System.out.println("Sum of even numbers: " + sumOfEvens);

			    // Sum of odd numbers
			    int sumOfOdds = numbers.stream()
			      .filter(num -> num % 2 != 0)
			      .mapToInt(Integer::intValue)
			      .sum();

			    System.out.println("Sum of odd numbers: " + sumOfOdds);
		
				
	
	}

}
