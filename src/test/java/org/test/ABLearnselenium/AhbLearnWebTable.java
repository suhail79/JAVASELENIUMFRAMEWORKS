package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AhbLearnWebTable {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

// METHOD 1

        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

        // Locate the table element using its XPath

        WebElement element = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']"));
        List<WebElement> row = element.findElements(By.tagName("tr"));

        for (WebElement data : row) {
            List<WebElement> td = data.findElements(By.tagName("td"));
            if (td.isEmpty()) {
                continue;
            }
            String FirstName = td.get(0).getText();
            String LastName = td.get(1).getText();
            String Age = td.get(2).getText();
            String Email = td.get(3).getText();
            String Salary = td.get(4).getText();
            String Department = td.get(5).getText();

            System.out.println("Name:- " + FirstName + " " + LastName);
            System.out.println("Age:- " + Age);
            System.out.println("email:- " + Email);
            System.out.println("Salary:-" + Salary);
            System.out.println("Department:- " + Department);
            System.out.println();
        }

        driver.quit();

        //**************************************************

        // METHOD 2
/*
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");


        List<WebElement> element1 = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr"));

        for (WebElement e : element1) {

            List<WebElement> col = e.findElements(By.tagName("td"));

    String FirstName = col.get(0).getText();
    String LastName = col.get(1).getText();
    String Age = col.get(2).getText();
    String email = col.get(3).getText();
    String Salary = col.get(4).getText();
    String Department = col.get(5).getText();

    System.out.println(FirstName+" "+LastName);
    System.out.println(Age);
    System.out.println(email);
    System.out.println(Salary);
    System.out.println(Department);
    System.out.println();

        }

 */


    }
}