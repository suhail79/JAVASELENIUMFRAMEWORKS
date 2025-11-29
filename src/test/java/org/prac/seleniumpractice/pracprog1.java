package org.prac.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class pracprog1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        List<WebElement> menus = driver.findElements(
                By.xpath("//a[@class='nav-a  ']"));

        for (WebElement menu : menus) {
            String oldUrl = driver.getCurrentUrl();
            String menuText = menu.getText();
            System.out.println("Clicking: " + menuText);
            menu.click();

            String newUrl = driver.getCurrentUrl();
            if (!oldUrl.equals(newUrl)) {
                System.out.println("✔ " + menuText + " redirected correctly → " + newUrl);
            } else {
                System.out.println("✘ " + menuText + " did NOT redirect.");
            }

            driver.navigate().back();
        }
    }
}