package org.prac.seleniumpractice;

import org.apache.poi.ss.formula.atp.Switch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class pracprog1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}