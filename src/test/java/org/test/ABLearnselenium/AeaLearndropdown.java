package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AeaLearndropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

        WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='first']"));

        Select s1 = new Select(dropdown1);
        s1.selectByIndex(3);



        /*
        s1.selectByValue();
        s1.selectByIndex();
        s1.selectByVisibleText();
        s1.getAllSelectedOptions();   //List<WebElement>
        s1.getOptions();              //List<WebElement>
        s1.getFirstSelectedOption();   //WebElement
        s1.deselectAll();
         */

        List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();

        for (WebElement ann : allSelectedOptions) {
            System.out.println(ann.getText());
        }

        Thread.sleep(5000);

        List<WebElement> availableOptions = s1.getOptions();

        for (WebElement option : availableOptions) {
            System.out.println("first select options are:- " + option.getText());
        }


        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"animals\"]"));

        Select s2 = new Select(dropdown2);

        s2.selectByValue("big baby cat");

        List<WebElement> optionsavailable = s2.getOptions();

        for (WebElement oop : optionsavailable) {
            System.out.println("second select options are:- " + oop.getText());
        }

        System.out.println("done");

    }
}
