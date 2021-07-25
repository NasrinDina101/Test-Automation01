package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends TestBase {
    public static void main(String[] args) {
        FirefoxLaunch();
        TC_001_Valid();
        TC_002_InValid();
        FirefoxClose();
    }
    public static void TC_001_Valid(){
        //Step1
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("user1010@gmail.com");

        //Step2
        WebElement Password=driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        //Step3
        WebElement LoginBtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginBtn.click();

        //Logic Develop
        //Logic Pass
        String Exp_Titles="My Account";
        String Acl_Titles= driver.getTitle();
        if(Exp_Titles.equals(Acl_Titles)){
            System.out.println("Test Passed for Valid Data");
            WebElement Logout=driver.findElement(By.linkText("Logout"));
            Logout.click();
        }
        else {
            System.out.println("Test Failed for Valid Data.Yahoo.Bug Found!!");
        }




    }
    public static void TC_002_InValid() {
        //Step1
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("user1010@gmail");

        //Step2
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        //Step3
        WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginBtn.click();

        //Step4
        String Exp_Titles="My Account";
        String Acl_Titles= driver.getTitle();
        if(!Exp_Titles.equals(Acl_Titles)){
            System.out.println("Test Passed for InValid Data");

        }
        else {
            System.out.println("Test Failed for InValid Data.Yahoo.Bug Found!!");
            WebElement Logout=driver.findElement(By.linkText("Logout"));
            Logout.click();
        }

    }
}
