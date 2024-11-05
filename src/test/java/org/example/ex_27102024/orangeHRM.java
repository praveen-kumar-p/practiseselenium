package org.example.ex_27102024;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class orangeHRM {

    @Description("Verify web Table")
    @Test
    public void test_web_tables() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hacker@4321");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//                //div[contains(@class, 'oxd-table-cell')][6] --> Which HR is Terminated

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),PIM)])[2]"))).click();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        int row = driver.findElements(By.xpath("(//div[@role='row'])[9]")).size();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        int column = driver.findElements(By.xpath("((//div[@role='row'])[9]/div)[6]")).size();
//
//        System.out.println(row);
//        System.out.println(column);
//
//        driver.findElement(By.xpath("((//div[@role='row'])[9]/div)[6]")).click();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.quit();
    }
}
