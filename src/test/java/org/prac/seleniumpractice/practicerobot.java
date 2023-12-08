package org.prac.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class practicerobot {
    public static void main(String[] args) {
        String name = "kls";
        System.out.println(name);
        String replace = name.replace('s', 'm');
        System.out.println(replace);
        String s = name.replaceAll("kls", "slk");
        System.out.println(s);
    }
}