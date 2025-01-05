package com.testingacademy.ex08_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium22_WebTables {

    @Test
    @Description("Print the country of 'Halen' in Webtable")
    public void Test_Selenium22() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");
        Thread.sleep(2000);

        // 1. Print all the data(elements) in the table
        // 2. if name Halen = country she belongs too country?

        //String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        //String second_part = "]/td[";
        //String third_part = "]";

        // Locate the table element
        WebElement table = driver.findElement(By.tagName("table"));

        // Find all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Loop through each row (skip the header row)
        for (int i = 1; i < rows.size(); i++) {

            // Find all cells in the current row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));

            // Check if the second column (Contact Name) contains "Helen"
            if (cells.size() > 1 && cells.get(1).getText().equalsIgnoreCase("Helen Bennett")) {

                // Print the corresponding country (third column)
                System.out.println("Helen belongs to: " + cells.get(2).getText());
                break;
            }
        }
        // Close the browser
        driver.quit();
    }
}
