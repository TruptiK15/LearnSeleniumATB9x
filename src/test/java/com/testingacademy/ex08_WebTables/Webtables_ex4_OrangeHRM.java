package com.testingacademy.ex08_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Webtables_ex4_OrangeHRM {

    //WebTables - Tables with rows and column representation
    //Created with table Tag
    //we have Body with th - header, tr - rows and td - columns
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        // 1. Print all the data(elements) in the table
        String first_part = "//div[@class='oxd-table-body']/div[";
        String second_part = "]/div[1]/div[";
        String third_part = "]";

        WebElement table = driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
        List<WebElement> rows = table.findElements(By.xpath("//div[@class='oxd-table-card']"));

        boolean found = false;

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.xpath("//div[@role='cell']"));

            for (WebElement col : cols) {
                if (col.getText().trim().equalsIgnoreCase("Terminated")){
                    String employeeName = cols.get(1).getText();
                    System.out.println("First Terminated Employee: " + employeeName);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("No terminated employee found.");
        }
        driver.quit();
    }
}