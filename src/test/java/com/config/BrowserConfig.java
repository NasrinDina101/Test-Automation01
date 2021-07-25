package com.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserConfig {
    public static WebDriver driver;

    public static void main(String[] args) {
        ChromeLaunch();
        ChromeClose();
        FirefoxLaunch();
        FirefoxClose();
    }

    public static void ChromeLaunch() {
        //set chromedriver path
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome Launch Successfully!!");
        //online
        driver.get("https://google.com");

        //local host
        //driver.get("http://localhost:8080/myapplication.html");

        //offline
        //driver.get("file:///D:/Fold New");
    }

    public static void FirefoxLaunch() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        System.out.println("Firefox Launch Successfully!!");
        driver.get("https://apple.com");
    }
    public static void ChromeClose(){
        driver.close();
        //driver.Quit();
        System.out.println("Chrome Closed");
    }
    public static void FirefoxClose(){
        driver.close();
        System.out.println("Firefox Closed");
    }
}



