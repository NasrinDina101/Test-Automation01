package com.Navigation;

import com.Base.TestBase;

public class NavigationTest extends TestBase {
    public static void main(String[] args) {
        FirefoxLaunch();
        OpenTestURL("https://demo.opencart.com/");
        NavigateTo();
        NavigateBack();
        NavigateForward();
    }
    public static void NavigateTo(){
        driver.navigate().to("https://google.com");
        System.out.println("Navigate To:"+ driver.getTitle());

    }
    public static void NavigateBack(){
        driver.navigate().back();
        System.out.println("Navigate Back To:"+ driver.getTitle());
    }
    public static void NavigateForward(){
        driver.navigate().forward();
        System.out.println("Navigate Forward:"+ driver.getTitle());

    }
    public static void NavigateRefresh(){
        driver.navigate().refresh();

    }


}
