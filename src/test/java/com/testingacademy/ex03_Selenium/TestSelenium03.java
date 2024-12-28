package com.testingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Open the app.vwo.com and get the Title")
    @Test
    public void test_Selenium01() {

        // In Selenium 3.14 - older version
        // You need to setup the Driver (browser)
        /*
         Firefox --> System.setProperty("webdriver.gecko.driver","/path/geckodriver.exe");
         Chrome --> System.setProperty("webdriver.chrome.driver","/path/chromeodriver.exe");
         Safari --> System.setProperty("webdriver.safari.driver","/path/safaridriver.exe");
         Edge --> System.setProperty("webdriver.edge.driver","/path/edgedriver.exe");
         IE --> System.setProperty("webdriver.ie.driver","/path/IEDriverServer.exe");
        */

        //In Selenium 4.x
        //Selenium Manager - utility - which download the driver automatically
        //and start and stop itself

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
