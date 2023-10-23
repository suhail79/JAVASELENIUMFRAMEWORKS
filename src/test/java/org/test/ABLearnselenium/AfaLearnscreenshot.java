package org.test.ABLearnselenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

import java.io.File;

public class AfaLearnscreenshot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("/Users/mohammadsuhail/IdeaProjects/Learnjavaselenium/src/test/SELENIUMLearning/abc.png");

        FileUtils.copyFile(src, dest);

    }
}