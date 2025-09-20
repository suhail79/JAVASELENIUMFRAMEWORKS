package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AaaLearnlaunchURL {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/login/");

        WebElement usrnm = driver.findElement(By.id("email"));

        usrnm.sendKeys("mohammadsuhail");

        WebElement pass = driver.findElement(By.id("pass"));

        pass.sendKeys("suhailpassword");

        driver.findElement(By.id("loginbutton")).click();

        System.out.println("program done");

        driver.close();

    }
}