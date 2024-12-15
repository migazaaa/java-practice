package com.streams;

import java.util.Arrays;
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
}
