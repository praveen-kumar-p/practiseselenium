package org.example.seleniumpractise;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium01 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
