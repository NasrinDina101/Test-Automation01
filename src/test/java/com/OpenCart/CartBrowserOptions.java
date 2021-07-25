package com.OpenCart;

import com.Base.TestBase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CartBrowserOptions extends TestBase {
    public static void main(String[] args) {
        FirefoxLaunch();
        Registration();
        ValidRegistration();

    }

    public static void Registration() {
        driver.get("https://demo.opencart.com/");
    }

    public static void ValidRegistration() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");

        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("ertyujkmnbvfrujmgfdsaq");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("rtyuioplkmnbvcxsdf");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("user1010@gmail.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("1234567898765");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("123456");

        WebElement Checkbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));
        System.out.println(Checkbox.isSelected());
        Checkbox.click();

        driver.navigate().to("https://demo.opencart.com/");


    }


}
