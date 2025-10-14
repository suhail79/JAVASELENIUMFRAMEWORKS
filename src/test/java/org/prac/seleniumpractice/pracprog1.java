package org.prac.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class pracprog1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://cosmocode.io/automation-practice-webtable/");

        WebElement Table = driver.findElement(By.xpath("//table[@id='countries']"));

        List<WebElement> tr = Table.findElements(By.tagName("tr"));

        for (WebElement row : tr) {

            List<WebElement> td = row.findElements(By.tagName("td"));

            if (td.isEmpty()) {
                continue;
            }

            String text0 = td.get(0).getText();
            String text1 = td.get(1).getText();
            String text2 = td.get(2).getText();
            String text3 = td.get(3).getText();
            String text4 = td.get(4).getText();

            System.out.println(text0);
            System.out.println("Country: " + text1 + ", " + "Capital: " + text2);
            System.out.println("Currency: " + text3);
            System.out.println("Language: " + text4);

        }
        driver.quit();
    }
}