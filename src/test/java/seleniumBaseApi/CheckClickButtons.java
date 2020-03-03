package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CheckClickButtons {
    WebDriver chromeDriver = new ChromeDriver();

    @Test(priority = 1)
    public void testClickButtonPrimary() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        WebElement primaryButton = chromeDriver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']"));
        primaryButton.click();
    }

    @Test(priority = 2)
    public void testClickButtonSuccess() {
        WebElement successButton = chromeDriver.findElement(By.xpath("//button[@class='btn btn-lg btn-success']"));
        successButton.click();
    }

    @Test(priority = 3)
    public void testClickInfoButton() {
        WebElement infoButton = chromeDriver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']"));
        infoButton.click();
    }

    @Test(priority = 4)
    public void testClickWarningButton() {
        WebElement warningButton = chromeDriver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']"));
        warningButton.click();
    }

    @Test(priority = 5)
    public void testClickDangerButton() {
        WebElement dangerButton = chromeDriver.findElement(By.xpath("//button[@class='btn btn-lg btn-danger']"));
        dangerButton.click();

    }

    @Test(priority = 6)
    public void testClickLinkButton() {
        WebElement linkButton = chromeDriver.findElement(By.xpath("//button[@class='btn btn-lg btn-link']"));
        linkButton.click();
    }

    @Test(priority = 7)
    public void testClickLeftButton() {
        WebElement leftButton = chromeDriver.findElement(By.xpath("//div[@aria-label='Basic example']/button" +
                "[@class='btn btn-lg btn-primary']"));
        leftButton.click();
    }

    @Test(priority = 8)
    public void testClickMiddleButton() {
        WebElement middleButton = chromeDriver.findElement(By.xpath("//div[@aria-label='Basic example']/button[2]" +
                "[@class='btn btn-lg btn-primary']"));
        middleButton.click();
    }

    @Test(priority = 9)
    public void testClickRightButton() {
        WebElement rightButton = chromeDriver.findElement(By.xpath("//div[@aria-label='Basic example']/button[3]" +
                "[@class='btn btn-lg btn-primary']"));
        rightButton.click();
    }

    @Test(priority = 10)
    public void testClickOneButton() {
        WebElement oneButton = chromeDriver.findElement(By.xpath("//div[@aria-label='Button group with nested dropdown']" +
                "/button[@class='btn btn-lg btn-primary']"));
        oneButton.click();
    }

    @Test(priority = 11)
    public void testClickTwoButton() {
        WebElement twoButton = chromeDriver.findElement(By.xpath("//div[@aria-label='Button group with nested dropdown']" +
                "/button[2][@class='btn btn-lg btn-primary']"));
        twoButton.click();
    }

    @Test(priority = 12)
    public void testClickDropdownLink1Button() {
        WebElement dropdownButton = chromeDriver.findElement(By.xpath
                ("//button[@id='btnGroupDrop1']"));
        dropdownButton.click();

        WebElement dropdownButtonLink1 = chromeDriver.findElement(By.xpath
                ("//div[@class='dropdown-menu show']/a[@class='dropdown-item']"));
        dropdownButtonLink1.click();
    }

    @Test(priority = 13)
    public void testClickDropdownLink2Button() {
        WebElement dropdownButton = chromeDriver.findElement(By.xpath
                ("//button[@id='btnGroupDrop1']"));
        dropdownButton.click();

        WebElement dropdownButtonLink2 = chromeDriver.findElement(By.xpath
                ("//div[@class='dropdown-menu show']/a[2][@class='dropdown-item']"));
        dropdownButtonLink2.click();
    }
}
