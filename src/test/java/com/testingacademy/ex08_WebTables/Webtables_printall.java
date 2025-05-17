package com.testingacademy.ex08_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Webtables_printall {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        try {
            // Open the webpage
            driver.get("https://awesomeqa.com/webtable.html");
            Thread.sleep(2000);

            // Locate the table
            WebElement table = driver.findElement(By.xpath("//table"));

            // Get all rows
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            // Iterate through rows
            for (WebElement row : rows) {
                // Get all columns for each row
                List<WebElement> cols = row.findElements(By.tagName("td"));

                // Print column values
                for (WebElement col : cols) {
                    System.out.print(col.getText() + " | ");
                }
                System.out.println();
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}