package com.Stepdef;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Adactlogin {

    WebDriver driver;

    @Given("User launch the URl")
    public void userLaunchTheURl() {
        driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /*@When("once launched user enters the username")
    public void onceLaunchedUserEntersTheUsername() {
        driver.findElement(By.id("username")).sendKeys("suhail79");
    }

    @When("User enters the password")
    public void userEntersThePassword() {
        driver.findElement(By.id("password")).sendKeys("T9R4N3");
    }
     */

    @When("once launched user enters the {string}")
    public void onceLaunchedUserEntersThe(String string1) {
        driver.findElement(By.id("username")).sendKeys(string1);
    }

    @When("User enters the {string}")
    public void userEntersThe(String string2) {
        driver.findElement(By.id("password")).sendKeys(string2);
    }

    @When("user try to maximize the window")
    public void userTryToMaximizeTheWindow() {
        driver.manage().window().maximize();
    }

    @When("User try to click the login button")
    public void userTryToClickTheLoginButton() {
        driver.findElement(By.id("login")).click();
    }

    @Then("user verifies the login functionality successful")
    public void userVerifiesTheLoginFunctionalitySuccessful() {
        driver.getCurrentUrl();
        driver.getTitle();
        System.out.println("Final step is done");
    }

  /*  @Then("user has to click logout after some time")
    public void userHasToClickLogoutAfterSomeTime() throws InterruptedException {
        // Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
    }


    @Then("user has to quit the browser")
    public void userHasToQuitTheBrowser() {
        driver.quit();
    }
*/
}
