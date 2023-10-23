package org.prac.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class launchURL {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/login/");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("suhail");

        driver.findElement(By.id("pass")).sendKeys("password");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("loginbutton")).click();


    }
}
