package org.test.ACLearnjavaprograms;

public class Aablearnpalindromeinstring {
    /*

    palindrome is nothing but if we reverse a word then the output should sounds like a same

    eg:- Madam --> madam--->palindrome

         suhail-->  liahus---> not a palindrome

     */

    public static void main(String[] args) {


        String name = "Madam";

        String reverse = "";

        char[] charArray = name.toCharArray();

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + charArray[i];
        }
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        /*

        //using enhanced for loop

         String name = "madam";
        String reverse = "";

        char[] charArray = name.toCharArray();

        for (char c : charArray) {
            reverse = c + reverse;
        }if (name.equalsIgnoreCase(reverse)){
            System.out.println("given is palindrom");
        }else {
            System.out.println("not palindrome");
        }

         */

    }
}