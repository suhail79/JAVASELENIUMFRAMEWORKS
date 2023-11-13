/*

 *it is combination of key & value
 *key won't allow duplicate, value allows duplicate
 *supports only enhanced for loop.
 *we can use put() method to insert key & value.


Hashmap:-
==========
* prints value in Random order.
* Key Allows single Null & value allow n number of Null

Linked hashmap:-
=================
* prints value in Insertion order.
*Key Allows single Null & value allow n number of Null

TreeMap:-
=========
* prints value in Ascending order.
* Key doesn't allow Null & value allow n number of Null

Hashtable:-
===========
* prints value in Random order.
* Key & value ignores Null

 */
package org.test.AALearnjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
         if (mp.containsKey(2) & mp.containsValue("oracle")) {
            System.out.println("key & value combination present");
        } else {
            System.out.println("not ky value available");
        }
 */

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
