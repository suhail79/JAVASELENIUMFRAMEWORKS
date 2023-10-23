package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

/*
robot class is nothing but performing keyboard actions through program
 */

public class AcaLearnrobotclass {
    public static void main(String[] args) throws AWTException {


        WebDriver driver = new ChromeDriver();
        Robot r = new Robot();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/login/");

        WebElement usrnm = driver.findElement(By.id("email"));

        usrnm.sendKeys("mohammadsuhail");

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);

        r.keyPress(KeyEvent.VK_META);
        r.keyPress(KeyEvent.VK_V);

        r.keyRelease(KeyEvent.VK_META);
        r.keyRelease(KeyEvent.VK_V);

}
}