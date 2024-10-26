package org.example.ex_26102024_selenium_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium014 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // RADIO Box
        driver.findElement(By.id("sex-1")).click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();
    }
}
