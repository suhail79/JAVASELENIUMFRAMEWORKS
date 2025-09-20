package org.prac.seleniumpractice;

import org.apache.poi.ss.formula.atp.Switch;

public class practiceNew {

    private void method1(String Name) {
        System.out.println(Name);
    }

    private void method2(int ini) {
        System.out.println(ini);
    }

    public static void main(String[] args) {
        practiceNew a = new practiceNew();
        a.method1("Suhail");
        a.method2(12);
    }
}