package org.prac.seleniumpractice;

import java.util.Map;
import java.util.Scanner;

public class pracprog1 {
    public static void main(String[] args) {


        try {
            System.out.println(4 / 0);
        }
        catch (NullPointerException e) {
            System.out.println("exception catched as arithmetic");
        } finally {
            System.out.println("Handled");
        }


    }
}