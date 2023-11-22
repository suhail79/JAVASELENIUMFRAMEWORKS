package org.test.ACLearnjavaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aailearnsecondhighestcharactercountinstring {
    public static void main(String[] args) {
        String name = "HCL interview permission testing";
        char[] charArray = name.toCharArray();

        Map<Character, Integer> mp = new HashMap<>();

        for (char c : charArray) {
            if (Character.isLetter(c))
                mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        char secondHighestChar = ' ';
        int highestCount = 0;
        int secondHighestCount = 0;


        Set<Map.Entry<Character, Integer>> entries = mp.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {

            int count = entry.getValue();

            if (count > highestCount) {
                secondHighestChar = entry.getKey();
                secondHighestCount = highestCount;
                highestCount = count;
            } else if (count > secondHighestCount && count < highestCount) {
                secondHighestChar = entry.getKey();
                secondHighestCount = count;
            }
        }

        // Display the result
        System.out.println("Second highest occurring character: " + secondHighestChar);
        System.out.println("Count: " + secondHighestCount);
    }
}