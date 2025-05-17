package com.testingacademy.ex07_Advance_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CssSelector {
    @Test
    @Description("Learning CssSelector")
    public void Test_Selenium20() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        //CSS Selector -
        //Syntax - attribute = value
        //Attribute selectors           xpath
        // #id	                     //*[@id="id"]
        // .class	                 //*[@class="class"]
        //input[type="submit"]	     //input[@type="submit"]
        //a#abc[for="xyz"]	         //a[@id="abc"][@for="xyz"]	?
        //a[rel]	                 //a[@rel]
        //a[href^='/']	             //a[starts-with(@href, '/')]	?
        //a[href$='pdf']	         //a[ends-with(@href, '.pdf')]
        //a[href*='://']	         //a[contains(@href, '://')]
        //a[rel~='help']	         //a[contains(@rel, 'help')]

        driver.findElement(By.cssSelector("img[title=\"Flipkart\"]"));

        //* find partial text
        driver.findElement(By.cssSelector("img[title*=\"Flip\"]"));

        //starts-with
        driver.findElement(By.cssSelector("img[title^=\"Flip\"]"));

        //ends-with
        driver.findElement(By.cssSelector("img[title$=\"kart\"]"));

        driver.quit();
    }
}
