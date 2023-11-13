/*

Definition:-

* it is collection of similar data type.
*values are stored based on index
* index starts from 0 and ends n-1 [0-->n-1]
* it allows duplicate value
* supports both for and enhanced for loop.

Advantage:-
* In single ref we can store multiple values

Disadvantage:-
* it supports only similar data types
* memory wastage is high.


 */
package org.test.AALearnjava;

public class Ahalearn1Darray {
    public static void main(String[] args) {
        int a[] = new int[4];
        a[0] = 52;
        a[1] = 20;
        a[2] = 25;
        a[3] = 30;
/*
        for (int x : a) {
            System.out.println(x);
        }

 */


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}