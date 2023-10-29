package org.test.AHLearnTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Adalearntestnganalyserone {
    @Test(retryAnalyzer = Adblearntestnganalysertwo.class)
    private void methodnew() {
        Assert.assertTrue(false);
    }


}
