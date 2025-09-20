package org.test.ABLearnselenium;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AiaLearnSynchronizationWaits {

/*

Waits are essential because web applications can be dynamic, and the elements on a page
may not be immediately available, causing synchronization issues between
the automation script and the web page's loading or rendering process.

1.element unavailability
2.takes time to load page
3.Asynchronous behaviour



 */



    /*
Implicit wait and explicit wait are two different techniques used in test automation to handle synchronization issues when working with web applications.
They both serve the purpose of waiting for certain conditions to be met before proceeding with further test steps, but they work in slightly different ways:

1. Implicit Wait:

   - Implicit wait is a global setting applied to the WebDriver instance for the entire duration of the test script.
   - It is defined once and affects all the elements located by the WebDriver throughout the script.
   - The implicit wait instructs the WebDriver to wait for a certain amount of time (defined in seconds) when trying to locate an element.
   If the element is found before the specified timeout, the WebDriver proceeds immediately; otherwise, it waits until the element becomes available or the timeout expires.
   - It is generally used to set a default timeout for all elements, reducing the need for explicit waits in most cases.
   - It is not very flexible because it waits for the same amount of time for all elements, which can lead to unnecessary delays.



WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://example.com");
WebElement element = driver.findElement(By.id("someElementId"));


2. Explicit Wait: it allows us to command webdriver to wait until several conditions are met.

elementToBeClickable();
elementToBeSelectable();
presenceOfElementLocated();
textToBePresentInElement();
alertIsPresent();

   - Explicit wait is a more fine-grained approach to waiting, allowing you to wait for specific conditions to be met for a particular element.
   - It is defined on a per-element basis or for a specific action.
   - Explicit wait involves specifying a certain condition (e.g., element visibility, presence, clickability) and a maximum timeout.
   The WebDriver will repeatedly check the condition until it's true or the timeout expires.
   - It provides better control and flexibility as you can set different timeouts and conditions for different elements or actions, making it more efficient and responsive.
   - WebDriverWait and ExpectedConditions are commonly used classes in conjunction with explicit waits.

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebDriverWait wait = new WebDriverWait(driver, 30); // 30 seconds timeout

         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));

     */

    /*

    3.Fluent Wait:

    Fluent Wait is a more advanced and flexible way of implementing explicit waits in Selenium WebDriver.
    It allows you to wait for a certain condition to be met with a custom polling frequency,
    while also ignoring specific exceptions during the wait. Fluent Wait is particularly
    useful when you need to wait for an element to meet certain conditions
    before taking further actions in your test script.

   You can also configure it to ignore specific exceptions, if necessary.

      Wait<WebDriver> wait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
    .pollingEvery(Duration.ofSeconds(5)) // Polling interval
    .ignoring(NoSuchElementException.class); // Exception(s) to ignore



1. Implicit Wait:

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


2.Explicit Wait:

WebDriverWait wait = new WebDriverWait(driver, 30);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));


3.Fluent Wait:

Wait<WebDriver> wait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
    .pollingEvery(Duration.ofSeconds(5)) // Polling interval
    .ignoring(NoSuchElementException.class); // Exception(s) to ignore



     */



}