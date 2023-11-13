package org.test.AALearnjava;

/*

• Try – contains error message.
• Catch – contains solution for the error.
• Finally – prints the output in both cases (error and no error).
• Throw – handle only one exception which is mentioned inside method.
• Throws – handles multiple exceptions which is mentioned in the method level.



    combination:-
    ---------------
    Try,catch-->we can resolve the issue
    Try,catch,finally--->we can resolve the issue
    Try,finally--->we cannot resolve the issue

     */
public class AkblearnExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println(4 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled");
        } finally {
            System.out.println("Done");
        }
    }
}