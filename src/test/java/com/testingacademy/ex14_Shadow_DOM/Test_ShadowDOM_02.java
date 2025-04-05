package com.testingacademy.ex14_Shadow_DOM;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_ShadowDOM_02 {

    @Test
    @Description("Shadow DOM")
    public void shadowDOM_02() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/shadowdom");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowBtn = (WebElement) js.executeScript("return document.querySelector(\"div#shadow-host\").shadowRoot.querySelector(\"button#my-btn\");");
        shadowBtn.click();

        System.out.println("Click on Shadow Dom button");
        System.out.println(shadowBtn.getText());

        driver.quit();

        //document.querySelector("div#open-shadow").shadowRoot.querySelector("div.control").querySelector("input#fname")
    }
}
