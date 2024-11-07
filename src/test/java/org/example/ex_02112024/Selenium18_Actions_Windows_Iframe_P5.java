package org.example.ex_02112024;

import io.qameta.allure.Description;
import org.apache.poi.ss.formula.functions.WeekNum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class Selenium18_Actions_Windows_Iframe_P5 {

    @Description("Verify Heatmap(app.vwo.com")
    @Test
    public void test_heatmap_clickmap_button() throws InterruptedException{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        Thread.sleep(5000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindowHandle);

        List<WebElement> elements = driver.findElements(By.xpath("//img[@class='screenshot-thumb__img']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elements.get(1)).click().build().perform();

        Thread.sleep(15000);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + allHandles);

        for (String handle : allHandles) {
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);
                System.out.println("Child Window Title: " + driver.getTitle());
                driver.switchTo().frame("heatmap-iframe");
                WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']")); clickmap.click();
//                clickmap.click();
            }
        }

        driver.switchTo().window(parentWindowHandle);
//        // driver.switchTo().defaultContent();
        driver.quit();

    }
}
