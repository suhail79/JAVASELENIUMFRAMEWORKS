package org.test.AALearnjava;

/*
1.class name and method name should be same
2.we don't use return type (void) in the constructor.
3.no need to call the method using object it will automatically execute once the object is created.

two type:-

Default constructor or non-parameterized constructor

parameterized constructor

 */
public class Afalearndefaultconstructor {

    public Afalearndefaultconstructor() {
        System.out.println("this is default constructor");
        System.out.println("method2");
    }

    public static void main(String[] args) {
        Afalearndefaultconstructor a = new Afalearndefaultconstructor();
    }
}