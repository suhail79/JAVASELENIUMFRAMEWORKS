package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class practiceprogram {
    public static void main(String[] args) {
       
        WebDriver driver=new ChromeDriver();
        WebElement aa = driver.findElement(By.id("zbvcc"));

        List<WebElement> ab = aa.findElements(By.id("asghdhcx"));



    }
}