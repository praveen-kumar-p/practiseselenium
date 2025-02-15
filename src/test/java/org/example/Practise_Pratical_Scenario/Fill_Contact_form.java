package org.example.Practise_Pratical_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_Contact_form {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pradeep");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Pradeep@ymtsindia.org");
        driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Testing");
        driver.findElement(By.id("message")).sendKeys("Testing");
        WebElement fileinput = driver.findElement(By.xpath("//input[@name='upload_file']"));
        String imagepath = "C://Users//0554//Pictures//Screenshots";
        fileinput.sendKeys(imagepath);
        fileinput.click();
        Thread.sleep(4000);

    }
}
