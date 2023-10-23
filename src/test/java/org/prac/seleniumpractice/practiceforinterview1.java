package org.prac.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practiceforinterview1 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();

        //List<WebElement> elements = driver.findElements(By.xpath(""));


    }
}