package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckboxTest {
    @DataProvider(name = "css-test")
    public static Object[][] locatorsCss() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"}
        };
    }

    @DataProvider(name = "xPath-test")
    public static Object[][] locatorsXpath() {
        return new Object[][]{
                {"//*[@id='checkbox-1']"},
                {"//*[@id='checkbox-2']"},
                {"//*[@id='checkbox-3']"}
        };
    }

    WebDriver chromeDriver = new ChromeDriver();

    @Test(dataProvider = "css-test")
    public void testCheckboxWithCssLocators(String locatorsCss) {
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkBox = chromeDriver.findElement(By.cssSelector(locatorsCss));
        checkBox.click();
    }

    @Test(dataProvider = "xPath-test")
    public void testCheckboxWithXpathLocators(String locatorsXpath) {
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkBox = chromeDriver.findElement(By.xpath(locatorsXpath));
        checkBox.click();
    }
}
