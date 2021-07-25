package com.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public static void main(String[] args) {
        ChromeLaunch();
        ChromeClose();
        FirefoxLaunch();
        FirefoxClose();
    }

    public static void ChromeLaunch() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Chrome Launch Successfully!!");
    }

    public static void FirefoxLaunch() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        System.out.println("Firefox Launch Successfully!!");
    }

    public static void ChromeClose() {
        driver.close();
        System.out.println("Chrome Closed");
    }

    public static void FirefoxClose() {
        driver.close();
        System.out.println("Firefox Closed");
    }

    public static void OpenTestURL(String URL) {
        driver.get(URL);

    }

    public static WebElement elementByCSS(String locator) {
        return driver.findElement(By.cssSelector(locator));

    }

    public static WebElement elementByXpath(String locator) {
        return driver.findElement(By.xpath(locator));

    }

    public static WebElement elementByID(String locator) {
        return driver.findElement(By.id(locator));

    }

    public static WebElement elementByName(String locator) {
        return driver.findElement(By.name(locator));

    }

    public static void getElementByCSSandClick(String locator) {
        driver.findElement(By.cssSelector(locator)).click();

    }
    public static void getElementByCSSandType(String locator,String text) {
        driver.findElement(By.cssSelector(locator)).sendKeys(text);

    }
    public static void AlertAccept() {
        driver.switchTo().alert().accept();

    }
    public static void AlertCancel() {
        driver.switchTo().alert().dismiss();

    }


}
