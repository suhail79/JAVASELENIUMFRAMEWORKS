package org.test.AHLearnTestng;

import org.testng.annotations.*;
/*

BeforeSuite
BeforeTest
BeforeClass
BeforeMethod
Test
AfterMethod
AfterClass
AfterTest
AfterSuite

Above is the order of testng annotations will get execute

     */


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
        System.out.println("repetative before method");
    }

    @Test
    private void test1() {
        System.out.println("this is test method method 1");
    }

    @Test(enabled = true)
    private void test2() {
        System.out.println("this is test method method 2");
    }

    @AfterMethod
    private void Aftermethod() {
        System.out.println("repetative After method");
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
