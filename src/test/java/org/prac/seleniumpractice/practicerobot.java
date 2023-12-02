package org.prac.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class practicerobot {
    public static void main(String[] args) {

        String name = "AaBbCcDDeeeffghiiiiiiillll";

        char[] charArray = name.toCharArray();

        Map<Character, Integer> mp = new HashMap<>();

        for (char x : charArray) {
            char c = Character.toLowerCase(x);
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        System.out.println(name + mp);
        Set<Map.Entry<Character, Integer>> entries = mp.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() >= 1) {
                System.out.println("number of " + entry.getKey() + " values are:- " + entry.getValue());
            }

        }
    }
}