package com.testingacademy.ex09_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium26_SVG_map {

    @Test
    @Description("Click on SVG Element map")
    public void Test_Selenium26() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        Thread.sleep(2000);


        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgelements = driver.findElements(By.xpath("//*[local-name()=\"svg\"]"));
        svgelements.get(0).click();

        driver.quit();
    }
}
