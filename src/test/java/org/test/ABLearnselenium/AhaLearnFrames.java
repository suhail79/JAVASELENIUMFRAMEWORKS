package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AhaLearnFrames {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://ui.vision/demo/webtest/frames/");


        List<WebElement> frame = driver.findElements(By.tagName("frame"));

        int size = frame.size();
        System.out.println(size);

        // WebDriver frame1 = driver.switchTo().frame("//*[@id=\"id2\"]/div/input");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input"));
        driver.switchTo().frame(element);
        //element.sendKeys("suhail");


    }
}