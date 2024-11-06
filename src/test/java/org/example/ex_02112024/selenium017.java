package org.example.ex_02112024;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenium017 {

    @Test
    public void testaction() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // Wait until the element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        WebElement fromCity = driver.findElement(By.id("fromCity"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("del").build().perform();

//        List<WebElement> list_auto = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
//        for (WebElement e : list_auto){
//            if (e.getText().contains("New Delhi")){
//                e.click();
//                break;
//            }
//        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();


        Thread.sleep(5000);
        driver.quit();

    }
}
