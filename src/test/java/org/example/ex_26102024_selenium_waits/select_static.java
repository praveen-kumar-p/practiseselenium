package org.example.ex_26102024_selenium_waits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_static {
    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element_select= driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
//        select.selectByVisibleText("Option 2");
        select.selectByIndex(2);







    }
}
