package com.testingacademy.ex08_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium22_WebTables1 {

    @Test
    @Description("Print the country of 'Halen' in Webtable")
    public void Test_Selenium22() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable1.html");
        Thread.sleep(2000);

        // 1. Print all the data(elements) in the table
        // Locate the table element
        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]"));

        // Find all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Loop through each row (skip the header row)
        for (int i = 0 ; i < rows.size(); i++) {

            // Find all cells in the current row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));

            for (WebElement c : cells){
                System.out.println(c.getText());
            }
        }
        // Close the browser
        driver.quit();
    }
}
