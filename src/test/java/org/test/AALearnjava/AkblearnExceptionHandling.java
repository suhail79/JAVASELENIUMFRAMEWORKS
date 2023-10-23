package org.test.AALearnjava;

/*
   Try
   Catch
   Finally

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
            System.out.println("handled");
        } finally {
            System.out.println("Done");
        }
    }
}