package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    static WebDriver ldriver;
    private static final By PRODUCTNAME = By.xpath("(//input[@placeholder='Search For Products'])[1]");
    private static final By SUBMIT = By.xpath("//button[@type='submit']");
    private static final By FILTER = By.className("custom-select");
    private static final By FILTER_SEARCH = By.id("button-search");
    private static final By TABLETS = By.xpath("/html[1]/body[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/select[1]/option[14]");

    public SearchPage(WebDriver rdriver)
    {
        ldriver = rdriver;
    }
    public static void enterProductname(String productname) {

        ldriver.findElement(PRODUCTNAME).sendKeys(productname);
    }
    public static void clickSubmit()
    {
        ldriver.findElement(SUBMIT).click();
    }
    public static void clickFilter(String tablets){
        ldriver.findElement(FILTER).click();
        ldriver.findElement(FILTER).sendKeys(tablets);
        ldriver.findElement(TABLETS).click();
    }
    public static void clicksearch()
    {
        ldriver.findElement(FILTER_SEARCH).click();
    }

}

