package com.Screenshot;

import com.Base.TestBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class PageScreenshot extends TestBase {
    public static void main(String[] args) {
        FirefoxLaunch();
        OpenTestURL("https://demo.opencart.com/");
        generateScreenshot();
        FirefoxClose();

    }
    public static void generateScreenshot() throws IOException {
        //Take Screenshot
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Save Image
        FileUtils .copyFile(srcFile.new File("./src/test/Screenshot/pageImage.png"),true);


    }

}
