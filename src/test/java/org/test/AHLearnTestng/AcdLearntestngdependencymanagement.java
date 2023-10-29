package org.test.AHLearnTestng;

  /*

Dependencies Management
=======================

If method1 gets failed then it won't execute rest of the methods
 */


import org.testng.annotations.Test;

public class AcdLearntestngdependencymanagement {


    @Test
    public void Method1() {
        System.out.println("this is method1");
    }


    @Test(dependsOnMethods = "Method1")
    public void Method2() {
        System.out.println("this is method2");
    }


    @Test(dependsOnMethods = "Method2")
    public void Method3() {
        System.out.println("this is method3");
    }

}
