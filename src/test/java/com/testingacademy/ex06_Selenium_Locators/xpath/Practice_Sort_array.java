package com.testingacademy.ex06_Selenium_Locators.xpath;

import java.util.Arrays;

public class Practice_Sort_array {
    public static void main(String[] args) {

        //Sort Number in an Array to ascending order
        int[] numbers = {22, 10, 7, 50};

        Arrays.sort(numbers);
        System.out.println("Sorted Array: ");
        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
}
