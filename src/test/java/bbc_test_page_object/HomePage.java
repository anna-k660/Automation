package bbc_test_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class='orb-nav-newsdotcom']")
    private WebElement newsPage;

    @FindBy(xpath = "//li[@class='orb-nav-sport']")
    private WebElement sportPage;

    public String clickOnNewsPageButton() {
        newsPage.click();
        driver.getWindowHandle();
        String newsURL = driver.switchTo().window(driver.getWindowHandle()).getCurrentUrl();
        return newsURL;
    }

    public String clickOnSportPageButton() {
        sportPage.click();
        driver.getWindowHandle();
        String sportURL = driver.switchTo().window(driver.getWindowHandle()).getCurrentUrl();
        return sportURL;
    }
}
