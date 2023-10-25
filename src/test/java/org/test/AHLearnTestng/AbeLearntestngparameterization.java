package org.test.AHLearnTestng;
 /*

we need to run this in testng.XML file level we cannot run this in class level


executing parameters in XML file
=================================

<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="MyTestSuite">
    <test name="ParameterizedTest">
        <parameter name="param1" value="hello" />
        <parameter name="param2" value="123" />
        <classes>
            <class name="com.example.tests.ExampleTest" />
        </classes>
    </test>
</suite>

     */

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AbeLearntestngparameterization {


    @Parameters({"param1", "param2"})
    @Test
    public void testMethod(String param1, int param2) {
        System.out.println(param1);
        System.out.println(param2);
    }

}
