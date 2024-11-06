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


public class selenium016 {

    @Test
    public void testspicejet() throws InterruptedException{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.spicejet.com/");

        WebElement source = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().build().perform();
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        Thread.sleep(5000);

        driver.quit();
    }
}
