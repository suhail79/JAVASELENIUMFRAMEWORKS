package org.prac.seleniumpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pracprog1 {
    public static void main(String[] args) {

        String name = "INDIA";
        String unique = "";

        char[] charArray = name.toCharArray();

        for (char c : charArray) {
            if (name.indexOf(c)==name.lastIndexOf(c)) {
                unique += c;
            }
        }
        System.out.println(unique);

    }
}