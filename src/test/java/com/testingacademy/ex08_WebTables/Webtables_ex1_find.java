package com.testingacademy.ex08_WebTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Webtables_ex1_find {

    public static void main(String[] args) throws InterruptedException {

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
                //Print all data in Table
                //System.out.print(col.getText() + " | ");

                if (col.getText().contains("Helen Bennett")){
                    //print Country
                    //String findCountry = col + "/following-sibling::td";
                    //String countryText = col.findElement(By.xpath(findCountry)).getText();

                    String countryText = cols.get(2).getText(); // 3rd column (0-based indexing)
                    System.out.println("Country : " + countryText);
                }
            }
        }
        driver.quit();
    }
}
