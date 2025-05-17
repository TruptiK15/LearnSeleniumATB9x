package com.testingacademy.ex08_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Webtables_ex1 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.tagName("table")); //find table

        List<WebElement> rows = table.findElements(By.tagName("tr"));  //find rows
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));  //find colums

            for (WebElement col : cols) {
                String print = col.getText();
                System.out.print(print + " | ");
            }
            System.out.println();
        }

        driver.quit();
    }
}
