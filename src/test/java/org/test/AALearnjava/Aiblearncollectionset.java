/*
*Value based
*Doesn't allow duplicate
*supports only enhanced for loop.
*we can use add() method to add value in Set.


Hashset:-
==========
* prints value in Random order.
* Allows single Null & doesn't allow duplicate Null

Linked hashset:-
=================
* prints value in Insertion order.
* Allows single Null & doesn't allow duplicate Null


Treeset:-
=========
* prints value in Ascending order.
* doesn't allow any Null value.

 */
package org.test.AALearnjava;

import java.util.Set;
import java.util.TreeSet;

public class Aiblearncollectionset {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<Integer>();
        st.add(82);
        st.add(32);
        st.add(02);
        st.add(14);
        st.add(19);
        st.add(82);


        //  System.out.println(st);

        for (Integer x : st) {
            System.out.println(x);
        }

    }
}