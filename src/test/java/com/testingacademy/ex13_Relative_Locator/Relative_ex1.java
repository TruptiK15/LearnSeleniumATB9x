package com.testingacademy.ex13_Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relative_ex1 {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        String URL = "https://www.aqi.in/real-time-most-polluted-city-ranking";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List <WebElement> searchbox = driver.findElements(By.xpath("//input[@type='search']"));
        searchbox.get(1).sendKeys("India" + Keys.ENTER);
        Thread.sleep(2000);

        List <WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement loc : locations){

            String s1 = driver.findElement(with(By.tagName("p")).toLeftOf(loc)).getText();
            String s2 = driver.findElement(with(By.tagName("span")).toRightOf(loc)).getText();

            String displayLoc = s1 + " | " + loc.getText() + " | " + s2;
            System.out.println(displayLoc);
        }
        driver.quit();
    }
}
