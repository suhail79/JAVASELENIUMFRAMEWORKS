package org.test.ACLearnjavaprograms;

public class Aaelearnlengthofstring {
    public static void main(String[] args) {



        // 8. Length of String

        String name = "Mohammad Suhail";

        int measure = 0;

        char[] charArray = name.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
            measure++;
        }
        System.out.println(measure);




        /*

        Using enhanced for loop

         String name = "suhaildjggf";
        int measure = 0;

        char[] charArray = name.toCharArray();

        for (char c : charArray) {
            measure++;
        }
        System.out.println(measure);

         */
    }
}