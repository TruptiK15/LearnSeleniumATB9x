package com.testingacademy.ex06_Selenium_Locators.xpath;

import java.util.Arrays;

public class Practice_2nd_largest_no_in_array {
    public static void main(String[] args) {

        //Find Second Largest Number in an Array
        int[] numbers = {22, 10, 7, 50};

        Arrays.sort(numbers);
        System.out.println("Second Largest no in array is:"+numbers[numbers.length-2]);
    }
}
