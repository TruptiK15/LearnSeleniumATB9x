package com.testingacademy.ex22_File_Upload;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Action_File_Upload {

    @Test
    @Description("Action - File Upload")
    public void Test_Selenium31() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();

        String URL = "https://awesomeqa.com/selenium/upload.html";
        driver.get(URL);
        Thread.sleep(2000);

        //File Upload
        //1. Selenium only support type = file
        //2. find the locator of file upload and use the function - sendKeys.
        //2. AutoIT - third party

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String working_dr = System.getProperty("user.dir");
        System.out.println(working_dr);

        uploadFileInput.sendKeys(working_dr + "/src/test/java/com/testingacademy/ex11_Action_Advance/Textfile.txt");
        driver.findElement(By.name("submit")).click();
        driver.quit();
    }
}
