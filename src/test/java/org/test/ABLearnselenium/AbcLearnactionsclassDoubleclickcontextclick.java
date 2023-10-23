package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AbcLearnactionsclassDoubleclickcontextclick {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        Actions a = new Actions(driver);
        Robot r = new Robot();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/login/");

        WebElement usrnm = driver.findElement(By.id("email"));

        usrnm.sendKeys("mohammadsuhail");


        a.doubleClick(usrnm).perform();
        a.contextClick(usrnm).perform();

        for (int i = 0; i <= 6; i++) {
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
        }
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);

        r.keyPress(KeyEvent.VK_META);
        r.keyPress(KeyEvent.VK_V);


        r.keyRelease(KeyEvent.VK_META);
        r.keyRelease(KeyEvent.VK_V);


        driver.findElement(By.id("loginbutton")).click();

        System.out.println("program done");


    }
}
