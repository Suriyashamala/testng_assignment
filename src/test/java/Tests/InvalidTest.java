package Tests;

import PageObject.InvalidPage;
import PageObject.SearchPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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
//        Assert.assertTrue(driver.getCurrentUrl().contains("SSXYZ1102"), "Url missmatching!");
//        Assert.assertFalse(driver.getCurrentUrl().contains("SSXYZ1102"), "Url missmatching!");

        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]"))
                        .getText(),"There is no product that matches the search criteria.",
                "not matched");

//        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]"))
//                        .getText(),"There is no product that matches the search criteria",
//                "not matched");
//

        // driver.quit();

    }
}