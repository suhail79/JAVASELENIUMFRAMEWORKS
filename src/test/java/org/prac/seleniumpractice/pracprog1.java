package org.prac.seleniumpractice;

import java.util.Map;

public class pracprog1 {
    public static void main(String[] args) {


        String name = "Suhail";
        int reverse = 0;

        char[] charArray = name.toCharArray();

        for (char c : charArray) {
            reverse++;
        }
        System.out.println(reverse);

    }
}
