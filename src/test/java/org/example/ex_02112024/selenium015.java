package org.example.ex_02112024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class selenium015 {

    @Test
    public void test_Action(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname, "pradeep kumar p")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
