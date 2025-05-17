package com.testingacademy.ex06_Selenium_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium16_xpath_Find_all_links {
    @Description("Make an Appointment using xpath")
    @Test
    public void test_Selenium17() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        //Thread.sleep(2000);

        System.out.println("-----List of All Links-----");
        //Find all button present in a Page
        List<WebElement> all_Links = driver.findElements(By.xpath("//a"));
        for (int j = 0; j < all_Links.size(); j++)
        {
            String all_link = all_Links.get(j).getText();
            System.out.println(all_link);
        }
        driver.quit();
    }
}
