package page_object_hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class CheckboxForm extends PageObject {
    public CheckboxForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkbox-1")
    private WebElement checkboxCss1;
    @FindBy(css = "#checkbox-2")
    private WebElement checkboxCss2;
    @FindBy(css = "#checkbox-3")
    private WebElement checkboxCss3;
    @FindBy(xpath = "//*[@id='checkbox-1']")
    private WebElement checkboxXpath1;
    @FindBy(xpath = "//*[@id='checkbox-2']")
    private WebElement checkboxXpath2;
    @FindBy(xpath = "//*[@id='checkbox-3']")
    private WebElement checkboxXpath3;


    public void clickCheckbox() {
        checkboxCss1.click();
        checkboxCss2.click();
        checkboxCss3.click();
        checkboxXpath1.click();
        checkboxXpath2.click();
        checkboxXpath3.click();
    }
}
