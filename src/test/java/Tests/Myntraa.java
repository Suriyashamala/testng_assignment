package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Myntraa {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.myntra.com/");
        WebElement Women =driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
        Actions action=new Actions(driver);
        action.moveToElement(Women).build().perform();


        WebElement suggestion = driver.findElement(By.xpath("//a[contains(text(),'Sarees')]"));
        suggestion.click();


    }
}