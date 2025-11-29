package org.prac.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));


        Wait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);


    }
}