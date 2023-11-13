package org.test.ACLearnjavaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aaglearnprintduplicatecharactersinstring {

    public static void duplicateString(String str) {
        if (str == null) {
            System.out.println("String is Null");
            return;
        }

        if (str.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (str.length() == 1) {
            System.out.println("Single character String");
            return;
        }

        char[] charArray = str.toCharArray();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();

        for (Character c : charArray) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = mp.entrySet();
        System.out.println("Duplicate characters in '" + str + "':");
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() >= 1) {
                System.out.println(entry.getKey() + ":-" + entry.getValue() );
            }
        }
    }

    public static void main(String[] args) {
        duplicateString("This is a sentence where the sentence repeats");
    }
}
