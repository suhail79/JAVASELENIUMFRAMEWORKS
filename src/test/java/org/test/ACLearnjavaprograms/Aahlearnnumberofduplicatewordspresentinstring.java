package org.test.ACLearnjavaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Aahlearnnumberofduplicatewordspresentinstring {

    public static void main(String[] args) {

        /*
        String str = "The Java is a best JavA language then the python LANGUAGE";

        String[] split = str.split(" ");

        Map<String, Integer> mp = new HashMap<>();

        for (String s : split) {
            if (mp.containsKey(s)) {
                mp.put(s.toLowerCase(), mp.get(s) + 1);
            } else {
                mp.put(s, 1);
            }
        }

        Set<String> strings = mp.keySet();
        for (String word : strings) {
            if (mp.get(word) > 1) {
                System.out.println(word + ":" + mp.get(word));
            }
        }

         */

        // when the fullstop is given in the program


        String name = "This is a sample sentence. This is another sentence";

        Pattern pattern = Pattern.compile("\\p{Punct}");

        String[] split = name.split(" ");

        Map<String, Integer> mp = new HashMap<>();

        for (String a : split) {
            // Remove punctuation and convert to lowercase
            String cleanedWord = a.replaceAll("\\p{Punct}", "").toLowerCase();

            if (mp.containsKey(cleanedWord)) {
                mp.put(cleanedWord, mp.get(cleanedWord) + 1);
            } else {
                mp.put(cleanedWord, 1);
            }
        }

        Set<String> str = mp.keySet();
        for (String x : str) {
            System.out.println(x + ":" + mp.get(x));
        }


    }


}
