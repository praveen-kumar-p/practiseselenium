package org.example.ex_02112024;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class selenium22_Relative_Locators {

    @Description("Verify RL")
    @Test
    public void test_Relative_Locators() throws InterruptedException{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        // toRightOf
        //  LeftOf
        // AboveOf
        // below
        // near

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();
        Thread.sleep(5000);

        WebElement profession = driver.findElement(By.xpath("(//span[contains(text(),Profession)])[4]"));
        driver.findElement(with(By.id("profession-1")).toRightOf(profession)).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
