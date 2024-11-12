package org.example.project1;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class flipkart {

    @Description("Search iphone 14")
    @Test
    public void test_flipkart_search() throws InterruptedException{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("iphone 14");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
        Thread.sleep(3000);


        driver.quit();
    }
}
