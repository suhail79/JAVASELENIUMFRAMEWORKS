package org.test.AALearnjava;

public class AaalearnEncapsulation {

    /*
    Notes below

   * Wrapping up of data (variables & methods) in single unit (class) is called Encapsulation.

   *combining methods & variables in single place

   *restricting the scope of methods & variables by using access modifiers (public & private)

     */


    private String name;
    private int roll;
    private char initial;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public char getInitial() {
        return initial;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }
}