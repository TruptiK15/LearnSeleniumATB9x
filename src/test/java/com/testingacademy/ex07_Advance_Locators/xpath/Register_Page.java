package com.testingacademy.ex07_Advance_Locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Register_Page {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        WebElement title = driver.findElement(By.tagName("h2"));
        System.out.println(title.getText());

        WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstname.sendKeys("Trupti");

        WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.sendKeys("Kn");

        WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        address.sendKeys("Mumbai");

        WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        email.sendKeys("trupti@demo.com");

        WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
        phone.sendKeys("9090909090");

        WebElement gender = driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
        gender.click();

        WebElement hobbies = driver.findElement(By.id("checkbox2"));
        hobbies.click();

        WebElement language = driver.findElement(By.xpath("//multi-select"));
        Actions actions = new Actions(driver);
        actions.moveToElement(language).click().build().perform();

        //WebElement selectEnglish = driver.findElement(By.xpath("//multi-select/div/ul/li[normalize-space()=\"English\"]"));
        List<WebElement> allLang = driver.findElements(By.xpath("//multi-select/div/ul/li"));
        //String data = allLang.get(0).getText();

        for (WebElement selectEnglish : allLang) {
            if (selectEnglish.getText().contains("English")) {
                actions.moveToElement(selectEnglish).click().build().perform();
                System.out.println("English Selected");
                break;
            }
        }

        WebElement skills = driver.findElement(By.id("Skills"));
        Select s1 = new Select(skills);
        s1.selectByValue("APIs");

        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        WebElement searchcountry = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        searchcountry.sendKeys("India");
        searchcountry.sendKeys(Keys.ENTER);

        WebElement year = driver.findElement(By.id("yearbox"));
        Select s2 = new Select(year);
        s2.selectByValue("1996");

        WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
        Select s3 = new Select(month);
        s3.selectByValue("October");

        WebElement date = driver.findElement(By.id("daybox"));
        Select s4 = new Select(date);
        s4.selectByValue("15");

        WebElement password = driver.findElement(By.id("firstpassword"));
        password.sendKeys("Demo@123");

        WebElement confirmpass = driver.findElement(By.id("secondpassword"));
        confirmpass.sendKeys("Demo@123");

        WebElement photo = driver.findElement(By.id("imagesrc"));
        photo.sendKeys("C:/Users/amey/IdeaProjects/LearnSeleniumATB9x/src/test/java/com/testingacademy/ex07_Advance_Locators/xpath/img.png");
        Thread.sleep(3000);

        driver.findElement(By.id("submitbtn")).click();
    }
}
