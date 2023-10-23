package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AgaLearnwindowsHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //first home page of the amazon site saved as parent window
        String parentwindow = driver.getWindowHandle();

        // find element for search cases & send keys to search product
        driver.findElement(By.xpath
                ("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 14 pro max");


        //click the search button

        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();


        Set<String> childwindow = driver.getWindowHandles();

        for (String newwindow : childwindow) {
            driver.switchTo().window(newwindow);
        }
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

        Thread.sleep(5000);

        //  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));

        //  Thread.sleep(5000);

        driver.switchTo().window(parentwindow);


    }
}
