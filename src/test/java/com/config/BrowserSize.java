package com.config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSize extends BrowserConfig{

    public static void main(String[] args) {
        FirefoxLaunch();
        Screen_PC();
        Screen_Tab();
        getScreenSize();
        FirefoxClose();
    }
        public static void FirefoxLaunch() {
            System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("Firefox Launch Successfully!!");
            driver.get("https://apple.com");
        }
        public static void getScreenSize(){
        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();
        System.out.println("Screen Width: "+width+"and Height:"+height);
        }

    public static void Screen_PC(){
        driver.manage().window().setSize(new Dimension(769,800));

    }
    public static void Screen_Tab(){
        driver.manage().window().setSize(new Dimension(768,400));

    }
}
