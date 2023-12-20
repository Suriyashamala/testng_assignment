package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AmazonTest {

    @Test
    public  void  amazon() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");

        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.click();
        search.sendKeys("iphone");
        WebElement suggestion = driver.findElement(By.cssSelector(".left-pane-results-container >:first-child .s-suggestion-container"));
        suggestion.click();

        WebElement out_of_stock = driver.findElement(By.xpath("//li[@aria-label='Include Out of Stock']//input"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(out_of_stock).click(out_of_stock).build().perform();
//
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        List<WebElement> rows = driver.findElements(By.className("puisg-row"));
//        System.out.println("Rows count: " + rows.size());

    }
}