package com.Stepdef;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FBLogin {

    WebDriver driver;

    @Given("user try to launch facebook URL")
    public void userTryToLaunchFacebookURL() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


   /* @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("Mohammd");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("suhail");
    }

    */

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("user verifies the login functionality")
    public void userVerifiesTheLoginFunctionality() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @Then("user has to quit the browser")
    public void userHasToQuitTheBrowser() {
        driver.quit();
        System.out.println("final step is done");
    }

}
