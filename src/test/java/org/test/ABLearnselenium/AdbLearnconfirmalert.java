package org.test.ABLearnselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdbLearnconfirmalert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //confirm alert

        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

        Thread.sleep(5000);

        Alert confirm = driver.switchTo().alert();

        confirm.dismiss();
    }
}
