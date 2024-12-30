package com.testingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium11_invalid_input {

    @Description("Options Class")
    @Test
    public void test_Selenium11() throws Exception {

/* Mini Project #1 (Selenium)
- Locators - Find the Web elements
    1. Open the URL https://app.vwo.com/#/login
    2. Find the Email inputbox and enter the email as **admin@admin.com**
    3. Find the Pass inputbox and enter password as **admin**.
    4. Find and Click on the submit button
    5. Verify that the error message is shown "Your email, password, IP address or location did not match"
*/
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--start-maximized");

    // 1. Open the URL https://app.vwo.com/#/login
        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://app.vwo.com");
        Thread.sleep(3000);

    // 2. Find the Email inputbox and enter the email as "admin@admin.com"
    // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi" fdprocessedid="2y868b">
        WebElement emailInputbox = driver.findElement(By.id("login-username"));
        emailInputbox.sendKeys("admin@admin.com");

    // 3. Find the Password inputbox and enter passwrod as "admin".
    //<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe" fdprocessedid="qs3v9a">
        WebElement passwordInputbox = driver.findElement(By.id("login-password"));
        passwordInputbox.sendKeys("admin");

    // 4. Find and Click on the submit button
    // <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica" fdprocessedid="vcw3ns">
        WebElement buttonsubmit = driver.findElement(By.id("js-login-btn"));
        buttonsubmit.click();
        Thread.sleep(3000);

    // 5. Verify that the error message is shown "Your email, password, IP address or location did not match"
    // <div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        WebElement errormessage = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errormessage.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(3000);
        driver.quit();
    }
}
