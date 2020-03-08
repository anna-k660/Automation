package page_object_hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteWebForm extends PageObject {
    CompleteWebForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id='job-title']")
    private WebElement jobTitle;

    @FindBy(xpath = "//*[@id='radio-button-1']")
    private WebElement radioButtonHighSchool;

    @FindBy(xpath = "//*[@id='radio-button-2']")
    private WebElement radioButtonCollege;

    @FindBy(xpath = "//*[@id='radio-button-3']")
    private WebElement radioButtonGradSchool;

    @FindBy(xpath = "//*[@id='checkbox-1']")
    private WebElement checkboxMale;
    @FindBy(xpath = "//*[@id='checkbox-2']")
    private WebElement checkboxFemale;
    @FindBy(xpath = "//*[@id='checkbox-3']")
    private WebElement checkboxNoSay;

    @FindBy(xpath = "//*[@id='select-menu']")
    private WebElement selectYearExperience;

    @FindBy(xpath = "//*[@value='1']")
    private WebElement experience;


    @FindBy(xpath = "//*[@id='datepicker']")
    private WebElement selectDate;

    @FindBy(xpath = "//*[@role='button']")
    private WebElement submit;

    @FindBy(xpath = "//h1[@align='center']")
    private WebElement thanks;


    public void enterFirstLastName(String firstName, String last) {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(last);
    }

    public void enterJobTitle(String jobTitle) {
        this.jobTitle.sendKeys(jobTitle);
    }

    public void clickRadioButtonsEducationBox() {
        radioButtonHighSchool.click();
        radioButtonCollege.click();
        radioButtonGradSchool.click();
    }

    public void clickCheckboxSex() {
        checkboxFemale.click();
        checkboxMale.click();
        checkboxNoSay.click();
    }

    public void clickYearOfExperience() {
        selectYearExperience.click();
        experience.click();
    }

    public void enterDate(String date) {
        this.selectDate.sendKeys(date);
    }

    public void submit() {
        submit.click();
    }

    public String thanks() {
        return this.thanks.getText();
    }
}
