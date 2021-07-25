package com.BrowserOptions;

import com.Base.TestBase;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSL extends TestBase {
    public static void main(String[] args) {
        InsecureTest();
        FirefoxClose();
}
public static void InsecureTest(){
    System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
    FirefoxOptions frobj=new FirefoxOptions();
    frobj.setAcceptInsecureCerts(true);
    driver=new FirefoxDriver();
    driver.get("https://cacert.org/");

    String TitleAfterAccept=driver.getTitle();
    System.out.println(TitleAfterAccept);


    }
}
