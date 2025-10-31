package org.prac.seleniumpractice;

import com.google.common.base.CaseFormat;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class pracprog2 {
    public void reverseanumber() {

        int a = 12345;
        int b = 0;

        while (a != 0) {
            b = b * 10;
            b = b + a % 10;
            a = a / 10;
        }
        System.out.println(b);

    }

    public void Ascendingorder() {


        String input = "selenium";

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);

    }

    public static void main(String [] args ) {

        pracprog2 obj = new pracprog2();

        obj.reverseanumber();
        obj.Ascendingorder();

    }

}