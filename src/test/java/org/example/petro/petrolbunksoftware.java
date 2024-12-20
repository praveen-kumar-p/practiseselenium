package org.example.petro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptException;

public class petrolbunksoftware {

    @Test
    public void test_bunk_software() throws InterruptedException{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://petrolbunksoftware.com/");

        Thread.sleep(3000);

        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Jitendra");
        Thread.sleep(4000);
//        driver.findElement(By.id("number2")).sendKeys("8179293774");
        driver.findElement(By.id("number2")).sendKeys("8179293774");
        driver.findElement(By.id("email")).sendKeys("jitendra@ymtsindia.org");
        driver.findElement(By.id("station_details")).sendKeys("Testing");
        driver.findElement(By.id("demo_form_submit")).click();
        Thread.sleep(4000);
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();

        driver.quit();

    }
}
