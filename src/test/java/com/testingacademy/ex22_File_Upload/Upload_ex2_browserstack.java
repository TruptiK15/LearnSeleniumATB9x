package com.testingacademy.ex22_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Upload_ex2_browserstack {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.manage().window().maximize();

        WebElement click_login = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
        click_login.click();
        Thread.sleep(5000);

        WebElement user_name = driver.findElement(By.xpath("//input[@id=\"user_email_login\"]"));
        user_name.sendKeys("trupti@gmail.com");

        Thread.sleep(2000);

        WebElement give_password = driver.findElement(By.xpath("//input[@id=\"user_password\"]"));
        give_password.sendKeys("test@111");
        Thread.sleep(2000);

        WebElement sign_in = driver.findElement(By.xpath("//input[@id=\"user_submit\"]"));
        sign_in.click();
        Thread.sleep(2000);

        driver.navigate().to("https://app-automate.browserstack.com/dashboard/v2/getting-started");
        Thread.sleep(3000);

        WebElement uploadbtn = driver.findElement(By.xpath("//span[normalize-space()='UPLOAD APP']"));
        uploadbtn.click();

        //C:\Users\amey\IdeaProjects\LearnSeleniumATB9x\src\test\java\com\testingacademy\ex22_File_Upload\example.apk
        String dir = System.getProperty("user.dir");
        uploadbtn.sendKeys(dir + "/src/test/java/com/testingacademy/ex22_File_Upload/example.apk");
        Thread.sleep(3000);

        //driver.quit();
    }
}
