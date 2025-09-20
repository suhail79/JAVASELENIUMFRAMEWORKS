package org.test.ACLearnjavaprograms;

public class Aadblearnoddnumbers {

    private void OddNumbersmethod1() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    private void oddNumbersmethod2() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    private void AlternateOddnumbersmethod1() {
        for (int i = 1; i < 100; i += 4) {
            System.out.println(i);
        }
    }


    private void AlternateOddnumbersmethod2() {
        for (int i = 1; i < 100; i++) {
            if (i % 4 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Aadblearnoddnumbers aa = new Aadblearnoddnumbers();
        aa.OddNumbersmethod1();
        // aa.oddNumbersmethod2();
        // aa.AlternateOddnumbersmethod1();
//        aa.AlternateOddnumbersmethod2();
    }
}
