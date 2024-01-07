package org.prac.seleniumpractice;

public class pracprog2 extends pracprog1 {
    @Override
    public void Method1() {
        System.out.println("suhail changed");
    }

    @Override
    public void Method2() {
        System.out.println("mohammad changed");
    }

    public static void main(String[] args) {
        pracprog2 p = new pracprog2();
        p.Method1();
        p.Method2();
    }

}