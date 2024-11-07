package org.example.ex_02112024;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class selenium23_Relative_Locators_P2 {

    @Description("Verify RL")
    @Test
    public void test_Relative_Locators() throws InterruptedException{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");

        // toRightOf
        //  LeftOf
        // AboveOf
        // below
        // near
        WebElement city = driver.findElement(By.id("search_city"));
        city.sendKeys("India" + Keys.ENTER);

        Thread.sleep(5000);

        driver.quit();

    }
}