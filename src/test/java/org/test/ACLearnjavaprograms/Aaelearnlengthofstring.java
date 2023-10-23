package org.test.ACLearnjavaprograms;

public class Aaelearnlengthofstring {
    public static void main(String[] args) {

        String name = "Mohammad Suhail";

        int measure = 0;

        char[] charArray = name.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
            measure++;

        }
        System.out.println(measure);
    }
}