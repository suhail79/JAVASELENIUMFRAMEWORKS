package org.test.ACLearnjavaprograms;

public class Aabalearnreverseastring {
    public static void main(String[] args) {

        String name = "i love my country";
        String[] words = name.split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for (String word : words) {
            reverse.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(reverse.toString().trim());
    }
}