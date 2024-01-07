package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*

Actions class is used to perform mouse Actions

*Mouse Hover operation
*Drag & Drop
*Double click
*context click--right click

 */

public class AbaLearnactionsclassmousehoveroperation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        Actions a = new Actions(driver);

        driver.get("http://www.greenstechnologys.com/index.html");

        //Mouse Hover operation where the cursor is moving to the 1st Web Element
        WebElement courses = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));

        a.moveToElement(courses).perform();

        //Mouse Hover operation where the cursor is moving to the 2nd Web Element
        WebElement DataScience = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[11]/a"));

        a.moveToElement(DataScience).perform();

        //find xpath and click the destination webelement

        WebElement clickelement = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[11]/ul/li[3]/a"));

        clickelement.click();


    }
}