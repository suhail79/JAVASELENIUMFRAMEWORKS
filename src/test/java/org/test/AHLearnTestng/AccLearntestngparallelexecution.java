package org.test.AHLearnTestng;

/*
Parallel execution at Test level
    ==================================

    <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="MyTestSuite" parallel="tests">
    <test name="Test1">
        <!-- Test1 configurations and classes -->
    </test>
    <test name="Test2">
        <!-- Test2 configurations and classes -->
    </test>
</suite>


 Parallel execution at class level
==================================

    <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="MyTestSuite">
    <test name="MyTest" parallel="classes">
        <classes>
            <class name="com.example.tests.TestClass1" />
            <class name="com.example.tests.TestClass2" />
        </classes>
    </test>
</suite>


Parallel execution at method level
==================================

<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="MyTestSuite">
    <test name="MyTest" parallel="methods" thread-count="2">
        <classes>
            <class name="com.example.tests.TestClass1" />
        </classes>
    </test>
</suite>


     */


public class AccLearntestngparallelexecution {


}
