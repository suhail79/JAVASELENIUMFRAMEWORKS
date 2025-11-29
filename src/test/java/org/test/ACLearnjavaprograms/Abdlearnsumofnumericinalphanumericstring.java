package org.test.ACLearnjavaprograms;
public class Abdlearnsumofnumericinalphanumericstring {
    public static void main(String[] args) {

        // 16. sum of numeric Value in alphanumeric string

        //   input="ab12cd34ef5678";
        //    output=12+34+5678=5724

        String input = "ab12cd34ef5678";

        int sum = 0;
        String temp = "";

        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                temp += c;
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}


// Abelearnsortagivenstring