package Tests;

import PageObject.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LambdaTest {

    @Test
    public void Searchtest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        SearchPage searchPage= new SearchPage(driver);

        SearchPage.enterProductname("iphone");
        SearchPage.clickSubmit();

//        driver.quit();
    }
    @Test
    public void ScreenshotTest(){

    }
    @Test
    public void SearchFilterTest(){

    }
    @Test
    public void InvalidTest(){

    }
}
