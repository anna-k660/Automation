import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAssertions {
    @Test
    public void testcaseVerifyHomePageTitle(){
        System.setProperty("webdriver.chrome.driver","C:\\webDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://youtube.com/");
        Assert.assertEquals(driver.getTitle(), "Youtube", "Wrong homepage name");
    }
    @Test
    public void test1AssertEquals(){
        String testWord = "TWO";
        Assert.assertEquals(testWord, "One", "Wrong word" );
    }
    @Test
    public void test2AssertEqualsBoolean(){
        int num = 5;
        Assert.assertEquals(num >= 0, true, "Negative value");
    }
    @Test
    public void test3AssertTrueFalse() {
        int num = 5;
       Assert.assertTrue(num >= 0, "Negative value: ");
        Assert.assertFalse(num < 0, "Positive value");

    }

}
