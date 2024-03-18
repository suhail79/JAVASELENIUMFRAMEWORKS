package org.test.AALearnjava;

public class AaalearnEncapsulation {

    /*
    Notes below

   * Wrapping up of data (variables & methods) in single unit (class) is called Encapsulation.

   *combining methods & variables in single place

   *restricting the scope of methods & variables by using access modifiers (public & private)

     */
    private String name;

    private int age;

    private long phn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhn() {
        return phn;
    }

    public void setPhn(long phn) {
        this.phn = phn;
    }
}