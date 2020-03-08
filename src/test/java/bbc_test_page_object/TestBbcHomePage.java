package bbc_test_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBbcHomePage {
    private static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void openBbc() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bbc.com/");
    }

    @Test
    public void checkClicksOnMenuIcons() {
        HomePage linkOnMenuHomePage = new HomePage(driver);
        Assert.assertEquals(linkOnMenuHomePage.clickOnNewsPageButton(),
                "https://www.bbc.com/news", "Link must be redirect on News Page");

        Assert.assertEquals(linkOnMenuHomePage.clickOnSportPageButton(),
                "https://www.bbc.com/sport", "Link must be redirect on Sport Page");
    }


}
