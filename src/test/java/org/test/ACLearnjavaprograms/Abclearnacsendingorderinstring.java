package org.test.ACLearnjavaprograms;

public class Abclearnacsendingorderinstring {
    public static void main(String[] args) {
        String name = "Suhail";

        String input = name.toLowerCase();

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);


    }
}
