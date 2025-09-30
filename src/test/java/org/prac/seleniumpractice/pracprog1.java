package org.prac.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class pracprog1 {

    public static void main(String[] args) {

        String str1=new String("Hello");
        String str2=new String("Hello");
        String str3="Hello";
        String str4="Hello";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str3 == str1);
        System.out.println(str1.equals(str2));

    }
}