package org.test.AHLearnTestng;

import org.testng.annotations.Test;

/*

Executing this Groups in XML file
================================
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <test name="smoketest">
        <groups>

            <run>
                <exclude name="smoke"></exclude>
               // we can only use any one at a time include or exclude
                <include name="regression"></include>
            </run>

        </groups>
        <classes>
            <class name="org.test.AHLearnTestng.AcbLearntestngGroups">
            </class>
        </classes>
    </test>
</suite>


 */
public class AcbLearntestngGroups {

    @Test(groups = "smoke")
    public void testMethod1() {
        System.out.println("this defines testmethod1");
    }

    @Test(groups = "regression")
    public void testMethod2() {
        System.out.println("this defines testmethod2");
    }

    @Test(groups = {"smoke", "regression"})
    public void testMethod3() {
        System.out.println("this defines testmethod3");
    }

    @Test(groups = "other")
    public void testMethod4() {
        System.out.println("this defines testmethod4");
    }


}
