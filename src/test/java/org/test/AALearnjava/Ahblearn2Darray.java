package org.test.AALearnjava;

import java.util.Scanner;

public class Ahblearn2Darray {
    public static void main(String[] args) {

        /*
        int a[][] = new int[2][3];

        a[0][0] = 45;
        a[0][1] = 98;
        a[0][2] = 53;

        a[1][0] = 62;
        a[1][1] = 21;
        a[1][2] = 50;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i][j]);
            }
        }
        */


        int a[][] = new int[3][4];

        a[0][0] = 20;
        a[0][1] = 21;
        a[0][2] = 22;
        a[0][3] = 23;

        a[1][0] = 30;
        a[1][1] = 31;
        a[1][2] = 32;
        a[1][3] = 33;

        a[2][0] = 40;
        a[2][1] = 41;
        a[2][2] = 42;
        a[2][3] = 43;

        for (int[] i : a) {
            for (int j : i) {
                System.out.println(j);
            }
        }

/*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "]=" + a[i][j]);
            }
        }

 */



/*
        int[][] b = {{1, 2, 3}, {4, 5, 6}};

        for (int[] x : b) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }

 */


        //Using Scanner Class

        int k[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vaues here:- ");
        for (int i = 0; i < a.length; i++) {
            k[i] = sc.nextInt();
        }

        System.out.println("values are:- ");
        for (int l : k) {
            System.out.println(l);
        }


    }
}

