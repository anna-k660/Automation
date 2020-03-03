package bbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class task1_bbc {
    WebDriver chromeDriver = new ChromeDriver();

    @Test
    public void checkClickOnNewsMenusOnBBC() {
        chromeDriver.get("https://www.bbc.com/");
        WebElement openNewsButtonOnNavigationMenu = chromeDriver.findElement
                (By.xpath("//li[@class='orb-nav-newsdotcom']"));

        openNewsButtonOnNavigationMenu.click();
        String newsPage = chromeDriver.getWindowHandle();

        WebElement headlineArticle = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//h3[@class='gs-c-promo-heading__title gel-paragon-bold nw-o-link-split__text']"));

        Assert.assertEquals(headlineArticle.getText(), "Saudi Arabia bars pilgrims as virus cases spread",
                "Title of article does not match with adjusted text ");
    }


    @Test
    public void getTitlesOfSecondaryArticlesOnTheNewsPage() {
        chromeDriver.get("https://www.bbc.com/news");

        List<WebElement> secondaryArticles = chromeDriver.findElements(By.xpath
                ("//div[@class='gs-c-promo nw-c-promo gs-o-faux-block-link gs-u-pb gs-u-pb+@m nw-p-default" +
                        " gs-c-promo--inline gs-c-promo--stacked@m nw-u-w-auto gs-c-promo--flex']" +
                        "//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text']"));

        for (int i = 0; i < secondaryArticles.size(); i++) {
            System.out.println("Title text: " + secondaryArticles.get(i).getText());
        }
    }

    @Test
    public void testSearchCategoryLinkAndCheckSearchResults() {
        chromeDriver.get("https://www.bbc.com/news");

        WebElement categoryLink = chromeDriver.findElement(By.xpath("//a[@class='gs-c-section-link gs-c-section-link--truncate nw-c-section-link" +
                " nw-o-link nw-o-link--no-visited-state']" +
                "//span[@aria-hidden='true']"));
        String textCategoryLink = categoryLink.getText();

        WebElement searchForm = chromeDriver.findElement(By.id("orb-search-q"));
        searchForm.sendKeys(textCategoryLink);

        WebElement searchButton = chromeDriver.findElement(By.id("orb-search-button"));
        searchButton.click();

        String pageWithSearchResults = chromeDriver.getWindowHandle();

        WebElement firstSearchResult = chromeDriver.switchTo().window(pageWithSearchResults).findElement
                (By.xpath("//li[@data-result-number='1']//h1/a"));
        Assert.assertTrue(firstSearchResult.getText().contains(textCategoryLink));
    }

}
