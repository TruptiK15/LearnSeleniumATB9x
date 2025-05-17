package com.testingacademy.ex22_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_ex2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement uploadfile = driver.findElement(By.id("fileToUpload"));
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        uploadfile.sendKeys(dir + "/src/test/java/com/testingacademy/demoqafile.txt");
        driver.findElement(By.name("submit")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
