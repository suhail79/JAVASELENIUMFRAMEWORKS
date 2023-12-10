package org.test.AALearnjava;
/*

    Types of Variables
    -------------------

    1.Local Variables
    2.Instance / Global Variable
    3.Static Variable
    4.Final Variable

        1.Local Variables

*Used only inside the methods or block
* can't use access specifiers for this type
*we need to initialize local variable

========================================================================

     2.Instance / Global Variable

*it is declared inside the class and outside the methods
*we can use access modifiers for this type
*it has default value as below

    private int number;      // Default value is 0
    private boolean flag;    // Default value is false
    private String text;     // Default value is null

========================================================================

     3.Static Variable

*static variable retains value between object
*if we specify method as static we don't need to create object for calling the method,
we can access as below

static variables--->classname.variable name || variable name

Static method----->classname.method name ||method name

========================================================================

      4.Final Variable

*If a class is declared as final then we cannot inherit the class

*If a method is declared as final then we cannot override the method

*If a variable is declared as final then we cannot change the value assigned.

     */

import org.prac.seleniumpractice.practicerobot;

public class AjalearnTypesofVariables {

    //instance Variable
    public int a = 10;

    private void method1() {

        //Local Variable (b)
        int b = 23;
        System.out.println(b);

    }

    public static void main(String[] args) {
        AjalearnTypesofVariables x = new AjalearnTypesofVariables();
        x.method1();
        System.out.println(x.a);
    }
}