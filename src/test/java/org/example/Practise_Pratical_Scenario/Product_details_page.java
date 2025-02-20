package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Product_details_page {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='card-img-wrapper'])[1]")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//h1[@data-test='product-name']"));
        System.out.println(element.getText());
        Assert.assertEquals("Combination Pliers", "Combination Pliers");
        Thread.sleep(6000);
        driver.quit();
    }
}
