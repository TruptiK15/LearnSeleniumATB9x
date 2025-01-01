package com.testingacademy.ex06_Selenium_Locators.xpath;

import java.util.Arrays;

public class Practice_2nd_smallest_no_in_array {
     public static void main(String [] args){

         int [] numbers = {10, 66, 4, 80};
         Arrays.sort(numbers);
         System.out.println("Smallest no in Array is: " + numbers[0]);
         System.out.println("Second smallest no in Array is: " + numbers[1]);
         System.out.println("Second Largest no in Array is: " + numbers[2]);
         System.out.println("Largest no in Array is: " + numbers[3]);
     }
}
