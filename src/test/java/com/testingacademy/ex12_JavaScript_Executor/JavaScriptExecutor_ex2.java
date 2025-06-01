package com.testingacademy.ex12_JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_ex2 {
    public static void main(String[] args) throws InterruptedException {

        //Shadow Dom - element is hidden or its properties are enacapsulated from user
        //so we cannot access the element directly
        //so we need to use JavaScriptExecutor to access it
        //always check element in console and return it in WebElement

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("alert(1)");
        //js.executeScript("alert('Hello Trupti...')");

        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL : " + url);

        String title = js.executeScript("return document.title").toString();
        System.out.println("Title : "+ title);

        driver.quit();

    }
}
