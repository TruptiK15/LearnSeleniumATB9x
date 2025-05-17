package com.testingacademy.ex08_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Webtables_ex5_OrangeHRM {

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
                String dynamicxpath = first_part + i + second_part + j + third_part;
                //System.out.println(dynamic_XPath);
                String data = driver.findElement(By.xpath(dynamicxpath)).getText();
                //System.out.println(data);

                if (data.contains("0028")) {
                    String name_xpath = dynamicxpath + "/following-sibling::div";
                    String name = driver.findElement(By.xpath(name_xpath)).getText();
                    System.out.println("Name: "+ name);
                }
            }
        }
    }
}
