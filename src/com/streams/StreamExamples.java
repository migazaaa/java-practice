package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void getAverage(){
        List<Integer> nums = Arrays.asList(1,3,6,8,10,18,36);
        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(average);
    }

    public static void convertStringToUpperCase(){
        List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String> upperCaseStrings = colors.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseStrings);
    }

    public static void convertStringToLowerCase(){
        List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String> lowerCaseStrings = colors.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowerCaseStrings);
    }

    public static void sumOfEvenNumbers(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumOfEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfEven);
    }

    public static void sumOfOddNumbers(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumOfOdd = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfOdd);
    }

    public static void removeDuplicateElementsFromList(){
        List<Integer> numbers = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }

    public static void countStringsStartingWithSpecificLetter(){
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        char startingLetter = 'B';
        long counter = colors.stream()
                .filter(color -> color.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println(counter);
    }

    public static void sortListOfStringsInAscendingOrder(){
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> ascendingOrder = colors.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ascendingOrder);
    }

    public static void sortListOfStringsInDescendingOrder(){
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> descendingOrder = colors.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descendingOrder);
    }
}
