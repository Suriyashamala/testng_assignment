package Tests;

import PageObject.ScreenshotPage;
import PageObject.SearchPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        ScreenshotPage screenshotPage= new ScreenshotPage(driver);

        ScreenshotPage.enterProduct("canon EOS 5D");
        ScreenshotPage.clickSubmit();
        screenshotPage.clickCamera();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("Screenshot.png");
        try {
            FileUtils.copyFile(screenshotFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        driver.quit();
    }
}
