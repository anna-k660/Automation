package bbc_test_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestBbcNewsPage {
    private static WebDriver driver = new ChromeDriver();

    @DataProvider(name = "headlinesOfSecondaryArticlesOnNewsBBC")
    public static Object[][] headlinesSecondaryArticles() {
        return new Object[][]{
                {"California declares emergency over coronavirus",
                        "Toddler missing in Delhi riots restored to family",
                        "Dirty streaming: The internet's big secret",
                        "Katy Perry reveals pregnancy in music video"},
        };
    }

    @BeforeTest
    public static void openNewsBbc() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bbc.com/news");
    }

    @Test
    public void checkMainTitleOnNewsBbcPage() {
        NewsPage newsBbcPage = new NewsPage(driver);
        String mainTitleOnNewsBbcPage = newsBbcPage.findHeadlineArticleTitle();
        Assert.assertEquals(mainTitleOnNewsBbcPage, "California declares emergency over coronavirus",
                "Title on the main article in the News page is incorrect");
    }

    @Test(dataProvider = "headlinesOfSecondaryArticlesOnNewsBBC")
    public void checkSecondaryArticlesHeadlines(String[] expectedHeadlines) {
        NewsPage newsBbcPage = new NewsPage(driver);
        Assert.assertTrue(Arrays.equals(expectedHeadlines, newsBbcPage.getHeadlineArticleTitle()));
    }

    @Test
    public void testSearchFormOnNewsPage() {
        NewsPage searchForm = new NewsPage(driver);
        String categoryLink = searchForm.findCategoryLink();
        Assert.assertTrue(searchForm.searchText().contains(categoryLink));
    }
}
