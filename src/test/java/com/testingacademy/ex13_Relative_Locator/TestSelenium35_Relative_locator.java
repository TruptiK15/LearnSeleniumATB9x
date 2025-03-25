package com.testingacademy.ex13_Relative_Locator;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium35_Relative_locator {

    @Test
    @Description("Verify Actions Drag and Drop")
    public void Test_Selenium33() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest--");
        EdgeDriver driver = new EdgeDriver(edgeOptions);

        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Java Script Executor

        driver.quit();
    }
}
