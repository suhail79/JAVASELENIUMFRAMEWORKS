package org.prac.seleniumpractice;

import java.util.Map;

public class pracprog1 {
    public static void main(String[] args) {

        char Grade = 'E';

        switch (Grade) {

            case 'S':
                System.out.println(">90 <100 percentage");
                break;
            case 'A':
                System.out.println(">80 <90 percentage");
                break;
            case 'B':
                System.out.println(">70 80 percentage");
                break;
            case 'C':
                System.out.println(">60 <50 percentage");
                break;
            case 'D':
                System.out.println(">40 <50 percentage");
                break;
            default:
                System.out.println("need to re appear for examination");


        }


    }
}
