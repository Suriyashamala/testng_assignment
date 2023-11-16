package Tests;

import PageObject.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SearchTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        SearchPage searchPage= new SearchPage(driver);

        SearchPage.enterProductname("iphone");
        SearchPage.clickSubmit();

//        Assert.assertEquals(driver.getCurrentUrl(), "https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=iphone",
//                "Url Not matched!!!");
//
//        Assert.assertNotEquals(driver.getCurrentUrl(),"https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=iphone",
//                "Url Not matched!!!");

//        Assert.assertTrue(driver.getCurrentUrl().contains("iphone"), "Url missmatching!");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged"), "Url missmatching!");


//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.urlContains("iphone"));

        driver.quit();
    }
}
