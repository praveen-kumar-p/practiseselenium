package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.xpath("(//span[.='Electronics'])[1]"));
        Actions a1 = new Actions(driver);
        a1.moveToElement(ele).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Wired Headphones")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
