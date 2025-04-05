package com.testingacademy.ex14_Shadow_DOM;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_ShadowDOM_03 {

    @Test
    @Description("Shadow DOM")
    public void shadowDOM_03() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/shadow");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //document.querySelector("div#open-shadow").shadowRoot.querySelector("div.control").querySelector("input#fname")
        WebElement firstName = (WebElement) js.executeScript("return document.querySelector(\"div#open-shadow\").shadowRoot.querySelector(\"div.control\").querySelector(\"input#fname\");");
        firstName.sendKeys("Trupti");
        System.out.println("Entered First Name in Shadow dom field");


        WebElement lastName = (WebElement) js.executeScript("return document.querySelector(\"div#open-shadow\").shadowRoot.querySelector(\"div.control\").querySelector(\"input#lname\");");
        lastName.sendKeys("Keni");
        System.out.println("Entered Last Name in Shadow dom field");

        Thread.sleep(2000);
        driver.quit();

    }
}
