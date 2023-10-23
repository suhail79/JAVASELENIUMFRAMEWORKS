package org.test.ABLearnselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdcLearnpromptalert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //confirm alert

        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();

        Alert promptalert = driver.switchTo().alert();

        promptalert.sendKeys("my name is suhail");

        Thread.sleep(5000);

        promptalert.accept();

    }
}
