package Frames;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class iFrameCSS extends TestBase {
    public static void main(String[] args) {
        FirefoxLaunch();
        OpenTestURL("https://www.w3schools.com/html/html_iframe.asp");
        CSSClick();

        };
    public static void CSSClick(){
        WebElement iFrame=driver.findElement(By.xpath("/html/body/div[4]/div/div/a[3]"));
        driver.switchTo().frame(iFrame);

        WebElement CSS=driver.findElement(By.xpath("/html/body/div[4]/div/div/a[4]"));
        CSS.click();


    }

    }


