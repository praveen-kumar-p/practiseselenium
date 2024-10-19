package org.example.petrosoft;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class petrosoft {

    @Test
    public void testpetroslogin() throws Exception{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("incognito");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://benzinsoftcrm.php.ymtsindia.org/");
        chromeDriver.findElement(By.id("username")).sendKeys("admin");
        chromeDriver.findElement(By.id("password")).sendKeys("testpetro");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.quit();
    }
}
