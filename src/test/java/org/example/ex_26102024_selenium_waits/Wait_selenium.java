package org.example.ex_26102024_selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wait_selenium {

    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"


    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void testVwoLoginNegative() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.navigate().to("https://app.vwo.com");
        System.out.println(chromeDriver.getTitle());

        Assert.assertEquals(chromeDriver.getTitle(), "Login - VWO");
        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://app.vwo.com/#/login");

        chromeDriver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        chromeDriver.findElement(By.id("login-password")).sendKeys("password@321");
        chromeDriver.findElement(By.id("js-login-btn")).click();

        WebElement error = chromeDriver.findElement(By.xpath("//div[@class='notification-box-description']"));

        // Condition
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(error));

        wait.until(ExpectedConditions.textToBePresentInElement(error, "Your email, password, IP address or location did not match"));
//        Assert.assertEquals(error.getText(), "Your email, password, IP address or location did not match");
        Assert.assertEquals(error.getText(), "Your email, password, IP address or location did not match");

        chromeDriver.quit();
    }
}
