package org.test.AALearnjava;

public class Main {
    public static void main(String[] args) {
        try {
            // Some condition that triggers the custom exception
            int age = -5;

            if (age < 0) {
                throw new CustomException("Age cannot be negative");
            }

            // Rest of the code if the condition is not violated
            System.out.println("Age is: " + age);

        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("CustomException: " + e.getMessage());
        }
    }

}
