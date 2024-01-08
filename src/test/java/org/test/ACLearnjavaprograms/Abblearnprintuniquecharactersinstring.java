package org.test.ACLearnjavaprograms;

public class Abblearnprintuniquecharactersinstring {
    public static void main(String[] args) {
        //method 1
        String name = "india";
        String unique = "";
        char[] charArray = name.toCharArray();
        for (char c : charArray) {
            if (name.indexOf(c) == name.lastIndexOf(c)) {
                unique += c;
            }
        }
        System.out.println(unique);

        //method 2

        String name1 = "india";
        String unique1 = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name1.charAt(i);
            if (name.indexOf(c) == name.lastIndexOf(c)) {
                unique1 += c;
            }
        }
        System.out.println(unique1);


    }
}
