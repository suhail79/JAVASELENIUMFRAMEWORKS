package org.test.ACLearnjavaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Aahlearnnumberofduplicatewordspresentinstring {

    public static void main(String[] args) {

        String sentence = "This is a simple sentence with duplicate words. This sentence has some duplicate words.";

        sentence = sentence.toLowerCase();

        String[] words = sentence.split("\\s+");


        Map<String, Integer> mp = new HashMap<>();


        for (String s : words) {
            if (mp.containsKey(s)) {
                mp.put(s, mp.get(s) + 1);
            } else {
                mp.put(s, 1);
            }
        }

        System.out.println("Duplicate words and their counts:");
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}