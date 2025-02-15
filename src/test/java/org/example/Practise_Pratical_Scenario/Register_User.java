package org.example.Practise_Pratical_Scenario;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Register_User {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Signup / Login")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("name")).sendKeys("Praveen");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("praveen@ymtsindia.org");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("Pr@veen018");
        WebElement drop1 = driver.findElement(By.id("days"));
        Select opt1 = new Select(drop1);
        opt1.selectByValue("17");
        Thread.sleep(2000);
        WebElement drop2 = driver.findElement(By.id("months"));
        Select opt2 = new Select(drop2);
        opt2.selectByIndex(5);
        Thread.sleep(2000);
        WebElement drop3 = driver.findElement(By.id("years"));
        Select opt3 = new Select(drop3);
        opt3.selectByValue("1996");
        Thread.sleep(2000);

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("Pradeep");
        driver.findElement(By.id("last_name")).sendKeys("Iyli");
        driver.findElement(By.id("address1")).sendKeys("Balaji Colony, Tirupati");
        WebElement drop4 = driver.findElement(By.id("country"));
        Select opt4 = new Select(drop4);
        opt4.selectByValue("India");
        Thread.sleep(3000);
        driver.findElement(By.id("state")).sendKeys("Karnataka");
        driver.findElement(By.id("city")).sendKeys("Hospet");
        driver.findElement(By.id("zipcode")).sendKeys("583203");
        driver.findElement(By.id("mobile_number")).sendKeys("9972944018");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        Thread.sleep(4000);

        driver.quit();
    }
}
