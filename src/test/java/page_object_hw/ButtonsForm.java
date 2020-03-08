package page_object_hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class ButtonsForm extends PageObject {
    public ButtonsForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary']")
    private WebElement primaryButton;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-success']")
    private WebElement successButton;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-info']")
    private WebElement infoButton;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-warning']")
    private WebElement warningButton;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-danger']")
    private WebElement dangerButton;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-link']")
    private WebElement linkButton;

    @FindBy(xpath = "//div[@aria-label='Basic example']/button" +
            "[@class='btn btn-lg btn-primary']")
    private WebElement leftButton;

    @FindBy(xpath = "//div[@aria-label='Basic example']/button[2]" +
            "[@class='btn btn-lg btn-primary']")
    private WebElement middleButton;

    @FindBy(xpath = "//div[@aria-label='Basic example']/button[3]" +
            "[@class='btn btn-lg btn-primary']")
    private WebElement rightButton;

    @FindBy(xpath = "//div[@aria-label='Button group with nested dropdown']" +
            "/button[@class='btn btn-lg btn-primary']")
    private WebElement oneButton;

    @FindBy(xpath = "//div[@aria-label='Button group with nested dropdown']" +
            "/button[2][@class='btn btn-lg btn-primary']")
    private WebElement twoButton;

    @FindBy(xpath = "//button[@id='btnGroupDrop1']")
    private WebElement dropdownButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[@class='dropdown-item']")
    private WebElement dropdownButtonLink1;

    @FindBy(xpath = "(//div[@class='dropdown-menu show']/a[@class='dropdown-item'])[2]")
    private WebElement dropdownButtonLink2;

    public void clickButton() {
        primaryButton.click();
        successButton.click();
        infoButton.click();
        warningButton.click();
        dangerButton.click();
        linkButton.click();
        leftButton.click();
        middleButton.click();
        oneButton.click();
        twoButton.click();
        dropdownButton.click();
        dropdownButtonLink1.click();
        dropdownButton.click();
        dropdownButtonLink2.click();
    }
}
