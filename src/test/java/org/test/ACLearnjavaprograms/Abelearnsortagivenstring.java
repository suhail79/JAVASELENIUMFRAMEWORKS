package org.test.ACLearnjavaprograms;

import java.util.Arrays;

public class Abelearnsortagivenstring {
    public static void main(String[] args) {


        // 17. sort a given String

        String input = "automationtesting";

        char[] charArray = input.toCharArray();

        Arrays.sort(charArray);

        String sorted = new String(charArray);

        System.out.println(sorted);


        // 17. sort a given String & remove duplicate alphabets

        String input1 = "automationtesting";

        char[] arr = input1.toCharArray();
        Arrays.sort(arr);

        String result = "";
        char previous = 0;

        for (char c : arr) {
            if (c != previous) {
                result += c;
                previous = c;
            }
        }
        System.out.println(result);
    }
}
