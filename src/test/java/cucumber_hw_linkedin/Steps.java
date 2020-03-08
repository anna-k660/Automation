package cucumber_hw_linkedin;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class Steps {

    WebDriver driver;

    @Given("^Open the GoogleChrome and navigate to https://www.linkedin.com$")
    public void openLinkedin() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.linkedin.com/");
    }


    @When("^Enter the incorrect Email and Password$")
    public void enterEmailAndPassword() {
        String emailLogin = "//*[@class='input__field input__field--with-label'][@type='text']";
        String password = "//*[@class='input__field input__field--with-label'][@type='password']";
        driver.findElement(By.xpath(emailLogin)).sendKeys("johnSmith.gmail.com");
        driver.findElement(By.xpath(password)).sendKeys("123john");

    }

    @And("^Press button \"Sing in\"$")
    public void clickSingInButton() {
        driver.findElement(By.xpath("//*[@aria-label='i18n_sign-in']")).click();

    }

    @Then("^SingIn page should be open$")
    public void openSingInButton() {
        driver.getWindowHandle();
        driver.switchTo().window(driver.getWindowHandle());
        String singInURL = driver.getCurrentUrl();
        Assert.assertEquals(singInURL, "https://www.linkedin.com/uas/login-submit");
    }

}
