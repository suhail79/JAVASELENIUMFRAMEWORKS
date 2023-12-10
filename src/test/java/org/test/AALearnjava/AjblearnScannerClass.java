package org.test.AALearnjava;

import java.util.Scanner;

public class AjblearnScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:-");

        String name = sc.nextLine();
        System.out.println(name);

        char c = sc.next().charAt(3);

        System.out.println("3rd index character present is " + c);

        System.out.println("Enter your Aadhar Number:-");

        long Aadhar = sc.nextLong();
        System.out.println("your Adhar number is " + Aadhar);

        System.out.println("Enter your age:-");

        int age = sc.nextInt();
        System.out.println("your Age is " + age);


    }
}
