package com.testingacademy.ex07_Advance_Locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Practice_printall_WebTable1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();

        // Open the webpage
        driver.get("https://awesomeqa.com/webtable1.html");
        Thread.sleep(2000);

        WebElement table1 = driver.findElement(By.tagName("table"));

        List<WebElement> rows = table1.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));

            for (WebElement col : cols) {
                System.out.print(col.getText() + " | ");
            }
            System.out.println();
        }
        driver.quit();
    }
}
