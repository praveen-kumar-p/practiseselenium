package org.example.ex_27102024;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class orangeHRM {

    @Description("Verify web Table")
    @Test
    public void test_web_tables() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("(//div[@class='oxd-input-group__label-wrapper'])[1]")).sendKeys("Admin");
//        driver.findElement(By.xpath("(//div[@class='oxd-input-group__label-wrapper'])[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("(//div[@class='oxd-input-group__label-wrapper'])[2]")).sendKeys("admin123");
        driver.findElement(By.xpath(" //button[contains(text(),Login)]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),Admin)])[1]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
