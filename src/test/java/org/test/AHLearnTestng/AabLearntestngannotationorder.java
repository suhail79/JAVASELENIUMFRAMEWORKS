package org.test.AHLearnTestng;

import org.testng.annotations.*;

public class AabLearntestngannotationorder {
    @BeforeSuite
    private void Beforesuite() {
        System.out.println("This is Before Suite");
    }

    @BeforeTest
    private void BeforeTest() {
        System.out.println("This is Before test");
    }

    @BeforeClass
    private void Beforeclass() {
        System.out.println("This is Before class");
    }

    @BeforeGroups
    private void BeforeGroup() {
        System.out.println("this is before group");
    }

    @BeforeMethod
    private void Beforemethod() {
        System.out.println("This is before method");
    }

    @Test
    private void test1() {
        System.out.println("this is test method method 1");
    }

    @Test(enabled = false)
    private void test2() {
        System.out.println("this is test method method 2");
    }

    @AfterMethod
    private void Aftermethod() {
        System.out.println("This is After method");
    }

    @AfterGroups
    private void AfterGroup() {
        System.out.println("this is After group");
    }

    @AfterClass
    private void AfterClass() {
        System.out.println("This is After class");
    }

    @AfterTest
    private void AfterTest() {
        System.out.println("This is AFter test");
    }

    @AfterSuite
    private void AfterSuite() {
        System.out.println("This is After Suite");
    }

}
