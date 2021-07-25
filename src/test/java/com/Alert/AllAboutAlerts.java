package com.Alert;

import com.Base.TestBase;



public class AllAboutAlerts extends TestBase {
    public static void main(String[] args) {
        FirefoxLaunch();
        OpenTestURL("https://the-internet.herokuapp.com/javascript_alerts");
        NormalAlert();
        ConfirmAlert();
        PromptAlert();
        FirefoxClose();
        };

    public static void NormalAlert(){
      //WebElement norAltBtn=driver.findElement(By.cssSelector(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)"));
      //WebElement norAltBtn2 = elementByCSS(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)");
      //norAltBtn2.click();

        getElementByCSSandClick(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)");
      //driver.switchTo().alert().accept();
        AlertAccept();
    }
    public static void ConfirmAlert(){
        getElementByCSSandClick(".example > ul:nth-child(3) > li:nth-child(2) > button:nth-child(1)");
        AlertCancel();
    }
    public static void PromptAlert(){
        getElementByCSSandClick(".example > ul:nth-child(3) > li:nth-child(3) > button:nth-child(1)");
        driver.switchTo().alert().sendKeys("Test Automation Rockzzzzz");
        AlertAccept();

    }
}
