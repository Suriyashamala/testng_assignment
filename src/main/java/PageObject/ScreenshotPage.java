package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScreenshotPage {
    static WebDriver ldriver;
    private static final By PRODUCT = By.xpath("//input[@placeholder='Search For Products'][1]");
    private static final By SUBMIT = By.xpath("//button[@type='submit']");
    private static final By CAMERA = By.xpath("//img[@title='Canon EOS 5D']");

    public ScreenshotPage(WebDriver rdriver) {
        ldriver = rdriver;
    }
    public static void enterProduct(String product) {

        ldriver.findElement(PRODUCT).sendKeys(product);
    }
    public static void clickSubmit() {
        ldriver.findElement(SUBMIT).click();
    }

    public void clickCamera() {
        ldriver.findElement(CAMERA).click();
    }
}

