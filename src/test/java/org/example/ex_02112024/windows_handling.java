package org.example.ex_02112024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class windows_handling {

    @Description("Verify windows")
    @Test
    public void test_window_p4(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/windows");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> WindowHandles = driver.getWindowHandles();
        System.out.println("WindowHandles " + WindowHandles);

        for (String handle : WindowHandles){
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("TestCase Passed!");
                break;
            }
        }

        driver.quit();
    }
}
