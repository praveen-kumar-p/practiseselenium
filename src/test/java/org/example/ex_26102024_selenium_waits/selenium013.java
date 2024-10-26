package org.example.ex_26102024_selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenium013 {
    @Description("Verify  makemytrip")
    @Test
    public void testVwoLoginNegative() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        // FindElement -> 1 element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        // Condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
