package org.example.petro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class petrosoft {

    @Test
    public void testpetroslogin() throws Exception{

//        System.setProperty("webdriver.chrome.driver", "C:/Users/0554/chromedriver-win64");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("incognito");

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://benzinsoftcrm.php.ymtsindia.org/");
        chromeDriver.findElement(By.id("username")).sendKeys("admin");
        chromeDriver.findElement(By.id("password")).sendKeys("testpetro");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.findElement(By.cssSelector("i[class='icon-diamond']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Master-->Fuel Product
//        chromeDriver.findElement(By.xpath("(//span[@class='title'])[2]")).click();
//        chromeDriver.findElement(By.id("liqpro_name1")).sendKeys("Gasoline");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        chromeDriver.findElement(By.id("short_name1")).sendKeys("petrol");
//        chromeDriver.findElement(By.id("vat1")).clear();
//        chromeDriver.findElement(By.id("vat1")).sendKeys("10");
//        chromeDriver.findElement(By.id("tcs1")).clear();
//        chromeDriver.findElement(By.id("tcs1")).sendKeys("15");
//        chromeDriver.findElement(By.id("lfr1")).clear();
//        WebElement dropdown = chromeDriver.findElement(By.id("gst1"));
//        Select drop = new Select(dropdown);
//        drop.selectByIndex(5);
//        chromeDriver.findElement(By.id("lfr1")).sendKeys("452");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.cssSelector("button[id='btnSubmit']")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();
////        // Product successfully Added!
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Master--> Lubricants
//        chromeDriver.findElement(By.xpath("(//a[contains(text(), 'Lubricants')])[1]")).click();
//        chromeDriver.findElement(By.id("pro_name1")).sendKeys("SERVO 20W40-10L");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        WebElement dropdown = chromeDriver.findElement(By.id("gst1"));
//        Select drop = new Select(dropdown);
//        drop.selectByIndex(5);
//        chromeDriver.findElement(By.id("hsn_code1")).clear();
//        chromeDriver.findElement(By.id("hsn_code1")).sendKeys("15");
//        chromeDriver.findElement(By.id("mrp_rate1")).clear();
//        chromeDriver.findElement(By.id("mrp_rate1")).sendKeys("250");
//        chromeDriver.findElement(By.id("sale_rate1")).sendKeys("320");
//        chromeDriver.findElement(By.id("min_quantity1")).sendKeys("15");
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Master-->Credit Customer
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.xpath("(//span[@class='title'])[3]")).click();
//
//        chromeDriver.findElement(By.id("join_dt")).click();
//        chromeDriver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
//        chromeDriver.findElement(By.xpath("(//td[@class='day'][normalize-space()='30'])[1]")).click();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.id("org_name")).sendKeys("agribusinesses");
//        chromeDriver.findElement(By.id("cust_name")).sendKeys("Agricultural Secto");
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Master-->Employee
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.xpath("(//a[contains(text(), Employees)])[27]")).click();
//        chromeDriver.findElement(By.id("join_dt1")).click();
//        chromeDriver.findElement(By.xpath("//td[@class='day'][normalize-space()='17']")).click();
//        chromeDriver.findElement(By.id("emp_name1")).sendKeys("Anwar");
//        WebElement drop = chromeDriver.findElement(By.id("designation"));
//        Select select = new Select(drop);
//        select.selectByValue("Pump Boy");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.id("salary1")).clear();
//        chromeDriver.findElement(By.id("salary1")).sendKeys("800");
//        chromeDriver.findElement(By.xpath("//input[@name='pf[0]']")).click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.xpath("//input[@name='it[0]']")).click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
////        chromeDriver.findElement(By.xpath("//input[@name='esi[0]']")).click();
//        chromeDriver.findElement(By.xpath("//input[@name='esi[0]']")).click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();

        // Master-->Expense Type
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.xpath("(//a[normalize-space()='Expense Types'])[1]")).click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.id("exp_name1")).sendKeys("WI-FI RECHARGE");
//        chromeDriver.findElement(By.xpath("(//label[@class='text-primary bold'])[2]")).click();
//        WebElement exp = chromeDriver.findElement(By.id("effect_income1"));
//        Select select = new Select(exp);
//        select.selectByVisibleText("Income");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.id("btnSubmit")).click();
////        Alert alert = chromeDriver.switchTo().alert();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Master-->Busi crd/dbt party
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.linkText("Busi. Crd/Debit Party")).click();
//        chromeDriver.findElement(By.id("join_dt")).click();
//        chromeDriver.findElement(By.xpath("(//td[@class='day'][normalize-space()='11'])[1]")).click();
//
//        WebElement ele = chromeDriver.findElement(By.id("p_type1"));
//        Select select = new Select(ele);
//        select.selectByVisibleText("Bank");
//        chromeDriver.findElement(By.id("crd_name")).sendKeys("corporation bank");
//        chromeDriver.findElement(By.id("mobile")).sendKeys("7903509779");
//        chromeDriver.findElement(By.id("email")).sendKeys("anwarweb@ymtsindia.org");
//
//        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmit"))).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Master-->Vendor
//        chromeDriver.findElement(By.xpath("//a[contains(text(),'Vendor')]")).click();
//        chromeDriver.findElement(By.id("ven_comp")).sendKeys("reliance");
//
//        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vend_type")));
//        WebElement element = chromeDriver.findElement(By.id("vend_type"));
//        Select select = new Select(element);
//        select.selectByValue("Liquids");
//        select.selectByValue("Lubricants");
//        chromeDriver.findElement(By.id("ven_phno")).sendKeys("7903509779");
//        chromeDriver.findElement(By.id("gst_no")).sendKeys("22AAAAA0000A1Z5");
//        chromeDriver.findElement(By.id("ven_eml")).sendKeys("anwarweb@ymtsindia.org");
//
//        WebDriverWait wait1 = new WebDriverWait(chromeDriver, Duration.ofSeconds(3));
//        wait1.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        // Master-->Swipes Machine

//        chromeDriver.findElement(By.xpath("//a[contains(text(),'Swipe Machines')]")).click();
//        chromeDriver.findElement(By.id("swipe_name1")).sendKeys("ONLINE TRANSFER");
//
//        chromeDriver.findElement(By.xpath("//label[@for='radip']")).click();
//        WebElement element1 = chromeDriver.findElement(By.id("sel_bank1"));
//        Select select = new Select(element1);
//        select.selectByVisibleText("corporation bank");
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();

        // Master-->Bowser Vehicle
//        chromeDriver.findElement(By.xpath("//a[contains(text(),'Bowser Vehicle')]")).click();
//        chromeDriver.findElement(By.id("tank_name")).sendKeys("TANKER 1");
//        chromeDriver.findElement(By.name("vehicle_no")).sendKeys("BR09JA8655");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tank_cap"))).sendKeys("2KL");
//        WebDriverWait wait1 = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("nozzel"))).sendKeys("N2");
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();


        // Master-->Expiry Items [Create ExpiryCategory]

//        chromeDriver.findElement(By.xpath("(//span[contains(text(),'Expiry Items')])[1]")).click();
//        chromeDriver.findElement(By.xpath("//a[contains(text(),'Create ExpiryCategory')]")).click();
//        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("itemcat_name1"))).sendKeys("STAMPING");
//        chromeDriver.findElement(By.id("btnSubmit1")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();

        // Master-->Expiry Items [Create ExpiryItems]
//        chromeDriver.findElement(By.id("insert_date")).click();
//        chromeDriver.findElement(By.xpath("//td[@data-day='10/31/2024']")).click();
//        WebElement sel = chromeDriver.findElement(By.id("cat_name1"));
//        Select select = new Select(sel);
//        select.selectByVisibleText("STAMPING");
//        chromeDriver.findElement(By.id("item_name1")).sendKeys("STAMPING");
//        chromeDriver.findElement(By.id("item_no1")).sendKeys("03");
//        chromeDriver.findElement(By.id("exp_date1")).click();
////        chromeDriver.findElement(By.xpath("//td[@data-day='10/31/2024']")).click();
//        chromeDriver.findElement(By.xpath("//td[@data-day='10/31/2024']")).click();
//        chromeDriver.findElement(By.id("alert_days1")).sendKeys("1");
//        chromeDriver.findElement(By.id("note")).sendKeys("Test Create Exp");
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();


        // Master --> Tank & Nozzle
//		// Replace "menuElement" with the WebElement representing your left side menu bar
//		WebElement menuElement = chromeDriver.findElement(By.xpath("//a[contains(text(),'Tank & Nozzel')]"));
////        // Scroll down to the left side menu bar
//        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", menuElement);
//		menuElement.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        chromeDriver.findElement(By.id("tank_name1")).sendKeys("Test Tank");
//        chromeDriver.findElement(By.id("tank_cap")).sendKeys("5000");
//        WebElement sel = chromeDriver.findElement(By.id("pro_name"));
//        Select select = new Select(sel);
//        select.selectByIndex(1);
//        chromeDriver.findElement(By.id("nozzel1")).sendKeys("Test1");
//        chromeDriver.findElement(By.id("btnSubmit")).click();
//        Alert alert = chromeDriver.switchTo().alert();
//        alert.accept();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.quit();
    }
}
