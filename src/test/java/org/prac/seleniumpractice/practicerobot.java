package org.prac.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class practicerobot {

    public static void main(String[] args) {
        practiceforinterview1 aa = new practiceforinterview1();
        aa.setName("Apple");
        aa.setAge(10);
        aa.setPhone(1111111111l);

        practiceforinterview1 ab = new practiceforinterview1();
        ab.setName("Banana");
        ab.setAge(20);
        ab.setPhone(2222222222l);

        practiceforinterview1 ac = new practiceforinterview1();
        ac.setName("Mango");
        ac.setAge(30);
        ac.setPhone(3333333333l);

        List<practiceforinterview1> li = new ArrayList<>();
        li.add(aa);
        li.add(ab);
        li.add(ac);

        for (practiceforinterview1 x : li) {
            System.out.println(x.getName());
            System.out.println(x.getAge());
            System.out.println(x.getPhone());
        }


    }


}