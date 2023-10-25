package org.test.AHLearnTestng;


/*
This invocation count attribute is used to run the same test multiple times

 */


import org.testng.annotations.Test;

public class AbdLearntestnginvocationcout {

    @Test(invocationCount = 10)
    private void MultipleRun() {
        System.out.println("Running Multiple Time");
    }
}