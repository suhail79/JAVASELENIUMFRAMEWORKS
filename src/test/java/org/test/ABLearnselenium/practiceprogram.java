package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class practiceprogram {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-11/12/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng&cmp=SEM|D|DF|G|Generic|Generic-Generic_DT|DF_Generic_Exact|RSA|Offer3|673438880783");
        WebElement element = driver.findElement(By.xpath("//p[@class='boldFont blackText airlineName']"));

        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        List<WebElement> elements = element.findElements(By.xpath("//p[@class='fliCode']"));
        for (WebElement x : elements) {
            System.out.println(x.getText());
        }
        driver.quit();
    }
}