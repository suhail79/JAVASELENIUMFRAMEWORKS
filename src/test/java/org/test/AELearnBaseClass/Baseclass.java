package org.test.AELearnBaseClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Baseclass {

   public  WebDriver driver;

    //To Launch Browser

    public WebDriver launchbrowser() {

        driver = new ChromeDriver();

        return driver;

    }


    // To maximize window
    public void maximizewindow() {
        driver.manage().window().maximize();

    }


    //To Launch URL
    public void launchURL(String url) {
        driver.get(url);
    }


    //implicit waits
    public void implicitwait(long seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }


    //send keys for username
    public void username(WebElement e, String user) {

        e.sendKeys(user);

    }

    //login functionality
    public void loginclick(WebElement e) {

        e.click();

    }

    /*
    //Alert class

    public Alert Alert() {
        Alert al = driver.switchTo().alert();
        return al;
    }

    //Select class

    public void selectoption(WebElement ref, int a) {
        Select s = new Select(ref);
        s.selectByIndex(a);
    }

     */


}
