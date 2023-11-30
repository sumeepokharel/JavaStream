//3)    Write a Java program to remove all duplicate elements
//from a list using streams.

package com.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> duplicateNumbers= Arrays.asList(10,11,12,13,114,15,16,17,18,10,12,34,12,15,16,5);
	
		
		System.out.println("List with duplicates: " + duplicateNumbers);
		List<Integer> withoutDuplicates = duplicateNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
		
		System.out.println("List without Duplicate elements:"+ withoutDuplicates);


	}

}
