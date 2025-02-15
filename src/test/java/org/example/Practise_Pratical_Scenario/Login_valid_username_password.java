package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Login_valid_username_password {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("reg_email")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("Pr@veen018");
        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
