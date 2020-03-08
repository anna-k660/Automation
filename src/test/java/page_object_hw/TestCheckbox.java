package page_object_hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCheckbox {

    private static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void openPageCheckbox() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @Test
    public void testClickCheckbox() {
        CheckboxForm checkbox = new CheckboxForm(driver);
        checkbox.clickCheckbox();
    }
}
