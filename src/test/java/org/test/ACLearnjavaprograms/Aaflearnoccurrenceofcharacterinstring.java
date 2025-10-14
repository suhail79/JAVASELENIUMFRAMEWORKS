package org.test.ACLearnjavaprograms;

import java.util.HashMap;
import java.util.Map;

public class Aaflearnoccurrenceofcharacterinstring {
    public static void main(String[] args) {

        // without Case sensitive using enhanced for loop
/*
        String name = "MohammAdSuHaiL";

        char[] charArray = name.toCharArray();

        Map<Character, Integer> mp = new HashMap<Character, Integer>();

        for (char c : charArray) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        System.out.println(name + mp);
 */

        //ignoring Case sensitive using enhanced for loop


        // 9. Occurrence of characters in String

        String name = "MohammAdSuhail";

        char[] charArray = name.toCharArray();

        Map<Character, Integer> mp = new HashMap<Character, Integer>();

        for (char c : charArray) {
            char lowerCase = Character.toLowerCase(c);
            if (mp.containsKey(lowerCase)) {
                mp.put(lowerCase, mp.get(lowerCase) + 1);
            } else {
                mp.put(lowerCase, 1);
            }
        }
        System.out.println(name + mp);




//Using Normal for loop

/*
        String name = "MohammadSuhail";
        Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
        char[] charArray = name.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        //System.out.println("Character counts in '" + name + "':");
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }

 */

    }
}
