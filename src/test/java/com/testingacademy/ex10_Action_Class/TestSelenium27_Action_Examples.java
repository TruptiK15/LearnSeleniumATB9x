package com.testingacademy.ex10_Action_Class;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium27_Action_Examples {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @Test
    @Description("Verify Acions")
    public void Test_Selenium25() throws InterruptedException {

        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        Thread.sleep(2000);

        //Actions actions = new Actions(driver);
        /*
        ------------Perform Mouse Action----------------
        1. moveToElement(live).build().perform();
        2. doubleClick() - perform double click
        3. clickAndHold() - long click on mouse without releasing it
        4. dragAndDrop() - drag the element from one point and drop to another
        5. moveToElement() - shift the mouse pointer to center
        6. contextClick() - perform right click
        7. sendKeys() - sends a series of keys
        8. keyUp() - perform key release
        9. keyDown() - perform key press without release

        -------------Keyboard Events------------
        1. keyDown(KeyCode)
        Parameters - Keys.ALT, Keys.SHIFT, Keys.CONTROL

        2. keyUp(KeyCode)
        Parameters - Keys.ALT, Keys.SHIFT, Keys.CONTROL
         */

    }
    @AfterTest
    public void CloseBrowser() throws InterruptedException {
        driver.quit();
    }
}
