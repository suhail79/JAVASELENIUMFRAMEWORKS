package org.test.AALearnjava;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*

 *key & value combination
 *key doesn't allow duplicate
 *value allows duplicate

 *only allows enhanced for loop

 */
public class Aiclearncollectionmap {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(1, "java");
        mp.put(3, "python");
        mp.put(2, "sele");
        mp.put(4, "oracle");

        Set<Map.Entry<Integer, String>> entries = mp.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


/*
        System.out.println(mp.keySet());

        System.out.println(mp.values());

        System.out.println(mp.containsKey(4));

        System.out.println(mp.containsValue("python"));

        System.out.println(mp.get(2));


          Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);

 */

    }
}
