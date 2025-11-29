package org.test.AALearnjava;

/*
Polymorphism means "many forms"

perform same task in many ways

polymorphism can be achieved by two types

Method OverLoading---Static Binding / Compile time polymorphism

Method Overriding---Dynamic Binding / Run time polymorphism




Method Overloading —

I have overloaded methods inside BasePage, for example:

public void click(WebElement element) { ... }
public void click(By locator) { ... }

Method Overriding —

Some page classes override parent methods for customized behavior.

Example: overriding a wait method or a click method when a dynamic element behaves differently.

 */
public class AdalearnpolymorphismMethodOverloading {


    private void emp(String Name) {
        System.out.println(Name);
    }

    private void id(int num) {

        System.out.println(num);
    }

    private void ini(char a) {

        System.out.println(a);
    }

    private void phn(long bc) {
        System.out.println(bc);
    }

    public static void main(String[] args) {
        AdalearnpolymorphismMethodOverloading obj = new AdalearnpolymorphismMethodOverloading();
        obj.emp("Suhail");
        obj.emp("Mohammad");
        obj.id(25);
        obj.ini('S');
        obj.phn(9600874569l);
    }

}
