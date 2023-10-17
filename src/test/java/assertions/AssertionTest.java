package assertions;

import PageObject.InvalidPage;
import PageObject.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertionTest {
    WebDriver driver;
    SearchPage searchPage;


    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        searchPage = new SearchPage(driver);
    }

    @Test
    public void SearchTest() {
        SearchPage.enterProductname("iphone");
        SearchPage.clickSubmit();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

//      Assert.assertEquals(driver.getCurrentUrl(), "https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=iphone",
//                "Url Not matched!!!");

        Assert.assertNotEquals(driver.getCurrentUrl(),"https://ecommerce-playground.lambdatest.io/",
                "Url Not matched!!!");

    }
    @Test
    public void SearchTest2() {
        SearchPage.enterProductname("camera");
        SearchPage.clickSubmit();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("logged"), "Url missmatching!");

//      Assert.assertEquals(driver.getCurrentUrl(), "https://ecommerce-playground.lambdatest.io/",
//                "Url Not matched!!!");

//        Assert.assertNotEquals(driver.getCurrentUrl(),"https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=camera",
//                "Url Not matched!!!");
//
//
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}