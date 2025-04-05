package com.testingacademy.ex09_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Practice_SVG_map_click {

    @Test
    @Description("Click on SVG Element map")
    public void Test_Selenium26() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        Thread.sleep(2000);

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path' and @aria-label]"));

        for (WebElement state : states) {

            String stateName = state.getAttribute("aria-label");
            //System.out.println(stateName);

            if (stateName.contains("Maharashtra")) {
                state.click();
                System.out.println(stateName);
            }
        }
        driver.quit();
    }
}
