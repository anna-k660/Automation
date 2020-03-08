package bbc_test_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class NewsPage extends PageObject {
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[@class='gs-c-promo-heading__title gel-paragon-bold nw-o-link-split__text']")
    private WebElement headlineArticle;

    @FindBy(xpath = "//div[@class='gs-c-promo nw-c-promo gs-o-faux-block-link" +
            " gs-u-pb gs-u-pb+@m nw-p-default gs-c-promo--inline gs-c-promo--stacked@m nw-u-w-auto gs-c-promo--flex']" +
            "//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text']")
    private List<WebElement> secondaryArticles;

    @FindBy(id = "orb-search-q")
    WebElement searchForm;

    @FindBy(id = "orb-search-button")
    WebElement searchButton;

    @FindBy(xpath = "(//li[@class='nw-c-promo-meta']//span)[5]")
    WebElement categoryLink;

    @FindBy(xpath = "//li[@data-result-number='1']//h1/a")
    WebElement searchResult;

    public String findHeadlineArticleTitle() {
        return headlineArticle.getText();
    }

    public String[] getHeadlineArticleTitle() {
        String[] headlines = new String[secondaryArticles.size()];
        for (int i = 0; i < secondaryArticles.size(); i++) {
            headlines[i] = secondaryArticles.get(i).getText();
            System.out.println("Title text: " + secondaryArticles.get(i).getText());
        }
        return headlines;
    }

    public String findCategoryLink() {
        return categoryLink.getText();
    }

    public String searchText() {
        searchForm.sendKeys(categoryLink.getText());
        searchButton.click();
        driver.switchTo().window(driver.getWindowHandle());
        return searchResult.getText();
    }

}
