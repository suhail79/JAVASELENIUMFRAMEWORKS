package org.test.AHLearnTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AcaLearntestngdataprovider {


    //attribute   [][]

    @Test(dataProvider = "Testdata")
    public void method1(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider(name = "Testdata")
    public Object[][] method1() {   //public void method1(){


        Object[][] obj = new Object[][]{
                {"username", "harish1"},
                {"password", "arun1"},
                {"username", "harish2"},
                {"password", "arun2"},
                {"username", "harish3"},
                {"password", "arun3"},
                {"username", "harish4"},
                {"password", "arun4"}
        };
        return obj;

    }


}

