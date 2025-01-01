package com.testingacademy.ex06_Selenium_Locators.xpath;

import java.util.Arrays;

public class Practice_sum_of_arrays {
    public static void main(String[] args) {

        //Find Second Largest Number in an Array
        int[] numbers = {23, 10, 7, 60};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
