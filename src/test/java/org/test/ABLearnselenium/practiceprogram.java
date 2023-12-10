package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practiceprogram {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement element1 = driver.findElement(By.id("searchDropdownBox"));
        List<WebElement> option = element1.findElements(By.tagName("option"));


        for (WebElement x : option) {

            if (x.getText().contains("Collectibles")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }


        driver.quit();


    }

}
