package com.testingacademy.ex19_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ex1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();


        WebElement firstname = driver.findElement(By.name("firstname"));
        //Keyboard Event - KeyDown + SHIFT

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)  //capital letters
                .sendKeys(firstname,"the testing academy")
                .keyUp(Keys.SHIFT).click().perform();
        
        Thread.sleep(3000);
       // driver.quit();

    }
}
