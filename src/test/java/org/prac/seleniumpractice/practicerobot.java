package org.prac.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class practicerobot {
    public static void main(String[] args) throws AWTException {

        WebDriver driver = new ChromeDriver();

        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);


    }
}