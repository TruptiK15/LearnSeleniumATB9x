package com.testingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium14_Make_Appointment_Task {

    @Description("Make an Appointment")
    @Test
    public void test_Selenium14() throws InterruptedException {

        // 1. Login to https://katalon-demo-cura.herokuapp.com/
        // 2. Click on Make Appointment button
        // 3. Enter the Login creds and submit click
        //4. Verify the current URL == https://katalon-demo-cura.herokuapp.com/#appointment

        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        WebElement make_app_button = driver.findElement(By.id("btn-make-appointment"));
        make_app_button.click();
        Thread.sleep(3000);

        WebElement demo_username = driver.findElement(By.id("txt-username"));
        demo_username.sendKeys("John Doe");
        Thread.sleep(2000);

        WebElement demo_password = driver.findElement(By.id("txt-password"));
        demo_password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(2000);

        WebElement demo_login = driver.findElement(By.id("btn-login"));
        demo_login.click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Verify the URL
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://katalon-demo-cura.herokuapp.com/#appointment";
        if (currentURL.equals(expectedURL)){
            System.out.println("Make Appointment Page is displayed");
        }
        else{
            System.out.println("Make Appointment Page is not displayed");
        }

        Thread.sleep(2000);
        //Make Appointment
        WebElement facility_checkbox = driver.findElement(By.id("chk_hospotal_readmission"));
        facility_checkbox.click();

        WebElement medicaid_radio = driver.findElement(By.id("radio_program_medicaid"));
        medicaid_radio.click();

        WebElement visit_date = driver.findElement(By.id("txt_visit_date"));
        visit_date.sendKeys("01/01/2025");

        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("Demo comment");
        Thread.sleep(2000);

        WebElement book_appointment_button = driver.findElement(By.id("btn-book-appointment"));
        book_appointment_button.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
