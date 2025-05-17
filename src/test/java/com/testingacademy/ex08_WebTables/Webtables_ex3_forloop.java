package com.testingacademy.ex08_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Webtables_ex3_forloop {

    //WebTables - Tables with rows and column representation
    //Created with table Tag
    //we have Body with th - header, tr - rows and td - columns

    @Test
    @Description("Find the WebTables")
    public void Test_Selenium23() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");
        Thread.sleep(2000);

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int cols = driver.findElements(By.xpath("//table/tbody/tr[2]/td")).size();
        System.out.println("Rows : " + rows);
        System.out.println("Columns : " + cols);

        //Xpath - //table[@id='customers']/tbody/tr[2]/td[1]
        String table_xpath = "//table[@id='customers']/tbody/tr[";
        String row_xpath = "]/td[";
        String col_xpath = "]";

        //Print all values in Table
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                String dynamicPath = table_xpath + i + row_xpath + j + col_xpath;
                String data = driver.findElement(By.xpath(dynamicPath)).getText();
                System.out.print(data + " | ");
            }
            System.out.println();
        }
        driver.quit();
    }
}
