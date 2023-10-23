package org.test.AGLearnjunit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class Aadlearnjunitcore {

    @Test
    public void report() {

        Result result = JUnitCore.runClasses(Aablearnjunitsample.class, Aaalearnjunitannotations.class);

        System.out.println("Run count" + result.getRunCount());
        System.out.println("get Ignore count" + result.getIgnoreCount());
        System.out.println("get failure count" + result.getFailureCount());

        int passcount = result.getRunCount() - result.getFailureCount();

        System.out.println("pass count" + passcount);

        List<Failure> failures = result.getFailures();

        for (Failure f : failures) {
            System.out.println(f);
        }


    }


}
