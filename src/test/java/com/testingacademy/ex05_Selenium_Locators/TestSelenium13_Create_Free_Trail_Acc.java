package com.testingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestSelenium13_Create_Free_Trail_Acc {

    @Description("Options Class")
    @Test
    public void test_Selenium13() throws Exception {

   /*   Mini Project #1 (Selenium)
        - Locators - Find the Web elements
            1. Open the URL https://vwo.com/free-trial
            2. Enter email and click checkbox
            3. click on Create a new Trail Account
            4. Verify that the error message is shown "Your email, password, IP address or location did not match"
   */
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://vwo.com/free-trial");
        Thread.sleep(2000);

        WebElement business_email = driver.findElement(By.name("email"));
        business_email.sendKeys("987656789dasdasd");
        Thread.sleep(2000);

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

    //    List<WebElement> buttonList = driver.findElements(By.tagName("button"));
    //    buttonList.get(0).click();

        // <div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.25s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect. </div>
        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");
        Thread.sleep(2000);
        driver.quit();
    }

}
