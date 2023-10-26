package org.test.AHLearnTestng;

public class  AfaLearntestngGroups {
    /*

Groups in TestNG
=================

@Test(groups = "smoke")
    public void testMethod1() {
        // Test code
    }

    @Test(groups = "regression")
    public void testMethod2() {
        // Test code
    }

    @Test(groups = { "smoke", "regression" })
    public void testMethod3() {
        // Test code
    }

    @Test(groups = "other")
    public void testMethod4() {
        // Test code
    }


Executing this Groups in XML file
================================

<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="MyTestSuite">
    <test name="SmokeTests">
        <groups>
            <run>
                <include name="smoke" />
                <exclude name="other" />
            </run>
        </groups>
        <classes>
            <class name="com.example.tests.ExampleTest" />
        </classes>
    </test>

    <test name="RegressionTests">
        <groups>
            <run>
                <include name="regression" />
                 <exclude name="other" />
            </run>
        </groups>
        <classes>
            <class name="com.example.tests.ExampleTest" />
        </classes>
    </test>
</suite>


     */
}
