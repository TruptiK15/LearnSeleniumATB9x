package com.testingacademy.ex07_Advance_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium21_WebTables {

    @Test
    @Description("Find the WebTables")
    public void Test_Selenium21() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(2000);

        // 1. Print all the data(elements) in the table
        // 2. if name Halen = country she belongs too country?

        // Dynamic tr and td
        //table[@id="customers"]/tbody/tr[5]/td[2]/preceding-sibling::td
        //table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td

        //xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[j]

        String st1 = "//table[@id=\"customers\"]/tbody/tr[";
        String st2 = "]/td[";
        String st3 = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i=2; i<=row; i++ ){
            for (int j=1; j<=col; j++){
                String dynamic_path = st1+i+st2+j+st3;
                //System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                //System.out.println(data);
                if (data.contains("Helen Bennett")){
                    String country_Xpath = dynamic_path +"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_Xpath)).getText();
                    System.out.println("Helen Bennett is In - " + country_text);
                }
            }
        }
    }
}