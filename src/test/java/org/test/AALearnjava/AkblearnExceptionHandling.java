package org.test.AALearnjava;

/*

• Try – contains error message.
• Catch – contains solution for the error.
• Finally – prints the output in both cases (error and no error).
• Throw – handle only one exception which is mentioned inside method.
• Throws – handles multiple exceptions which is mentioned in the method level.
. we can use multiple catch block followed by the single try block but the order matters should use parent Exception at the last.

Can you use multiple catch blocks with one try?	✅ Yes
Can you put Exception catch first?	❌ No, it must be last
Why use multiple catch blocks?	To handle different exceptions separately



    combination:-
    ---------------
    Try,catch-->we can resolve the issue
    Try,catch,finally--->we can resolve the issue
    Try,finally--->we cannot resolve the issue

     */
public class AkblearnExceptionHandling {

    public void method1() {

        try {
            throw new NullPointerException();
        } catch (NullPointerException c) {
            System.out.println("Caught NullPointerException");
        } catch (ArithmeticException b) {
            System.out.println("Caught ArithmeticException");
        } catch (Exception a) {
            System.out.println("Caught General Exception");
        }
    }

    /*
    public void method2() {

        try {
            throw new NullPointerException();
        }  catch (Exception a) {
            System.out.println("Caught General Exception");
        } catch (NullPointerException c) {
            System.out.println("Caught NullPointerException");
        } catch (ArithmeticException b) {
            System.out.println("Caught ArithmeticException");
        }
    }

//    In this method2 Exception a in the first catch block is the parent for all the exception so the exception
//    is already been caught so it will throw error in this case.



     */


    public void method3() {

        try {
            System.out.println(4 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled");
        } finally {
            System.out.println("Done");
        }
    }

    public static void main(String[] args) {
        AkblearnExceptionHandling obj = new AkblearnExceptionHandling();
        obj.method1();
        obj.method3();
        // obj.method2();
    }
}