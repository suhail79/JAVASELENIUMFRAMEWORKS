package org.test.AALearnjava;

import java.util.Set;
import java.util.TreeSet;



/*
Hashset, linked hashset,Treeset

*value based
*doesn't allow duplicate
*hashset--->Random order
*linked hashset---->insertion order
*Treeset--->Ascending order

*only allows enhanced for loop

 */

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