package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Drag_and_drop {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor javascriptExecutor = driver;
        javascriptExecutor.executeScript("window.scrollBy(0, 1000)"); // Scroll Down
//        Thread.sleep(3000);
//        javascriptExecutor.executeScript("window.scrollBy(0, -1000)");  // Scroll up
        driver.findElement(By.xpath("(//a[@class='btn btn-outline-primary me-1'])[11]")).click();
        Actions ac = new Actions(driver);
        ac.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
