package com.testingacademy.ex08_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTables {

    @Test
    @Description("Find the WebTables")
    public void Test_Selenium21() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        Thread.sleep(2000);

        // 1. Print all the data(elements) in the table
        // 2. if name Halen = country she belongs too country?

        // Dynamic tr and td
        //table[@id="customers"]/tbody/tr[5]/td[2]/preceding-sibling::td
        //table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td
        //xpath - //table[@id="customers"]/tbody/tr[i]/td[j]

        // 1. Print all the data(elements) in the table
        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        //Fetching Table
        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                String dynamicxpath = first_part + i + second_part + j + third_part;
                String data = driver.findElement(By.xpath(dynamicxpath)).getText();
                // Print all Table - System.out.println("Row " + (i - 1) + " column " + j + " : " + data);

                if (data.contains("Helen Bennett")) {
                    String country_xpath = dynamicxpath + "/following-sibling::td";
                    String country = driver.findElement(By.xpath(country_xpath)).getText();
                    System.out.println("Country of Helen Bennett is : " + country);
                }
            }
        }
    }
}