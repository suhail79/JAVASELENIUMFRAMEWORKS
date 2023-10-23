package org.test.AELearnBaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {
    public static void main(String[] args) {
        Baseclass b = new Baseclass();


        WebDriver driver = b.launchbrowser();
        b.maximizewindow();
        b.launchURL("https://www.facebook.com/login/");
        b.implicitwait(20l);
        WebElement username = driver.findElement(By.id("email"));
        b.username(username, "mohammad");

        WebElement psswd = driver.findElement(By.id("pass"));
        b.username(psswd, "suhail");


        WebElement login = driver.findElement(By.id("loginbutton"));
        b.loginclick(login);

/*
        b.Alert().accept();

        WebElement val = driver.findElement(By.xpath("value"));
        b.selectoption(val, 1);

 */

    }
}
