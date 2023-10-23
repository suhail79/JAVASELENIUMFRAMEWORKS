package org.test.AHLearnTestng;

import org.testng.annotations.Test;

public class AbaLearntestngskiptest {


    @Test
    private void test1() {
        System.out.println("this is test method method 1");
    }

    @Test(enabled = false)
    private void test2() {
        System.out.println("this is test method is ignored");
    }

}
