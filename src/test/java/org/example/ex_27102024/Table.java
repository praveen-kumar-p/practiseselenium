package org.example.ex_27102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {

    @Description("Verify web Table")
    @Test
    public void test_web_tables() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/webtable.html");

        // Row - //table[@id='customers']/tbody/tr
        // Column - //table[@id='customers']/tbody/tr[2]/td

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(column);

        // //table[@id='customers']/tbody/tr[5]/td[2]

        String first = "//table[@id='customers']/tbody/tr[";
        String second = "]/td[";
        String third = "]";

        for (int i=2; i<=row; i++){
            for (int j=1; j<= column; j++){
                String dynamic_xpath = first + i + second + j + third;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);
                if (data.contains("Helen Bennett")){

                    // This will give siblings
                    String country_path = dynamic_xpath+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("Helen Bennett is In - " + country_text);
                    System.out.println("------");

                    // This will give preceding siblings

                    String country_company = dynamic_xpath+"/preceding-sibling::td";
                    String company_text = driver.findElement(By.xpath(country_company)).getText();
                    System.out.println("Helen Bennett is Company - " + company_text);
                }
            }
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
