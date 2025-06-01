package com.testingacademy.ex10_Action_Class;

import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_Scrolling {

    @Test
    @Description("Verify Actions - Scrolling")
    public void Test_Selenium32() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String URL = "https://thetestingacademy.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Scrolling
        //1. Scrolling of Page --> Keys.PAGE_DOWN
        //2. Scrolling of Particular element --> ~300 pixel --> Y axis

        //Limitation
        //to scroll to particular element - use JavaScript Executor
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("Scroll Down");
        Thread.sleep(3000);
        driver.quit();
    }
}
