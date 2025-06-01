package com.testingacademy.ex22_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Upload_ex3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement uploadfile = driver.findElement(By.id("file-upload"));
        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        //upload the file
        uploadfile.sendKeys(dir + "/src/test/java/com/testingacademy/ex22_File_Upload/demoqafile.txt");

        //click on Submit
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);

        WebElement title = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
        String success = title.getText();
        Assert.assertEquals(success,"File Uploaded!");
        System.out.println("Successful File Upload...");
        Thread.sleep(3000);
        driver.quit();
    }
}
