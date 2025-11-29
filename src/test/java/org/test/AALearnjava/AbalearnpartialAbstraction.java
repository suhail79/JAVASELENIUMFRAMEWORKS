package org.test.AALearnjava;


/*
Abstraction==Hiding implement details

Two types
1.partial abstraction--it has both abstract & non-abstract method
(declaring abstract in the class level using extends keyword)

2.fully abstraction--it is 100% abstraction it has only abstract method
( declaring interface in the class level using implements keyword)


I used abstraction by Creating abstract reusable classes/methods like BasePage,
where common logic is provided.

Step definitions call only high-level methods like:

selectReasonForCancellation()

validateRefundSummaryPopup()


 */


public abstract class AbalearnpartialAbstraction {

    public void Earth() {
        System.out.println("people lives in earth");
    }

    public abstract void Moon();

    public abstract void Sun();


}
