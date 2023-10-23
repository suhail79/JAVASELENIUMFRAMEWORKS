package org.test.AHLearnTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AbbLearntestnghardassert {


    @Test
    public void testMethod1() {
        int actualValue1 = 10;
        int expectedValue1 = 10;
        Assert.assertEquals(actualValue1, expectedValue1, "Test method1 values are expected to be equal");
        System.out.println("Test method1 values are expected to be equal");
    }

    @Test(enabled = false)
    public void testMethod2() {
        int actualValue2 = 10;
        int expectedValue2 = 20;
        Assert.assertEquals(actualValue2, expectedValue2, "Test method2 values are not equal");
        System.out.println("Test method2 values are not equal");
    }


    @Test
    public void testMethod3() {
        boolean condition1 = true;
        Assert.assertTrue(condition1, "condition1 value is true");
        System.out.println("condition1 value is true");

    }


    @Test
    public void testMethod4() {
        boolean condition2 = false;
        Assert.assertFalse(condition2, "The condition2 value is false");
        System.out.println("The condition2 value is false");
    }

    @Test
    public void testMethod5() {
        Object obj1 = null;
        Assert.assertNull(obj1, "obj value is Null");
        System.out.println("obj value is Null");
    }


    @Test
    public void testMethod6() {
        Object obj2 = new Object();
        Assert.assertNotNull(obj2, "Object should not be null");
        System.out.println("Object should not be null");
    }
}