package org.test.ACLearnjavaprograms;

public class Aadalearnconsecutivenumber {
    public static void main(String[] args) {
        int[] x = {4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 1, 2, 3, 4, 5, 7};

        int prev = x[0];

        for (int current : x) {
            if (current != prev + 1) {
                // The sequence is broken; print the consecutive numbers found
                System.out.println("Consecutive numbers: " + prev);
            }
            prev = current;
        }

        // Handle the last element separately as it doesn't have a next element to compare
        System.out.println("Consecutive numbers: " + x[x.length - 1]);
    }
}