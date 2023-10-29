package org.test.AHLearnTestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Adblearntestnganalysertwo implements IRetryAnalyzer {

    int min = 0, max = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (min < max) {
            min++;
            return true;
        }
        return false;
    }
}
