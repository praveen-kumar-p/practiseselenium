package org.example.Practise_Pratical_Scenario;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_select {

    public static void main(String[] args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//select[@class='form-select']"));
        Select option1 = new Select(element);
        option1.selectByIndex(4);  //price,asc
        Thread.sleep(5000);

        JavascriptExecutor javascriptExecutor = driver;
        javascriptExecutor.executeScript("window.scroll(0, 500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@name='category_id'])[1]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}