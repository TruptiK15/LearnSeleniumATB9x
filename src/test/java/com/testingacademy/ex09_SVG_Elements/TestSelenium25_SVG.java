package com.testingacademy.ex09_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium25_SVG {

    @Test
    @Description("Click on SVG Element")
    public void Test_Selenium25() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);


        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgelements = driver.findElements(By.xpath("//*[local-name()=\"svg\"]"));
        //List<WebElement> svgelements = driver.findElements(By.xpath("//*[name()=\"svg\"]"));
        svgelements.get(0).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
