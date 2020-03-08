package page_object_hw;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

public class TestButtons {
    private static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void openPageButtons() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://formy-project.herokuapp.com/buttons");
    }

    @Test
    public void testClickButtons() {
        ButtonsForm buttons = new ButtonsForm(driver);
        buttons.clickButton();
    }

}
