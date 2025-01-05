package com.testingacademy.ex08_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium23_Webtables_OrangeHRM {

    @Test
    @Description("Find the WebTables")
    public void Test_Selenium23() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
        Thread.sleep(3000);

        System.out.println(driver.getTitle());
        String PageTitle = driver.findElement(By.xpath("//h6[normalize-space()='PIM']")).getText();
        System.out.println(PageTitle);

        // 1. Print all the data(elements) in the table
        String first_part = "//div[@class='oxd-table-body']/div[";
        String second_part = "]/div[1]/div[";
        String third_part = "]";

        //Fetching Table
        int row = driver.findElements(By.xpath("//div[@class=\"oxd-table-card\"]")).size();
        int col = driver.findElements(By.xpath("//div[@class=\"oxd-table-body\"]/div[1]/div[1]/div")).size();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                String dynamic_XPath = first_part + i + second_part + j + third_part;
                //System.out.println(dynamic_XPath);
                String data = driver.findElement(By.xpath(dynamic_XPath)).getText();
                //System.out.println(data);

                if (data.contains("0182")) {
                    String surname_xPath = dynamic_XPath + "/following-sibling::div";
                    String surname = driver.findElement(By.xpath(surname_xPath)).getText();
                    System.out.println(surname);
                }
            }
        }
    }
}
