/*

*Index based
*allows duplicate
*prints value in insertion order
*supports both for & enhanced for loop.
*we can use add() method to add value in list.

Types:--Array list, linked list, vector

Array List:-
=============
Best:- Retrieving & searching is easy using index value
worst:-Insertion / deletion is not easy, it makes performance issue.

linked list:-
==============
Best:-Insertion / deletion is not easy, it makes performance issue
worst:- Retrieving & searching is easy using index value

Arraylist:---             Vector:---
=============            =============
Asynchronous              synchronous
non-Threadsafe            ThreadSafe

 */
package org.test.AALearnjava;

import java.util.*;

public class Aialearncollectionlist {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(14);
        li.add(74);
        li.add(65);
        li.add(71);


        //  System.out.println(li.get(2));
        //System.out.println(li.size());
        //System.out.println(li.indexOf(10));


        
        
        
        
/*
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }


        for (Integer al : li) {
            System.out.println(al);
        }

 */


    }
}