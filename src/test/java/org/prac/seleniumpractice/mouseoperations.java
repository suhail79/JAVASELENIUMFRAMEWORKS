package org.prac.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoperations {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("");

        Actions a = new Actions(driver);

        a.contextClick().perform();
        a.doubleClick().perform();

        WebElement moveelementtarget = driver.findElement(By.id("sjdhcgvcghj"));

        a.moveToElement(moveelementtarget).perform();

        WebElement srcdrag = driver.findElement(By.xpath("sjdhfgchvhgvch"));

        WebElement targetdrop = driver.findElement(By.xpath("ahjdgfgcvcg"));

        a.dragAndDrop(srcdrag, targetdrop).perform();

    }
}
