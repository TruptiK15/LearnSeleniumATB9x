package com.testingacademy.ex07_Advance_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium19_Advance_Xpath_Axes {
    @Test
    @Description("Advance XPATH")
    public void Test_Selenium17() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/xpath/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    /* ------- XPath Axes --------- This is used in WebTables
    - In the XML documents, we have relationships between various nodes(html tags) to locate those nodes in the DOM structure.
    - Ancestor
    - Child, parent
    - Descendant
    - Following, following-sibling
    - Self.*/

        // **Self**
        // div[@class="Mammal"]
        WebElement self = driver.findElement(By.xpath("//div[@class='Mammal']"));
        System.out.println("Self: " + self.getText());

        // **Parent**
        // div[@class="Mammal"]
        WebElement parent = driver.findElement(By.xpath("//div[@class='Mammal']/parent::div"));
        System.out.println("Self: " + parent.getText());

        // **Ancestors**
        //div[@class="Mammal"]/ancestor::div
        WebElement ancestors = driver.findElement(By.xpath("//div[@class='Mammal']/ancestor::div"));
        System.out.println("Ancestors of Mammal: " + ancestors.getText());

        // **Following-child**
        //div[@class="Mammal"]/following-sibling::div
        WebElement following_sibling = driver.findElement(By.xpath("//div[@class='Mammal']/following-sibling::div"));
        System.out.println("Following sibling of Mammal: " + following_sibling.getText());

        // **Child**
        //div[@class="Mammal"]/child::div
        WebElement child = driver.findElement(By.xpath("//div[@class='Mammal']/child::div"));
        System.out.println("Child of Mammal: " + child.getText());

        // **preceding-sibling**
        //div[@class="Mammal"]/preceding-sibling::div
        WebElement proceding_sibling = driver.findElement(By.xpath("//div[@class='Mammal']/preceding-sibling::div"));
        System.out.println("Proceding sibling of Mammal: " + proceding_sibling.getText());

        //**descendant**
        //div[@class="Mammal"]/descendant::div
        WebElement descendent = driver.findElement(By.xpath("//div[@class='Mammal']/descendant::div"));
        System.out.println("Descendent of Mammal: " + descendent.getText());
        driver.quit();
    }
}