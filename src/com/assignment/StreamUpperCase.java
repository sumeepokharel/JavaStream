
//1)    Write a Java program to convert a list of strings
//to uppercase or lowercase using streams.
package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUpperCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "avocado", "kiwi", "raspberry", "blueberry");

        // to Convert all strings to uppercase using streams
        List<String> upperCaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original List: " + stringList);
        System.out.println("Uppercase List: " + upperCaseList);

        // to Convert all strings to lowercase using streams
        List<String> lowerCaseList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase List: " + lowerCaseList);
    }
}

