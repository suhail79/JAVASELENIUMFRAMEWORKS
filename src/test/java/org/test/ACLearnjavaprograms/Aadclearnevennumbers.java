package org.test.ACLearnjavaprograms;

public class Aadclearnevennumbers {
    private void evenNumbersmethod1() {
        for (int i = 2; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    private void evenNumbersmethod2() {
        for (int i =2 ; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private void Alternateevennumbersmethod1() {
        for (int i = 2; i < 100; i += 4) {
            System.out.println(i);
        }
    }


    private void Alternateevennumbersmethod2() {
        for (int i = 2; i < 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Aadclearnevennumbers aa = new Aadclearnevennumbers();
        //aa.evenNumbersmethod1();
        aa.evenNumbersmethod2();
        //aa.Alternateevennumbersmethod1();
        //aa.Alternateevennumbersmethod2();
    }
}