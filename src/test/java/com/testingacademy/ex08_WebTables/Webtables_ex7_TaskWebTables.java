package com.testingacademy.ex08_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Webtables_ex7_TaskWebTables {

    @Test
    @Description("Find the WebTables")
    public void Test_Selenium24() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
        Thread.sleep(3000);

            // 1. Print all the data(elements) in the table
            // Locate the table element
            WebElement table = driver.findElement(By.xpath("//div[@class=\"oxd-table-card\"]"));

            // Find all rows in the table
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            // Loop through each row (skip the header row)
            for (int i = 0; i < rows.size(); i++) {

                // Find all cells in the current row
                List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));

                for (WebElement c : cells) {
                    System.out.println(c.getText());
                }
            }
            // Close the browser
            driver.quit();
        }
    }
