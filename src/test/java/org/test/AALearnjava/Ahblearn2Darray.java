package org.test.AALearnjava;

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

/*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "]=" + a[i][j]);
            }
        }

 */


        for (int[] x : a) {
            for (int y : x) {
                System.out.println(y);
            }
        }


    }
}

