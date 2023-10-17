package Tests;

import PageObject.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        SearchPage searchPage= new SearchPage(driver);

        SearchPage.enterProductname("iphone");
        SearchPage.clickSubmit();

//        driver.quit();
    }
}
