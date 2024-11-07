package org.example.ex_02112024;


import io.qameta.allure.Description;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenium21_Actions_P7 {

    @Description("Verify File Uploaded")
    @Test
    public void test_file_uploaded() throws InterruptedException{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.get("https://awesomeqa.com/selenium/upload.html");
//        WebElement uploadfile = driver.findElement(By.id("fileToUpload"));
//
//        String dir = System.getProperty("user.dir");
//        System.out.println(dir);
//        // /Users/0554/IdeaProjects/practisesel/src/test/java/org/example/ex_02112024/Hello.txt
//        uploadfile.sendKeys(dir+"/src/test/java/org/example/ex_02112024/Hello.txt");
//        driver.findElement(By.name("submit")).click();

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(chromeDriver);

        WebElement from = chromeDriver.findElement(By.id("column-a"));
        Thread.sleep(3000);
        WebElement to = chromeDriver.findElement(By.id("column-b"));
        Thread.sleep(3000);

        actions.dragAndDrop(from,to).perform();

//        actions.clickAndHold(from).moveToElement(to).release(to).build().perform();

        chromeDriver.quit();

    }
}
