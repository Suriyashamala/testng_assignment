package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidPage {

    static WebDriver ldriver;
    private static final By ENTERTEXT = By.xpath("(//input[@placeholder='Search For Products'])[1]");
    private static final By SUBMIT = By.xpath("//button[@type='submit']");

    public InvalidPage(WebDriver rdriver)
    {
        ldriver = rdriver;
    }
    public static void entertext(String entertext){
        ldriver.findElement(ENTERTEXT).sendKeys(entertext);
    }
    public static void clickSubmit() {
        ldriver.findElement(SUBMIT).click();
    }
}