package org.test.AALearnjava;

/*
parameterized constructor where the parameters are passing through the constructor

 */

public class Afblearnparameterizedconstructor {

/*
    public Afblearnparameterizedconstructor(String name, int id, long phn) {
        System.out.println(name);
        System.out.println(id);
        System.out.println(phn);
    }

    public static void main(String[] args) {
        Afblearnparameterizedconstructor d = new Afblearnparameterizedconstructor
                ("suhail", 123, 9600875647l);
    }
 */

    public Afblearnparameterizedconstructor(String name) {
        System.out.println(name);
    }

    public Afblearnparameterizedconstructor(int id) {
        System.out.println(id);
    }

    public Afblearnparameterizedconstructor(long phn) {
        System.out.println(phn);
    }

    public Afblearnparameterizedconstructor(char initial) {
        System.out.println(initial);
    }


    public static void main(String[] args) {
        Afblearnparameterizedconstructor aa = new Afblearnparameterizedconstructor("greens");
        Afblearnparameterizedconstructor ab = new Afblearnparameterizedconstructor(24);
        Afblearnparameterizedconstructor ac = new Afblearnparameterizedconstructor(973662627l);
        Afblearnparameterizedconstructor ad = new Afblearnparameterizedconstructor('A');
    }

}
