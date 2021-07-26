package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends TestBase {
    public static void main(String[] args){
        FirefoxLaunch();
        Invalid_Registration();
        //FirefoxClose();
    }
    public static void Invalid_Registration() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");

        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("ertyujkmnbvfrujmgfdsaqwercxzasdfopkjh");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("rtyuioplkmnbvcxsdfgtrewqazjmnhgfdcx");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("user1010@gmail");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("123456789876543212345678987654321234");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("1234rtyhnbvf789jhg56edf");

        WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));
        Confirm_Password.sendKeys("1234rtyhnbvf789jhg56edf");

        WebElement Checkbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));
        System.out.println(Checkbox.isSelected());
        Checkbox.click();


        WebElement ClickContinue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        ClickContinue.click();
        //FirstNameValidation

        String Exp_FName_ValidationMessage="First Name must be between 1 and 32 characters!";
        String Acl_FName_ValidationMessage=driver.findElement(By.cssSelector("div.has-error:nth-child(3) > div:nth-child(2) > div:nth-child(2)")).getText();

        if(Exp_FName_ValidationMessage.equals(Acl_FName_ValidationMessage))
        {
            System.out.println("First Name Validation Test Passed");
        }
        else{
            System.out.println("Test Failed for First Name.Yahoo.Bug Found!!");
        }
        //LastNameValidation
        String Exp_LNameValidationMessage="Last Name must be between 1 and 32 characters!";
        String Acl_LNameValidationMessage=driver.findElement(By.cssSelector("div.has-error:nth-child(3) > div:nth-child(2) > div:nth-child(2)")).getText();

        if(Exp_LNameValidationMessage.equals(Acl_LNameValidationMessage))
        {
            System.out.println("Last Name Validation Test Passed");
        }
        else{
            System.out.println("Test Failed for Last Name.Yahoo.Bug Found!!");
        }
        //EmailValidation
        String Exp_EmailValidationMessage="E-Mail Address does not appear to be valid!";
        String Acl_EmailValidationMessage=driver.findElement(By.cssSelector("div.form-group:nth-child(5) > div:nth-child(2) > div:nth-child(2)")).getText();

        if(Exp_EmailValidationMessage.equals(Acl_EmailValidationMessage))
        {
            System.out.println("Email Validation Test Passed");
        }
        else{
            System.out.println("Test Failed for Email.Yahoo.Bug Found!!");
        }
        //TelephoneValidation
        String Exp_PhoneValidationMessage="Telephone must be between 3 and 32 characters!";
        String Acl_PhoneValidationMessage=driver.findElement(By.cssSelector("div.form-group:nth-child(6) > div:nth-child(2) > div:nth-child(2)")).getText();

        if(Exp_PhoneValidationMessage.equals(Acl_PhoneValidationMessage))
        {
            System.out.println("TelePhone Validation Test Passed");
        }
        else{
            System.out.println("Test Failed for Telephone.Yahoo.Bug Found!!");
        }
        //passwordValidation
        String Exp_PasswordValidationMessage="Password must be between 4 and 20 characters!";
        String Acl_PasswordValidationMessage=driver.findElement(By.cssSelector("div.has-error:nth-child(2) > div:nth-child(2) > div:nth-child(2)")).getText();

        if(Exp_PasswordValidationMessage.equals(Acl_PasswordValidationMessage))
        {
            System.out.println("Password Validation Test Passed");
        }
        else{
            System.out.println("Test Failed for Password.Yahoo.Bug Found!!");
        }



    }



}


