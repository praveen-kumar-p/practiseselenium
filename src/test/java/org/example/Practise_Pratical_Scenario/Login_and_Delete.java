package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_and_Delete {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Signup / Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("praveen@ymtsindia.org");
        driver.findElement(By.name("password")).sendKeys("Pr@veen018");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        driver.quit();

    }
}
