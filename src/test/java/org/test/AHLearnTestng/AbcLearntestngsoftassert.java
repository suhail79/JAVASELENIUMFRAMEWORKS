package org.test.AHLearnTestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*

if we are using Soft Assert in testng then if  one soft assert scenario gets failed
then all other lines will get executed in the same test it will be not considered as failed.

 */
public class AbcLearntestngsoftassert {

    @Test
    private void softAssert1() {
        SoftAssert s1 = new SoftAssert();
        int actualValue1 = 10;
        int expectedValue1 = 10;
        s1.assertEquals(actualValue1, expectedValue1, "soft assert values are expected to be equal");
        System.out.println("Test method1 values are expected to be equal");
    }

    //This soft Assert will still execute the next line of condition even the Assert condition get's failed
    @Test
    public void testMethod2() {
        SoftAssert s2 = new SoftAssert();
        int actualValue2 = 10;
        int expectedValue2 = 20;
        s2.assertEquals(actualValue2, expectedValue2, "soft assert values are expected to be Not equal");
        System.out.println("Test method2 values are not equal");
    }

    @Test
    public void testMethod3() {
        SoftAssert s3 = new SoftAssert();
        boolean condition1 = true;
        s3.assertTrue(condition1, "condition1 value is true");
        System.out.println("condition1 value is true");

    }


    @Test
    public void testMethod4() {
        SoftAssert s4 = new SoftAssert();
        boolean condition2 = false;
        s4.assertFalse(condition2, "condition2 value is false");
        System.out.println("condition2 value is false");

        s4.assertAll();

    }

    @Test
    public void testMethod5() {
        SoftAssert s5 = new SoftAssert();
        s5.assertAll();
    }


}
