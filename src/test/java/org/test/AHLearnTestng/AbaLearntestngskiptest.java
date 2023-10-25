package org.test.AHLearnTestng;

import org.testng.annotations.Test;

/*

for skipping any test we need to use enabled=false attribute

 */


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
