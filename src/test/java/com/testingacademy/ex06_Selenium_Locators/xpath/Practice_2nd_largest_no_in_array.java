package com.testingacademy.ex06_Selenium_Locators.xpath;

import java.util.Arrays;

public class Practice_2nd_largest_no_in_array {
    public static void main(String[] args) {

        int[] no = {2, 3, 1, 4};
        Arrays.sort(no);

        //print all array
        for (int n : no) {
            System.out.print(n + " ");
        }
        System.out.println();

        int smallest = no[0];
        System.out.println("Smallest no : " + smallest);

        int largest = no[no.length - 1];
        System.out.println("Largest no : " + largest);

        int secondlargest = no[no.length - 2];
        System.out.println("Second Largest no : "+ secondlargest);

    }
}
