package com.testingacademy.ex24_Data_Driven_Testing_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_ex1 {

    @DataProvider(name = "LoginData", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass404"}
        };
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String email, String password) {
        System.out.println(email + " | " + password);
    }
}