package org.test.ACLearnjavaprograms;

public class Aaalearnreverseastring {
    public static void main(String[] args) {

        String name = "Mohammad Suhail";

        String reverse = "";

        char[] chararray = name.toCharArray();

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse = reverse + chararray[i];

            //to print letter by letter in reverse order use System.out.println(); inside the loop
            //   System.out.println(reverse);

        }
        //to print whole name in single line use System.out.println(); outside the loop

        System.out.println(reverse);
/*


        using enhanced for loop


         String name = "Suhail";
        String reverse = "";

        char[] charArray = name.toCharArray();

        for (char c : charArray) {
            reverse = c + reverse;
        }
        System.out.println(reverse);



      //  2nd Way

        String name = "Suhail";

        String result = "";

        for (int i = name.length()-1; i >= 0; i--) {

            result += name.charAt(i);
        }
        System.out.println(result);

         */


    }
}

