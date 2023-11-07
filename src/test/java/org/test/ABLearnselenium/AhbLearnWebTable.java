package org.test.ABLearnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AhbLearnWebTable {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/your-webpage");

        // Locate the table element using its XPath or another locator
        WebElement table = driver.findElement(By.xpath("//table[@id='yourTableId']"));

        // Find all rows within the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Iterate through the rows
        for (WebElement row : rows) {
            // Find all cells within the current row
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Iterate through the cells and print their text
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }
            System.out.println(); // Move to the next row
        }

        driver.quit();
    }
}