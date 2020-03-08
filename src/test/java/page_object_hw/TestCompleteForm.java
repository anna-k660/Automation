package page_object_hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_object_model_practice.SignUpPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class TestCompleteForm {
    private static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void openPageCompleteForm() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://formy-project.herokuapp.com/form");
    }

    @Test
    public void testForm() {
        CompleteWebForm form = new CompleteWebForm(driver);
        form.enterFirstLastName("John", "Smith");
        form.enterJobTitle("Driver");
        form.clickRadioButtonsEducationBox();
        form.clickCheckboxSex();
        form.clickYearOfExperience();
        form.enterDate("05/15/2020");
        form.submit();
        String thanksPage = driver.getWindowHandle();
        driver.switchTo().window(thanksPage);
        Assert.assertEquals(form.thanks(), "Thanks for submitting your form");
    }

}
