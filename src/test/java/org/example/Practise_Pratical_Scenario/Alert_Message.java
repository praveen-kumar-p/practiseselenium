package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Alert_Message {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qa-practice.netlify.app/");
        driver.manage().window().maximize();

        // Handle Alert message
        Thread.sleep(3000);
//        driver.findElement(By.id("alerts")).click();
//        driver.findElement(By.id("alert-btn")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        Thread.sleep(5000);

        // Handle double click
        driver.findElement(By.id("actions")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("double-click")).click();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.id("double-click-btn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(ele).perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
