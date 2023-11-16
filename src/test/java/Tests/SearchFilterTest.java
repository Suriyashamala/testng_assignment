package Tests;

import PageObject.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class SearchFilterTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        SearchPage searchPage= new SearchPage(driver);

        SearchPage.enterProductname("iphone");
        SearchPage.clickSubmit();

        SearchPage.clickFilter("tablets");
        SearchPage.clickSearch();
//
        Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='iPhone']"))
                .getText(),"tablets","no tablets");


//        driver.quit();
    }
}
