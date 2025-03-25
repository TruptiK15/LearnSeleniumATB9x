package com.testingacademy.ex11_Action_Advance;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium33_Action_Drag_n_drop {
    @Test
    @Description("Verify Actions - Drag and Drop")
    public void Test_Selenium33() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Drag and Drop
        //Source and Destinnation - from and to
        Actions actions = new Actions(driver);
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(from, to).build().perform();
        //actions.moveToElement(from).moveToElement(to).release(to).build().perform();

        driver.quit();
    }
}
