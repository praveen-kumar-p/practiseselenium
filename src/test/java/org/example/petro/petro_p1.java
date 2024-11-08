package org.example.petro;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class petro_p1 {

    @Description("Verify page down happens")
    @Test
    public void test_Page_Down() throws InterruptedException{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("incognito");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://benzinsoftcrm.php.ymtsindia.org/");
        chromeDriver.findElement(By.id("username")).sendKeys("admin");
        chromeDriver.findElement(By.id("password")).sendKeys("testpetro");

        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);

        Actions actions = new Actions(chromeDriver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        Thread.sleep(8000);

        chromeDriver.quit();
    }
}
