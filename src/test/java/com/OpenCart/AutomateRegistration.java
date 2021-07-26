package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class AutomateRegistration extends TestBase {
    public static void main(String[] args) {
        FirefoxLaunch();
        ValidRegistration();
        ValidLogin();
        TC_001_Valid();
        //FirefoxClose();
    }

    public static void ValidRegistration() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");

        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Sara");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("Islam");

        WebElement Email = driver.findElement(By.id("input-email"));
        Random RandomGenerator = new Random();
        int RandomInt = RandomGenerator.nextInt(1000);
        Email.sendKeys("user" + RandomInt + "@gmail.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("1234567890");

        WebElement Password = driver.findElement(By.id("input-password"));
        Random RandomG = new Random();
        int RandomIn = RandomG.nextInt(100);
        Password.sendKeys("123456");

        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("123456");

        WebElement Checkbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));
        System.out.println(Checkbox.isSelected());
        Checkbox.click();


        WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        Continue.click();
    }

    public static void ValidLogin() {
        String Exp_Titles = "My Account";
        String Acl_Titles = driver.getTitle();

        Exp_Titles.equals(Acl_Titles);
        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();

    }

    public static void TC_001_Valid() {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement Email = driver.findElement(By.id("input-email"));
        Random RandomGenerator = new Random();
        int RandomInt = RandomGenerator.nextInt(1000);
        Email.sendKeys("user" + RandomInt + "@gmail.com");


        WebElement Password = driver.findElement(By.id("input-password"));
        Random RandomG = new Random();
        int RandomIn = RandomG.nextInt(100);
        Password.sendKeys("123456");

        WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginBtn.click();

    }
}
