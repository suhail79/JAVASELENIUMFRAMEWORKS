package org.test.AHLearnTestng;

import org.testng.annotations.Test;

public class AbdLearntestnginvocationcout {

    @Test(invocationCount = 10)
    private void MultipleRun() {
        System.out.println("Running Multiple Time");
    }
}