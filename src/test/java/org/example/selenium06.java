package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium06 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
