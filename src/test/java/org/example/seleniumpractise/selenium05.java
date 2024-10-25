package org.example.seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium05 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
