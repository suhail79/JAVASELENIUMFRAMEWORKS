package org.test.ACLearnjavaprograms;

public class AaealearnToUpperCasestring {

    public static void main(String[] args) {

        String name = "Suhail";
        String upper = "";

        char[] charArray = name.toCharArray();

        for (char c : charArray) {
            upper += Character.toUpperCase(c);
        }

        System.out.println(upper);
    }


}
