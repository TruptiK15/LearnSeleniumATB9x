package com.testingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test001_Driver_Chrome {

    @Description("Open the app.vwo.com and get the Title")
    @Test
    public void openChrome(){

        //Open a URL - app.vwo.com and print the title
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle()); //print title
        driver.close();
    }
}
