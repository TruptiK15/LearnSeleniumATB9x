package com.testingacademy.ex24_Data_Driven_Testing_POI;

import org.testng.annotations.Test;

public class DDT_Excel_ex1 {


    @Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void loginTestVWO(String email, String password) {
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
    }
}
