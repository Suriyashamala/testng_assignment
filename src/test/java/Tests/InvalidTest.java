package Tests;

import PageObject.InvalidPage;
import PageObject.SearchPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class InvalidTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        InvalidPage invalidPage = new InvalidPage(driver);

        InvalidPage.entertext("SSXYZ1102");

        InvalidPage.clickSubmit();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("InvalidPage.png");
        try {
            FileUtils.copyFile(screenshotFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // driver.quit();

    }
}
