package com.lambda;
import java.util.function.Predicate;

interface SumCalculator {
    int sum(int a, int b);
}

public class LambdaExamples {

    public static void sumOfTwoIntegers(){
        SumCalculator sumCalculator = (a, b) -> a + b;
        int result = sumCalculator.sum(1,2);
        System.out.println(result);
    }

    public static void checkIfStringIsEmpty(){
        Predicate<String> isEmptyString = str -> str.isEmpty();
        System.out.println(isEmptyString.test(""));
    }

    public static void checkIntegerIfLessThan18(){
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));
    }
}
