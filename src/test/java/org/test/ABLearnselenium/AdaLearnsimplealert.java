package org.test.ABLearnselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
ALerts are nothing but handling popup notifications

types:-

*simple alert:-contains only ok button
*confirm alert:-contains ok & cancel button
*prompt alert:-contains text field, Ok & cancel button

 */
public class AdaLearnsimplealert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //simple alert

        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();

        Thread.sleep(5000);

        Alert simplealert = driver.switchTo().alert();

        simplealert.accept();
    }
}
