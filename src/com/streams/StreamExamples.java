package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {

    public static void getAverage(){
        List<Integer> nums = Arrays.asList(1,3,6,8,10,18,36);
        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(average);
    }
}
