package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_Test_cases_page {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//i[@class='fa fa-list'])[1]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
