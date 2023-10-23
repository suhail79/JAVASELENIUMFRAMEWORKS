package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbbLearnactionsclassdragdrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        Actions a = new Actions(driver);

        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

        WebElement destinaion = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));

        a.dragAndDrop(source, destinaion).perform();

        System.out.println("program successful");
    }
}