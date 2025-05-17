package com.testingacademy.ex19_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Actions_ex3_MakemyTrip {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        Thread.sleep(2000);

        WebElement fromCity = driver.findElement(By.id("fromCity"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("BOM").build().perform();
        Thread.sleep(3000);

        List<WebElement> listautocomplete = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for (WebElement e : listautocomplete){
           if (e.getText().contains("Mumbai")){
               e.click();
               System.out.println("Successfully Selected Mumbai");
               break;
           }
        }
        driver.quit();
    }
}
