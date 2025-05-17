package com.testingacademy.ex08_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Webtables_ex2_foreach {

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

        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println(rows.size());

        //Print all values in Table
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
