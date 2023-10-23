package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcbLearnjavascriptexecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;


        // Scroll into view of an element
        WebElement element = driver.findElement(By.id("element"));
        js.executeScript("arguments[0].scrollIntoView();", element);


        //clicking an element
        WebElement element1 = driver.findElement(By.id("elementId"));
        js.executeScript("arguments[0].click();", element1);


        // Scroll down by pixel
        js.executeScript("window.scrollBy(0, 250)");

        // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Scroll into view of an element
        WebElement element2 = driver.findElement(By.id("elementId"));
        js.executeScript("arguments[0].scrollIntoView();", element2);

        //Set Attribute
        WebElement element3 = driver.findElement(By.id("elementId"));
        js.executeScript("arguments[0].setAttribute('attributeName', 'attributeValue');", element3);



    }
}
